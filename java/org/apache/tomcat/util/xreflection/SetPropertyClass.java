package org.apache.tomcat.util.xreflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

import org.apache.tomcat.util.IntrospectionUtils;

import static org.apache.tomcat.util.xreflection.ReflectionLessCodeGenerator.getIndent;

class SetPropertyClass {

    static final String OBJECT_VAR_NAME = "o";
    static final String NAME_VAR_NAME = "name";
    static final String VALUE_VAR_NAME = "value";
    static final String SETP_VAR_NAME = "invokeSetProperty";

    private final SetPropertyClass parent;
    private final Class<?> clazz;
    private Set<SetPropertyClass> children = new HashSet<>();
    private Set<ReflectionProperty> properties = new HashSet<>();
    private final boolean isAbstract;
    private final Method genericSetPropertyMethod;
    private final Method genericGetPropertyMethod;

    SetPropertyClass(Class<?> clazz, SetPropertyClass parent) {
        this.clazz = clazz;
        this.parent = parent;
        this.isAbstract = Modifier.isAbstract(clazz.getModifiers());
        Method classSetter, classGetter;
        try {
            classSetter = clazz.getDeclaredMethod("setProperty", String.class, String.class);
        } catch (NoSuchMethodException e) {
            try {
                classSetter = clazz.getDeclaredMethod("setProperty", String.class, Object.class);
            } catch (NoSuchMethodException x) {
                classSetter = null;
            }
        }
        try {
            classGetter = clazz.getDeclaredMethod("getProperty", String.class);
        } catch (NoSuchMethodException e) {
            classGetter = null;
        }
        genericSetPropertyMethod = classSetter;
        genericGetPropertyMethod = classGetter;
    }

    boolean isAbstract() {
        return isAbstract;
    }

    void addSubClass(SetPropertyClass clazz) {
        this.children.add(clazz);
    }

    boolean isBaseClass() {
        return parent == null;
    }

    public Set<SetPropertyClass> getChildren() {
        return children;
    }

    public Set<ReflectionProperty> getProperties() {
        return properties;
    }

    public Method getGenericSetPropertyMethod() {
        return genericSetPropertyMethod;
    }

    public Method getGenericGetPropertyMethod() {
        return genericGetPropertyMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetPropertyClass that = (SetPropertyClass) o;

        return clazz.equals(that.clazz);
    }

    @Override
    public int hashCode() {
        return clazz.hashCode();
    }

    public SetPropertyClass getParent() {
        return parent;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SetPropertyClass{");
        sb.append("clazz=").append(clazz.getName());
        sb.append('}');
        return sb.toString();
    }

    public void addProperty(ReflectionProperty property) {
        properties.add(property);
    }



    public String generateSetPropertyMethod(ReflectionProperty property) {
        //this property has a setProperty method
        if (property.hasSetPropertySetter()) {
            return "((" + this.getClazz().getName().replace('$','.') + ")" + OBJECT_VAR_NAME + ")." +
                property.getSetMethod().getName() + "(" + NAME_VAR_NAME + ", " + VALUE_VAR_NAME + ");";
        }

        //direct setter
        if (property.hasSetter()) {
            return "((" + this.getClazz().getName().replace('$','.') + ")" + OBJECT_VAR_NAME + ")." +
                property.getSetMethod().getName() + "(" + property.getConversion(VALUE_VAR_NAME) + ");";
        }
        return null;
    }

    public String generateGetPropertyMethod(ReflectionProperty property) {
        //this property has a getProperty method
        if (property.hasGetPropertyGetter()) {
            return "result = ((" + this.getClazz().getName().replace('$','.') + ")" + OBJECT_VAR_NAME + ")." +
                property.getGetMethod().getName() + "(" + NAME_VAR_NAME + ");";
        }

        //direct getter
        if (property.hasGetter()) {
            return "result = ((" + this.getClazz().getName().replace('$','.') + ")" + OBJECT_VAR_NAME + ")." +
                property.getGetMethod().getName() + "();";
        }
        return null;
    }

    public String generateSetPropertyForMethod() {
        StringBuilder code = new StringBuilder(getIndent(1))
            .append(generatesSetPropertyForMethodHeader())
            .append(System.lineSeparator())
            .append(getIndent(2))
            .append("switch (")
            .append(NAME_VAR_NAME)
            .append(") {")
            .append(System.lineSeparator());

        //case statements for each property
        for (ReflectionProperty property : getProperties()) {
            String invocation = generateSetPropertyMethod(property);
            if (invocation != null) {
                code.append(getIndent(3))
                    .append("case \"")
                    .append(property.getPropertyName())
                    .append("\" : ")
                    .append(System.lineSeparator());

                code.append(getIndent(4))
                    .append(invocation)
                    .append(System.lineSeparator())
                    .append(getIndent(4))
                    .append("return true;")
                    .append(System.lineSeparator())
                ;

            } else {
                code.append(getIndent(3))
                    .append("//no set" + IntrospectionUtils.capitalize(property.getPropertyName())+ " method found on this class")
                    .append(System.lineSeparator())
                    ;
            }
        }



        //end switch statement
        code.append(getIndent(2))
            .append("}")
            .append(System.lineSeparator());

        //we have a generic setProperty(String, String) method, invoke it
        if (getGenericSetPropertyMethod() != null) {
            ReflectionProperty p = new ReflectionProperty(
                clazz.getName(),
                "property",
                String.class,
                getGenericSetPropertyMethod(),
                null
            );
           code.append(getIndent(2))
               .append("if (")
               .append(SETP_VAR_NAME)
               .append(") {")
               .append(System.lineSeparator())
               .append(getIndent(3))
               .append(generateSetPropertyMethod(p))
               .append(System.lineSeparator())
               .append(getIndent(3))
               .append("return true;")
               .append(System.lineSeparator())
               .append(getIndent(2))
               .append("}")
               .append(System.lineSeparator());
        }

        //invoke parent or return false
        code.append(getIndent(2))
            .append("return ")
            .append(getSetPropertyForExitStatement())
            .append(System.lineSeparator())
            .append(getIndent(1))
            .append("}");

        return code.toString();
    }

    private String getSetPropertyForExitStatement() {

        return (getParent() != null) ?
            //invoke the parent if we have one
            getParent().generateParentSetPropertyForMethodInvocation() :
            //if we invoke setProperty, return true, return false otherwise
            getGenericSetPropertyMethod() != null ? "true;" : "false;";
    }

    public String generateInvocationSetForPropertyCaseStatement(int level) {
        StringBuilder code = new StringBuilder(getIndent(level))
            .append("case \"")
            .append(getClazz().getName())
            .append("\" : ")
            .append(System.lineSeparator())
            .append(getIndent(level+1))
            .append("return ")
            .append(generateParentSetPropertyForMethodInvocation())
            .append(System.lineSeparator());
        return code.toString();
    }

    public String generateParentSetPropertyForMethodInvocation() {
        String[] classParts = clazz.getName().split("\\.|\\$");
        StringBuilder methodInvocation = new StringBuilder("setPropertyFor");
        for (String s : classParts) {
            methodInvocation.append(IntrospectionUtils.capitalize(s));
        }
        methodInvocation.append("(")
        .append(OBJECT_VAR_NAME)
            .append(", ")
            .append(NAME_VAR_NAME)
            .append(", ")
            .append(VALUE_VAR_NAME)
            .append(", ")
            .append(SETP_VAR_NAME)
            .append(");");
        return methodInvocation.toString();
    }

    public String generatesSetPropertyForMethodHeader() {
        String[] classParts = clazz.getName().split("\\.|\\$");
        StringBuilder methodInvocation = new StringBuilder("public static boolean setPropertyFor");
        for (String s : classParts) {
            methodInvocation.append(IntrospectionUtils.capitalize(s));
        }
        methodInvocation.append("(Object ")
            .append(OBJECT_VAR_NAME)
            .append(", String ")
            .append(NAME_VAR_NAME)
            .append(", String ")
            .append(VALUE_VAR_NAME)
            .append(", boolean ")
            .append(SETP_VAR_NAME)
            .append(") {");
        return methodInvocation.toString();
    }

    public String generateInvocationGetForPropertyCaseStatement(int level) {
        StringBuilder code = new StringBuilder(getIndent(level))
            .append("case \"")
            .append(getClazz().getName())
            .append("\" : ")
            .append(System.lineSeparator())
            .append(getIndent(level+1))
            .append("result = ")
            .append(generateParentGetPropertyForMethodInvocation())
            .append(System.lineSeparator())
            .append(getIndent(level+1))
            .append("break;")
            .append(System.lineSeparator())
            ;
        return code.toString();
    }

    public String generateParentGetPropertyForMethodInvocation() {
        String[] classParts = clazz.getName().split("\\.|\\$");
        StringBuilder methodInvocation = new StringBuilder("getPropertyFor");
        for (String s : classParts) {
            methodInvocation.append(IntrospectionUtils.capitalize(s));
        }
        methodInvocation.append("(")
            .append(OBJECT_VAR_NAME)
            .append(", ")
            .append(NAME_VAR_NAME)
            .append(");");
        return methodInvocation.toString();
    }

    public String generatesGetPropertyForMethodHeader() {
        String[] classParts = clazz.getName().split("\\.|\\$");
        StringBuilder methodInvocation = new StringBuilder("public static Object getPropertyFor");
        for (String s : classParts) {
            methodInvocation.append(IntrospectionUtils.capitalize(s));
        }
        methodInvocation.append("(Object ")
            .append(OBJECT_VAR_NAME)
            .append(", String ")
            .append(NAME_VAR_NAME)
            .append(") {");
        return methodInvocation.toString();
    }

    private String getGetPropertyForExitStatement() {
        if (getParent() != null) {
            return getParent().generateParentGetPropertyForMethodInvocation();
        }
        return "null;";
    }


    public String generateGetPropertyForMethod() {
        StringBuilder code = new StringBuilder(getIndent(1))
            .append(generatesGetPropertyForMethodHeader())
            .append(System.lineSeparator())
            .append(getIndent(2))
            .append("Object result = null;")
            .append(System.lineSeparator())
            .append(getIndent(2))
            .append("switch (")
            .append(NAME_VAR_NAME)
            .append(") {")
            .append(System.lineSeparator());

        //case statements for each property
        for (ReflectionProperty property : getProperties()) {
            String invocation = generateGetPropertyMethod(property);
            if (invocation != null) {
                code.append(getIndent(3))
                    .append("case \"")
                    .append(property.getPropertyName())
                    .append("\" : ")
                    .append(System.lineSeparator());

                code.append(getIndent(4))
                    .append(invocation)
                    .append(System.lineSeparator())
                    .append(getIndent(4))
                    .append("break;")
                    .append(System.lineSeparator())
                ;

            } else {
                code.append(getIndent(3))
                    .append("//no get" + IntrospectionUtils.capitalize(property.getPropertyName())+ " method found on this class")
                    .append(System.lineSeparator())
                ;
            }
        }

        //end switch statement
        code.append(getIndent(2))
            .append("}")
            .append(System.lineSeparator());

        //invoke parent or return null
        code.append(getIndent(2))
            .append("if (result == null) {")
            .append(System.lineSeparator())
            .append(getIndent(3))
            .append("result = ")
            .append(getGetPropertyForExitStatement())
            .append(System.lineSeparator())
            .append(getIndent(2))
            .append("}")
            .append(System.lineSeparator())
            ;

        //we have a generic getProperty(String, String) method, invoke it
        if (getGenericGetPropertyMethod() != null) {
            ReflectionProperty p = new ReflectionProperty(
                clazz.getName(),
                "property",
                String.class,
                null,
                getGenericGetPropertyMethod()
            );
            code.append(getIndent(2))
                .append("if (result == null) {")
                .append(System.lineSeparator())
                .append(getIndent(3))
                .append(generateGetPropertyMethod(p))
                .append(System.lineSeparator())
                .append(getIndent(2))
                .append("}")
                .append(System.lineSeparator());
        }
        code.append(getIndent(2))
            .append("return result;")
            .append(System.lineSeparator())
            .append(getIndent(1))
            .append("}")
            .append(System.lineSeparator());



        return code.toString();
    }
}
