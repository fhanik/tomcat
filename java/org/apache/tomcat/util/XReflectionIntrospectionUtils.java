package org.apache.tomcat.util;
public class XReflectionIntrospectionUtils {
    public static java.net.InetAddress getInetAddress(String value) {
        try {
            return java.net.InetAddress.getByName(value);
        } catch (java.net.UnknownHostException x) { throw new RuntimeException(x); }
    }

    public static Object getPropertyInternal(Object o, String name) {
        Class<?> checkThisClass = o.getClass();
        Object result = null;
        while (checkThisClass != Object.class && result == null) {
            switch (checkThisClass.getName()) {
                case "org.apache.tomcat.util.descriptor.web.ContextResource" :
                    result = getPropertyForOrgApacheTomcatUtilDescriptorWebContextResource(o, name);
                    break;
                case "org.apache.tomcat.util.descriptor.web.ResourceBase" :
                    result = getPropertyForOrgApacheTomcatUtilDescriptorWebResourceBase(o, name);
                    break;
                case "org.apache.tomcat.util.modeler.ParameterInfo" :
                    result = getPropertyForOrgApacheTomcatUtilModelerParameterInfo(o, name);
                    break;
                case "org.apache.tomcat.util.modeler.OperationInfo" :
                    result = getPropertyForOrgApacheTomcatUtilModelerOperationInfo(o, name);
                    break;
                case "org.apache.tomcat.util.modeler.AttributeInfo" :
                    result = getPropertyForOrgApacheTomcatUtilModelerAttributeInfo(o, name);
                    break;
                case "org.apache.tomcat.util.modeler.FeatureInfo" :
                    result = getPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name);
                    break;
                case "org.apache.catalina.core.AprLifecycleListener" :
                    result = getPropertyForOrgApacheCatalinaCoreAprLifecycleListener(o, name);
                    break;
                case "org.apache.tomcat.util.modeler.ManagedBean" :
                    result = getPropertyForOrgApacheTomcatUtilModelerManagedBean(o, name);
                    break;
                case "org.apache.catalina.filters.RestCsrfPreventionFilter" :
                    result = getPropertyForOrgApacheCatalinaFiltersRestCsrfPreventionFilter(o, name);
                    break;
                case "org.apache.catalina.filters.AddDefaultCharsetFilter" :
                    result = getPropertyForOrgApacheCatalinaFiltersAddDefaultCharsetFilter(o, name);
                    break;
                case "org.apache.catalina.connector.Connector" :
                    result = getPropertyForOrgApacheCatalinaConnectorConnector(o, name);
                    break;
                case "org.apache.catalina.valves.AccessLogValve" :
                    result = getPropertyForOrgApacheCatalinaValvesAccessLogValve(o, name);
                    break;
                case "org.apache.catalina.core.StandardServer" :
                    result = getPropertyForOrgApacheCatalinaCoreStandardServer(o, name);
                    break;
                case "org.apache.catalina.realm.UserDatabaseRealm" :
                    result = getPropertyForOrgApacheCatalinaRealmUserDatabaseRealm(o, name);
                    break;
                case "org.apache.catalina.core.StandardService" :
                    result = getPropertyForOrgApacheCatalinaCoreStandardService(o, name);
                    break;
                case "org.apache.catalina.core.StandardContext" :
                    result = getPropertyForOrgApacheCatalinaCoreStandardContext(o, name);
                    break;
                case "org.apache.catalina.core.StandardHost" :
                    result = getPropertyForOrgApacheCatalinaCoreStandardHost(o, name);
                    break;
                case "org.apache.catalina.core.StandardEngine" :
                    result = getPropertyForOrgApacheCatalinaCoreStandardEngine(o, name);
                    break;
                case "org.apache.catalina.loader.ParallelWebappClassLoader" :
                    result = getPropertyForOrgApacheCatalinaLoaderParallelWebappClassLoader(o, name);
                    break;
                case "java.net.URLClassLoader" :
                    result = getPropertyForJavaNetURLClassLoader(o, name);
                    break;
                case "java.security.SecureClassLoader" :
                    result = getPropertyForJavaSecuritySecureClassLoader(o, name);
                    break;
                case "org.apache.coyote.ajp.AjpNioProtocol" :
                    result = getPropertyForOrgApacheCoyoteAjpAjpNioProtocol(o, name);
                    break;
                case "org.apache.coyote.ajp.AjpNio2Protocol" :
                    result = getPropertyForOrgApacheCoyoteAjpAjpNio2Protocol(o, name);
                    break;
                case "org.apache.coyote.ajp.AjpAprProtocol" :
                    result = getPropertyForOrgApacheCoyoteAjpAjpAprProtocol(o, name);
                    break;
                case "org.apache.coyote.http11.Http11AprProtocol" :
                    result = getPropertyForOrgApacheCoyoteHttp11Http11AprProtocol(o, name);
                    break;
                case "org.apache.coyote.http11.Http11Nio2Protocol" :
                    result = getPropertyForOrgApacheCoyoteHttp11Http11Nio2Protocol(o, name);
                    break;
                case "org.apache.coyote.http11.Http11NioProtocol" :
                    result = getPropertyForOrgApacheCoyoteHttp11Http11NioProtocol(o, name);
                    break;
                case "org.apache.tomcat.util.net.SocketProperties" :
                    result = getPropertyForOrgApacheTomcatUtilNetSocketProperties(o, name);
                    break;
                case "org.apache.tomcat.util.net.NioSelectorPool" :
                    result = getPropertyForOrgApacheTomcatUtilNetNioSelectorPool(o, name);
                    break;
                case "org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations$Property" :
                    result = getPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProperty(o, name);
                    break;
                case "org.apache.catalina.authenticator.jaspic.SimpleAuthConfigProvider" :
                    result = getPropertyForOrgApacheCatalinaAuthenticatorJaspicSimpleAuthConfigProvider(o, name);
                    break;
                case "org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations$Provider" :
                    result = getPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProvider(o, name);
                    break;
                case "org.apache.tomcat.util.net.NioEndpoint" :
                    result = getPropertyForOrgApacheTomcatUtilNetNioEndpoint(o, name);
                    break;
                case "org.apache.tomcat.util.net.Nio2Endpoint" :
                    result = getPropertyForOrgApacheTomcatUtilNetNio2Endpoint(o, name);
                    break;
                case "org.apache.tomcat.util.net.AprEndpoint" :
                    result = getPropertyForOrgApacheTomcatUtilNetAprEndpoint(o, name);
                    break;
            }
            checkThisClass = checkThisClass.getSuperclass();
        }
        return result;
    }
    public static Object getPropertyForOrgApacheTomcatUtilDescriptorWebContextResource(Object o, String name) {
        Object result = null;
        switch (name) {
            case "scope" :
                result = ((org.apache.tomcat.util.descriptor.web.ContextResource)o).getScope();
                break;
            case "closeMethod" :
                result = ((org.apache.tomcat.util.descriptor.web.ContextResource)o).getCloseMethod();
                break;
            case "closeMethodConfigured" :
                result = ((org.apache.tomcat.util.descriptor.web.ContextResource)o).getCloseMethodConfigured();
                break;
            case "auth" :
                result = ((org.apache.tomcat.util.descriptor.web.ContextResource)o).getAuth();
                break;
            case "singleton" :
                result = ((org.apache.tomcat.util.descriptor.web.ContextResource)o).getSingleton();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilDescriptorWebResourceBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilDescriptorWebResourceBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "lookupName" :
                result = ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).getLookupName();
                break;
            case "description" :
                result = ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).getDescription();
                break;
            case "name" :
                result = ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).getName();
                break;
            case "type" :
                result = ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).getType();
                break;
        }
        if (result == null) {
            result = null;
        }
        if (result == null) {
            result = ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).getProperty(name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilModelerParameterInfo(Object o, String name) {
        Object result = null;
        switch (name) {
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilModelerOperationInfo(Object o, String name) {
        Object result = null;
        switch (name) {
            case "role" :
                result = ((org.apache.tomcat.util.modeler.OperationInfo)o).getRole();
                break;
            case "returnType" :
                result = ((org.apache.tomcat.util.modeler.OperationInfo)o).getReturnType();
                break;
            case "impact" :
                result = ((org.apache.tomcat.util.modeler.OperationInfo)o).getImpact();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilModelerAttributeInfo(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getWriteable method found on this class
            case "getMethod" :
                result = ((org.apache.tomcat.util.modeler.AttributeInfo)o).getGetMethod();
                break;
            case "setMethod" :
                result = ((org.apache.tomcat.util.modeler.AttributeInfo)o).getSetMethod();
                break;
            //no getReadable method found on this class
            case "displayName" :
                result = ((org.apache.tomcat.util.modeler.AttributeInfo)o).getDisplayName();
                break;
            //no getIs method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilModelerFeatureInfo(Object o, String name) {
        Object result = null;
        switch (name) {
            case "type" :
                result = ((org.apache.tomcat.util.modeler.FeatureInfo)o).getType();
                break;
            case "description" :
                result = ((org.apache.tomcat.util.modeler.FeatureInfo)o).getDescription();
                break;
            case "name" :
                result = ((org.apache.tomcat.util.modeler.FeatureInfo)o).getName();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreAprLifecycleListener(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getInstanceCreated method found on this class
            //no getAprInitialized method found on this class
            //no getAprAvailable method found on this class
            case "FIPSMode" :
                result = ((org.apache.catalina.core.AprLifecycleListener)o).getFIPSMode();
                break;
            case "SSLRandomSeed" :
                result = ((org.apache.catalina.core.AprLifecycleListener)o).getSSLRandomSeed();
                break;
            case "FIPSModeActive" :
                result = ((org.apache.catalina.core.AprLifecycleListener)o).isFIPSModeActive();
                break;
            case "useOpenSSL" :
                result = ((org.apache.catalina.core.AprLifecycleListener)o).getUseOpenSSL();
                break;
            //no getSslInitialized method found on this class
            //no getFipsModeActive method found on this class
            case "useAprConnector" :
                result = ((org.apache.catalina.core.AprLifecycleListener)o).getUseAprConnector();
                break;
            case "SSLEngine" :
                result = ((org.apache.catalina.core.AprLifecycleListener)o).getSSLEngine();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilModelerManagedBean(Object o, String name) {
        Object result = null;
        switch (name) {
            case "className" :
                result = ((org.apache.tomcat.util.modeler.ManagedBean)o).getClassName();
                break;
            case "domain" :
                result = ((org.apache.tomcat.util.modeler.ManagedBean)o).getDomain();
                break;
            case "type" :
                result = ((org.apache.tomcat.util.modeler.ManagedBean)o).getType();
                break;
            case "name" :
                result = ((org.apache.tomcat.util.modeler.ManagedBean)o).getName();
                break;
            case "group" :
                result = ((org.apache.tomcat.util.modeler.ManagedBean)o).getGroup();
                break;
            case "description" :
                result = ((org.apache.tomcat.util.modeler.ManagedBean)o).getDescription();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaFiltersRestCsrfPreventionFilter(Object o, String name) {
        Object result = null;
        switch (name) {
            case "pathsAcceptingParams" :
                result = ((org.apache.catalina.filters.RestCsrfPreventionFilter)o).getPathsAcceptingParams();
                break;
            //no getPathsDelimiter method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaFiltersCsrfPreventionFilterBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaFiltersCsrfPreventionFilterBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "denyStatus" :
                result = ((org.apache.catalina.filters.CsrfPreventionFilterBase)o).getDenyStatus();
                break;
            //no getRandomClass method found on this class
            //no getConfigProblemFatal method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaFiltersFilterBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaFiltersAddDefaultCharsetFilter(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getEncoding method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaFiltersFilterBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaFiltersFilterBase(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getConfigProblemFatal method found on this class
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaConnectorConnector(Object o, String name) {
        Object result = null;
        switch (name) {
            case "asyncTimeout" :
                result = ((org.apache.catalina.connector.Connector)o).getAsyncTimeout();
                break;
            case "discardFacades" :
                result = ((org.apache.catalina.connector.Connector)o).getDiscardFacades();
                break;
            case "useBodyEncodingForURI" :
                result = ((org.apache.catalina.connector.Connector)o).getUseBodyEncodingForURI();
                break;
            case "enableLookups" :
                result = ((org.apache.catalina.connector.Connector)o).getEnableLookups();
                break;
            case "localPort" :
                result = ((org.apache.catalina.connector.Connector)o).getLocalPort();
                break;
            case "parseBodyMethods" :
                result = ((org.apache.catalina.connector.Connector)o).getParseBodyMethods();
                break;
            //no getObjectNameKeyProperties method found on this class
            case "maxParameterCount" :
                result = ((org.apache.catalina.connector.Connector)o).getMaxParameterCount();
                break;
            case "allowTrace" :
                result = ((org.apache.catalina.connector.Connector)o).getAllowTrace();
                break;
            case "portWithOffset" :
                result = ((org.apache.catalina.connector.Connector)o).getPortWithOffset();
                break;
            case "redirectPort" :
                result = ((org.apache.catalina.connector.Connector)o).getRedirectPort();
                break;
            case "URIEncoding" :
                result = ((org.apache.catalina.connector.Connector)o).getURIEncoding();
                break;
            case "protocol" :
                result = ((org.apache.catalina.connector.Connector)o).getProtocol();
                break;
            case "maxSavePostSize" :
                result = ((org.apache.catalina.connector.Connector)o).getMaxSavePostSize();
                break;
            case "useIPVHosts" :
                result = ((org.apache.catalina.connector.Connector)o).getUseIPVHosts();
                break;
            case "protocolHandlerClassName" :
                result = ((org.apache.catalina.connector.Connector)o).getProtocolHandlerClassName();
                break;
            case "encodedSolidusHandling" :
                result = ((org.apache.catalina.connector.Connector)o).getEncodedSolidusHandling();
                break;
            //no getDomainInternal method found on this class
            case "maxPostSize" :
                result = ((org.apache.catalina.connector.Connector)o).getMaxPostSize();
                break;
            case "scheme" :
                result = ((org.apache.catalina.connector.Connector)o).getScheme();
                break;
            case "secure" :
                result = ((org.apache.catalina.connector.Connector)o).getSecure();
                break;
            case "proxyName" :
                result = ((org.apache.catalina.connector.Connector)o).getProxyName();
                break;
            case "maxCookieCount" :
                result = ((org.apache.catalina.connector.Connector)o).getMaxCookieCount();
                break;
            case "proxyPort" :
                result = ((org.apache.catalina.connector.Connector)o).getProxyPort();
                break;
            case "portOffset" :
                result = ((org.apache.catalina.connector.Connector)o).getPortOffset();
                break;
            case "xpoweredBy" :
                result = ((org.apache.catalina.connector.Connector)o).getXpoweredBy();
                break;
            case "executorName" :
                result = ((org.apache.catalina.connector.Connector)o).getExecutorName();
                break;
            case "port" :
                result = ((org.apache.catalina.connector.Connector)o).getPort();
                break;
            case "redirectPortWithOffset" :
                result = ((org.apache.catalina.connector.Connector)o).getRedirectPortWithOffset();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name);
        }
        if (result == null) {
            result = ((org.apache.catalina.connector.Connector)o).getProperty(name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaValvesAccessLogValve(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getRotatable method found on this class
            case "prefix" :
                result = ((org.apache.catalina.valves.AccessLogValve)o).getPrefix();
                break;
            //no getCheckForOldLogs method found on this class
            //no getCheckExists method found on this class
            //no getBuffered method found on this class
            //no getRotationLastChecked method found on this class
            case "suffix" :
                result = ((org.apache.catalina.valves.AccessLogValve)o).getSuffix();
                break;
            case "directory" :
                result = ((org.apache.catalina.valves.AccessLogValve)o).getDirectory();
                break;
            case "encoding" :
                result = ((org.apache.catalina.valves.AccessLogValve)o).getEncoding();
                break;
            //no getDateStamp method found on this class
            case "maxDays" :
                result = ((org.apache.catalina.valves.AccessLogValve)o).getMaxDays();
                break;
            //no getRenameOnRotate method found on this class
            case "fileDateFormat" :
                result = ((org.apache.catalina.valves.AccessLogValve)o).getFileDateFormat();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaValvesAbstractAccessLogValve(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaValvesAbstractAccessLogValve(Object o, String name) {
        Object result = null;
        switch (name) {
            case "locale" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getLocale();
                break;
            case "conditionUnless" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getConditionUnless();
                break;
            case "requestAttributesEnabled" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getRequestAttributesEnabled();
                break;
            case "enabled" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getEnabled();
                break;
            //no getTlsAttributeRequired method found on this class
            case "condition" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getCondition();
                break;
            case "maxLogMessageBufferSize" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getMaxLogMessageBufferSize();
                break;
            case "ipv6Canonical" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getIpv6Canonical();
                break;
            //no getLocaleName method found on this class
            case "pattern" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getPattern();
                break;
            case "conditionIf" :
                result = ((org.apache.catalina.valves.AbstractAccessLogValve)o).getConditionIf();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaValvesValveBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaValvesValveBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "domainInternal" :
                result = ((org.apache.catalina.valves.ValveBase)o).getDomainInternal();
                break;
            //no getAsyncSupported method found on this class
            case "objectNameKeyProperties" :
                result = ((org.apache.catalina.valves.ValveBase)o).getObjectNameKeyProperties();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreStandardServer(Object o, String name) {
        Object result = null;
        switch (name) {
            case "periodicEventDelay" :
                result = ((org.apache.catalina.core.StandardServer)o).getPeriodicEventDelay();
                break;
            //no getDomainInternal method found on this class
            case "portOffset" :
                result = ((org.apache.catalina.core.StandardServer)o).getPortOffset();
                break;
            case "utilityThreads" :
                result = ((org.apache.catalina.core.StandardServer)o).getUtilityThreads();
                break;
            //no getStopAwait method found on this class
            case "serverBuilt" :
                result = ((org.apache.catalina.core.StandardServer)o).getServerBuilt();
                break;
            case "serverNumber" :
                result = ((org.apache.catalina.core.StandardServer)o).getServerNumber();
                break;
            case "serverInfo" :
                result = ((org.apache.catalina.core.StandardServer)o).getServerInfo();
                break;
            case "port" :
                result = ((org.apache.catalina.core.StandardServer)o).getPort();
                break;
            case "shutdown" :
                result = ((org.apache.catalina.core.StandardServer)o).getShutdown();
                break;
            case "portWithOffset" :
                result = ((org.apache.catalina.core.StandardServer)o).getPortWithOffset();
                break;
            //no getObjectNameKeyProperties method found on this class
            case "address" :
                result = ((org.apache.catalina.core.StandardServer)o).getAddress();
                break;
            case "utilityThreadsAsDaemon" :
                result = ((org.apache.catalina.core.StandardServer)o).getUtilityThreadsAsDaemon();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaRealmUserDatabaseRealm(Object o, String name) {
        Object result = null;
        switch (name) {
            case "resourceName" :
                result = ((org.apache.catalina.realm.UserDatabaseRealm)o).getResourceName();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaRealmRealmBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaRealmRealmBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "objectNameKeyProperties" :
                result = ((org.apache.catalina.realm.RealmBase)o).getObjectNameKeyProperties();
                break;
            //no getStripRealmForGss method found on this class
            case "domainInternal" :
                result = ((org.apache.catalina.realm.RealmBase)o).getDomainInternal();
                break;
            case "allRolesMode" :
                result = ((org.apache.catalina.realm.RealmBase)o).getAllRolesMode();
                break;
            case "x509UsernameRetrieverClassName" :
                result = ((org.apache.catalina.realm.RealmBase)o).getX509UsernameRetrieverClassName();
                break;
            case "transportGuaranteeRedirectStatus" :
                result = ((org.apache.catalina.realm.RealmBase)o).getTransportGuaranteeRedirectStatus();
                break;
            //no getRealmSuffix method found on this class
            case "validate" :
                result = ((org.apache.catalina.realm.RealmBase)o).getValidate();
                break;
            case "realmPath" :
                result = ((org.apache.catalina.realm.RealmBase)o).getRealmPath();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreStandardService(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getDomainInternal method found on this class
            case "objectNameKeyProperties" :
                result = ((org.apache.catalina.core.StandardService)o).getObjectNameKeyProperties();
                break;
            case "name" :
                result = ((org.apache.catalina.core.StandardService)o).getName();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreStandardContext(Object o, String name) {
        Object result = null;
        switch (name) {
            case "charsetMapperClass" :
                result = ((org.apache.catalina.core.StandardContext)o).getCharsetMapperClass();
                break;
            case "skipMemoryLeakChecksOnJvmShutdown" :
                result = ((org.apache.catalina.core.StandardContext)o).getSkipMemoryLeakChecksOnJvmShutdown();
                break;
            case "server" :
                result = ((org.apache.catalina.core.StandardContext)o).getServer();
                break;
            case "docBase" :
                result = ((org.apache.catalina.core.StandardContext)o).getDocBase();
                break;
            case "allowMultipleLeadingForwardSlashInPath" :
                result = ((org.apache.catalina.core.StandardContext)o).getAllowMultipleLeadingForwardSlashInPath();
                break;
            case "sendRedirectBody" :
                result = ((org.apache.catalina.core.StandardContext)o).getSendRedirectBody();
                break;
            case "defaultWebXml" :
                result = ((org.apache.catalina.core.StandardContext)o).getDefaultWebXml();
                break;
            case "displayName" :
                result = ((org.apache.catalina.core.StandardContext)o).getDisplayName();
                break;
            case "workPath" :
                result = ((org.apache.catalina.core.StandardContext)o).getWorkPath();
                break;
            case "reloadable" :
                result = ((org.apache.catalina.core.StandardContext)o).getReloadable();
                break;
            case "effectiveMinorVersion" :
                result = ((org.apache.catalina.core.StandardContext)o).getEffectiveMinorVersion();
                break;
            case "swallowOutput" :
                result = ((org.apache.catalina.core.StandardContext)o).getSwallowOutput();
                break;
            //no getRequestEncoding method found on this class
            case "cookies" :
                result = ((org.apache.catalina.core.StandardContext)o).getCookies();
                break;
            case "clearReferencesThreadLocals" :
                result = ((org.apache.catalina.core.StandardContext)o).getClearReferencesThreadLocals();
                break;
            case "delegate" :
                result = ((org.apache.catalina.core.StandardContext)o).getDelegate();
                break;
            case "mapperDirectoryRedirectEnabled" :
                result = ((org.apache.catalina.core.StandardContext)o).getMapperDirectoryRedirectEnabled();
                break;
            //no getServlet22 method found on this class
            case "preemptiveAuthentication" :
                result = ((org.apache.catalina.core.StandardContext)o).getPreemptiveAuthentication();
                break;
            case "wrapperClass" :
                result = ((org.apache.catalina.core.StandardContext)o).getWrapperClass();
                break;
            case "minTime" :
                result = ((org.apache.catalina.core.StandardContext)o).getMinTime();
                break;
            case "requestCharacterEncoding" :
                result = ((org.apache.catalina.core.StandardContext)o).getRequestCharacterEncoding();
                break;
            case "fireRequestListenersOnForwards" :
                result = ((org.apache.catalina.core.StandardContext)o).getFireRequestListenersOnForwards();
                break;
            case "override" :
                result = ((org.apache.catalina.core.StandardContext)o).getOverride();
                break;
            case "tldValidation" :
                result = ((org.apache.catalina.core.StandardContext)o).getTldValidation();
                break;
            case "workDir" :
                result = ((org.apache.catalina.core.StandardContext)o).getWorkDir();
                break;
            case "startTime" :
                result = ((org.apache.catalina.core.StandardContext)o).getStartTime();
                break;
            //no getWebXmlValidation method found on this class
            case "dispatchersUseEncodedPaths" :
                result = ((org.apache.catalina.core.StandardContext)o).getDispatchersUseEncodedPaths();
                break;
            case "allowCasualMultipartParsing" :
                result = ((org.apache.catalina.core.StandardContext)o).getAllowCasualMultipartParsing();
                break;
            case "requestCount" :
                result = ((org.apache.catalina.core.StandardContext)o).getRequestCount();
                break;
            case "addWebinfClassesResources" :
                result = ((org.apache.catalina.core.StandardContext)o).getAddWebinfClassesResources();
                break;
            case "j2EEApplication" :
                result = ((org.apache.catalina.core.StandardContext)o).getJ2EEApplication();
                break;
            case "distributable" :
                result = ((org.apache.catalina.core.StandardContext)o).getDistributable();
                break;
            case "mapperContextRootRedirectEnabled" :
                result = ((org.apache.catalina.core.StandardContext)o).getMapperContextRootRedirectEnabled();
                break;
            case "sessionCookiePath" :
                result = ((org.apache.catalina.core.StandardContext)o).getSessionCookiePath();
                break;
            case "sessionCookiePathUsesTrailingSlash" :
                result = ((org.apache.catalina.core.StandardContext)o).getSessionCookiePathUsesTrailingSlash();
                break;
            case "j2EEServer" :
                result = ((org.apache.catalina.core.StandardContext)o).getJ2EEServer();
                break;
            case "startupTime" :
                result = ((org.apache.catalina.core.StandardContext)o).getStartupTime();
                break;
            case "clearReferencesRmiTargets" :
                result = ((org.apache.catalina.core.StandardContext)o).getClearReferencesRmiTargets();
                break;
            case "xmlNamespaceAware" :
                result = ((org.apache.catalina.core.StandardContext)o).getXmlNamespaceAware();
                break;
            case "tldScanTime" :
                result = ((org.apache.catalina.core.StandardContext)o).getTldScanTime();
                break;
            case "clearReferencesHttpClientKeepAliveThread" :
                result = ((org.apache.catalina.core.StandardContext)o).getClearReferencesHttpClientKeepAliveThread();
                break;
            case "inProgressAsyncCount" :
                result = ((org.apache.catalina.core.StandardContext)o).getInProgressAsyncCount();
                break;
            case "validateClientProvidedNewSessionId" :
                result = ((org.apache.catalina.core.StandardContext)o).getValidateClientProvidedNewSessionId();
                break;
            //no getReplaceWelcomeFiles method found on this class
            case "useRelativeRedirects" :
                result = ((org.apache.catalina.core.StandardContext)o).getUseRelativeRedirects();
                break;
            case "sessionCookieDomain" :
                result = ((org.apache.catalina.core.StandardContext)o).getSessionCookieDomain();
                break;
            case "crossContext" :
                result = ((org.apache.catalina.core.StandardContext)o).getCrossContext();
                break;
            case "sessionCookieName" :
                result = ((org.apache.catalina.core.StandardContext)o).getSessionCookieName();
                break;
            case "defaultContextXml" :
                result = ((org.apache.catalina.core.StandardContext)o).getDefaultContextXml();
                break;
            case "publicId" :
                result = ((org.apache.catalina.core.StandardContext)o).getPublicId();
                break;
            case "denyUncoveredHttpMethods" :
                result = ((org.apache.catalina.core.StandardContext)o).getDenyUncoveredHttpMethods();
                break;
            case "encodedPath" :
                result = ((org.apache.catalina.core.StandardContext)o).getEncodedPath();
                break;
            case "antiResourceLocking" :
                result = ((org.apache.catalina.core.StandardContext)o).getAntiResourceLocking();
                break;
            case "paused" :
                result = ((org.apache.catalina.core.StandardContext)o).getPaused();
                break;
            case "resourceOnlyServlets" :
                result = ((org.apache.catalina.core.StandardContext)o).getResourceOnlyServlets();
                break;
            //no getNamingContextName method found on this class
            case "clearReferencesObjectStreamClassCaches" :
                result = ((org.apache.catalina.core.StandardContext)o).getClearReferencesObjectStreamClassCaches();
                break;
            //no getUseNaming method found on this class
            //no getComputedFailCtxIfServletStartFails method found on this class
            case "logEffectiveWebXml" :
                result = ((org.apache.catalina.core.StandardContext)o).getLogEffectiveWebXml();
                break;
            case "originalDocBase" :
                result = ((org.apache.catalina.core.StandardContext)o).getOriginalDocBase();
                break;
            case "path" :
                result = ((org.apache.catalina.core.StandardContext)o).getPath();
                break;
            case "useHttpOnly" :
                result = ((org.apache.catalina.core.StandardContext)o).getUseHttpOnly();
                break;
            case "clearReferencesStopTimerThreads" :
                result = ((org.apache.catalina.core.StandardContext)o).getClearReferencesStopTimerThreads();
                break;
            case "responseCharacterEncoding" :
                result = ((org.apache.catalina.core.StandardContext)o).getResponseCharacterEncoding();
                break;
            case "baseName" :
                result = ((org.apache.catalina.core.StandardContext)o).getBaseName();
                break;
            case "maxTime" :
                result = ((org.apache.catalina.core.StandardContext)o).getMaxTime();
                break;
            case "errorCount" :
                result = ((org.apache.catalina.core.StandardContext)o).getErrorCount();
                break;
            case "configured" :
                result = ((org.apache.catalina.core.StandardContext)o).getConfigured();
                break;
            case "containerSciFilter" :
                result = ((org.apache.catalina.core.StandardContext)o).getContainerSciFilter();
                break;
            case "ignoreAnnotations" :
                result = ((org.apache.catalina.core.StandardContext)o).getIgnoreAnnotations();
                break;
            //no getWebXmlNamespaceAware method found on this class
            case "unloadDelay" :
                result = ((org.apache.catalina.core.StandardContext)o).getUnloadDelay();
                break;
            //no getResponseEncoding method found on this class
            case "jndiExceptionOnFailedWrite" :
                result = ((org.apache.catalina.core.StandardContext)o).getJndiExceptionOnFailedWrite();
                break;
            //no getObjectNameKeyProperties method found on this class
            case "createUploadTargets" :
                result = ((org.apache.catalina.core.StandardContext)o).getCreateUploadTargets();
                break;
            case "processingTime" :
                result = ((org.apache.catalina.core.StandardContext)o).getProcessingTime();
                break;
            case "clearReferencesStopThreads" :
                result = ((org.apache.catalina.core.StandardContext)o).getClearReferencesStopThreads();
                break;
            case "privileged" :
                result = ((org.apache.catalina.core.StandardContext)o).getPrivileged();
                break;
            //no getWrapperClassName method found on this class
            case "xmlValidation" :
                result = ((org.apache.catalina.core.StandardContext)o).getXmlValidation();
                break;
            case "swallowAbortedUploads" :
                result = ((org.apache.catalina.core.StandardContext)o).getSwallowAbortedUploads();
                break;
            case "webappVersion" :
                result = ((org.apache.catalina.core.StandardContext)o).getWebappVersion();
                break;
            case "xmlBlockExternal" :
                result = ((org.apache.catalina.core.StandardContext)o).getXmlBlockExternal();
                break;
            case "copyXML" :
                result = ((org.apache.catalina.core.StandardContext)o).getCopyXML();
                break;
            case "unpackWAR" :
                result = ((org.apache.catalina.core.StandardContext)o).getUnpackWAR();
                break;
            case "sessionTimeout" :
                result = ((org.apache.catalina.core.StandardContext)o).getSessionTimeout();
                break;
            case "renewThreadsWhenStoppingContext" :
                result = ((org.apache.catalina.core.StandardContext)o).getRenewThreadsWhenStoppingContext();
                break;
            case "effectiveMajorVersion" :
                result = ((org.apache.catalina.core.StandardContext)o).getEffectiveMajorVersion();
                break;
            case "altDDName" :
                result = ((org.apache.catalina.core.StandardContext)o).getAltDDName();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaCoreContainerBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreStandardHost(Object o, String name) {
        Object result = null;
        switch (name) {
            case "deployOnStartup" :
                result = ((org.apache.catalina.core.StandardHost)o).getDeployOnStartup();
                break;
            case "name" :
                result = ((org.apache.catalina.core.StandardHost)o).getName();
                break;
            case "undeployOldVersions" :
                result = ((org.apache.catalina.core.StandardHost)o).getUndeployOldVersions();
                break;
            //no getDeployXML method found on this class
            case "errorReportValveClass" :
                result = ((org.apache.catalina.core.StandardHost)o).getErrorReportValveClass();
                break;
            case "deployIgnore" :
                result = ((org.apache.catalina.core.StandardHost)o).getDeployIgnore();
                break;
            case "workDir" :
                result = ((org.apache.catalina.core.StandardHost)o).getWorkDir();
                break;
            case "xmlBase" :
                result = ((org.apache.catalina.core.StandardHost)o).getXmlBase();
                break;
            case "appBase" :
                result = ((org.apache.catalina.core.StandardHost)o).getAppBase();
                break;
            case "createDirs" :
                result = ((org.apache.catalina.core.StandardHost)o).getCreateDirs();
                break;
            //no getCopyXML method found on this class
            case "autoDeploy" :
                result = ((org.apache.catalina.core.StandardHost)o).getAutoDeploy();
                break;
            //no getFailCtxIfServletStartFails method found on this class
            //no getObjectNameKeyProperties method found on this class
            case "contextClass" :
                result = ((org.apache.catalina.core.StandardHost)o).getContextClass();
                break;
            case "configClass" :
                result = ((org.apache.catalina.core.StandardHost)o).getConfigClass();
                break;
            //no getUnpackWARs method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaCoreContainerBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreStandardEngine(Object o, String name) {
        Object result = null;
        switch (name) {
            case "defaultHost" :
                result = ((org.apache.catalina.core.StandardEngine)o).getDefaultHost();
                break;
            //no getObjectNameKeyProperties method found on this class
            case "jvmRoute" :
                result = ((org.apache.catalina.core.StandardEngine)o).getJvmRoute();
                break;
            //no getDomainInternal method found on this class
            //no getJvmRouteId method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaCoreContainerBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaCoreContainerBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "MBeanKeyProperties" :
                result = ((org.apache.catalina.core.ContainerBase)o).getMBeanKeyProperties();
                break;
            case "logName" :
                result = ((org.apache.catalina.core.ContainerBase)o).getLogName();
                break;
            case "name" :
                result = ((org.apache.catalina.core.ContainerBase)o).getName();
                break;
            //no getAccessLogScanComplete method found on this class
            //no getDomainInternal method found on this class
            case "startStopThreads" :
                result = ((org.apache.catalina.core.ContainerBase)o).getStartStopThreads();
                break;
            case "backgroundProcessorDelay" :
                result = ((org.apache.catalina.core.ContainerBase)o).getBackgroundProcessorDelay();
                break;
            case "startChildren" :
                result = ((org.apache.catalina.core.ContainerBase)o).getStartChildren();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "domain" :
                result = ((org.apache.catalina.util.LifecycleMBeanBase)o).getDomain();
                break;
            //no getObjectNameKeyProperties method found on this class
            //no getDomainInternal method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaUtilLifecycleBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaUtilLifecycleBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "throwOnFailure" :
                result = ((org.apache.catalina.util.LifecycleBase)o).getThrowOnFailure();
                break;
            case "stateName" :
                result = ((org.apache.catalina.util.LifecycleBase)o).getStateName();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaLoaderParallelWebappClassLoader(Object o, String name) {
        Object result = null;
        switch (name) {
        }
        if (result == null) {
            result = getPropertyForOrgApacheCatalinaLoaderWebappClassLoaderBase(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaLoaderWebappClassLoaderBase(Object o, String name) {
        Object result = null;
        switch (name) {
            case "clearReferencesHttpClientKeepAliveThread" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesHttpClientKeepAliveThread();
                break;
            case "hostName" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getHostName();
                break;
            case "skipMemoryLeakChecksOnJvmShutdown" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getSkipMemoryLeakChecksOnJvmShutdown();
                break;
            case "contextName" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getContextName();
                break;
            case "clearReferencesObjectStreamClassCaches" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesObjectStreamClassCaches();
                break;
            case "clearReferencesRmiTargets" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesRmiTargets();
                break;
            case "clearReferencesLogFactoryRelease" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesLogFactoryRelease();
                break;
            case "clearReferencesThreadLocals" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesThreadLocals();
                break;
            case "clearReferencesStopThreads" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesStopThreads();
                break;
            case "stateName" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getStateName();
                break;
            case "serviceName" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getServiceName();
                break;
            case "delegate" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getDelegate();
                break;
            case "webappName" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getWebappName();
                break;
            //no getHasExternalRepositories method found on this class
            case "clearReferencesStopTimerThreads" :
                result = ((org.apache.catalina.loader.WebappClassLoaderBase)o).getClearReferencesStopTimerThreads();
                break;
        }
        if (result == null) {
            result = getPropertyForJavaNetURLClassLoader(o, name);
        }
        return result;
    }


    public static Object getPropertyForJavaNetURLClassLoader(Object o, String name) {
        Object result = null;
        switch (name) {
        }
        if (result == null) {
            result = getPropertyForJavaSecuritySecureClassLoader(o, name);
        }
        return result;
    }


    public static Object getPropertyForJavaSecuritySecureClassLoader(Object o, String name) {
        Object result = null;
        switch (name) {
        }
        if (result == null) {
            result = getPropertyForJavaLangClassLoader(o, name);
        }
        return result;
    }


    public static Object getPropertyForJavaLangClassLoader(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getSclSet method found on this class
            //no getDefaultAssertionStatus method found on this class
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteAjpAjpNioProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getNamePrefix method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteAjpAjpNio2Protocol(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getNamePrefix method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteAjpAjpAprProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            case "pollTime" :
                result = ((org.apache.coyote.ajp.AjpAprProtocol)o).getPollTime();
                break;
            //no getNamePrefix method found on this class
            //no getAprRequired method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getSecret method found on this class
            case "desiredBufferSize" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getDesiredBufferSize();
                break;
            case "tomcatAuthorization" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getTomcatAuthorization();
                break;
            //no getRequiredSecret method found on this class
            case "ajpFlush" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getAjpFlush();
                break;
            case "secretRequired" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getSecretRequired();
                break;
            //no getProtocolName method found on this class
            case "allowedRequestAttributesPattern" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getAllowedRequestAttributesPattern();
                break;
            case "packetSize" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getPacketSize();
                break;
            case "tomcatAuthentication" :
                result = ((org.apache.coyote.ajp.AbstractAjpProtocol)o).getTomcatAuthentication();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteAbstractProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteHttp11Http11AprProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getAprRequired method found on this class
            case "pollTime" :
                result = ((org.apache.coyote.http11.Http11AprProtocol)o).getPollTime();
                break;
            //no getNamePrefix method found on this class
            case "deferAccept" :
                result = ((org.apache.coyote.http11.Http11AprProtocol)o).getDeferAccept();
                break;
            case "sendfileSize" :
                result = ((org.apache.coyote.http11.Http11AprProtocol)o).getSendfileSize();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteHttp11AbstractHttp11Protocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteHttp11Http11Nio2Protocol(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getNamePrefix method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteHttp11AbstractHttp11JsseProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteHttp11Http11NioProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            case "selectorTimeout" :
                result = ((org.apache.coyote.http11.Http11NioProtocol)o).getSelectorTimeout();
                break;
            //no getNamePrefix method found on this class
            case "pollerThreadCount" :
                result = ((org.apache.coyote.http11.Http11NioProtocol)o).getPollerThreadCount();
                break;
            case "pollerThreadPriority" :
                result = ((org.apache.coyote.http11.Http11NioProtocol)o).getPollerThreadPriority();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteHttp11AbstractHttp11JsseProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteHttp11AbstractHttp11JsseProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getSslImplementationShortName method found on this class
            case "sslImplementationName" :
                result = ((org.apache.coyote.http11.AbstractHttp11JsseProtocol)o).getSslImplementationName();
                break;
            case "sniParseLimit" :
                result = ((org.apache.coyote.http11.AbstractHttp11JsseProtocol)o).getSniParseLimit();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteHttp11AbstractHttp11Protocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteHttp11AbstractHttp11Protocol(Object o, String name) {
        Object result = null;
        switch (name) {
            case "crlFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getCrlFile();
                break;
            case "truststorePass" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTruststorePass();
                break;
            case "maxExtensionSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getMaxExtensionSize();
                break;
            case "sslProtocol" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSslProtocol();
                break;
            case "compressionMinSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getCompressionMinSize();
                break;
            case "truststoreFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTruststoreFile();
                break;
            case "server" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getServer();
                break;
            case "SSLVerifyDepth" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLVerifyDepth();
                break;
            case "rejectIllegalHeader" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getRejectIllegalHeader();
                break;
            case "keystoreProvider" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getKeystoreProvider();
                break;
            case "SSLCARevocationPath" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCARevocationPath();
                break;
            case "disableUploadTimeout" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getDisableUploadTimeout();
                break;
            case "allowedTrailerHeaders" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getAllowedTrailerHeaders();
                break;
            case "useKeepAliveResponseHeader" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getUseKeepAliveResponseHeader();
                break;
            case "ciphers" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getCiphers();
                break;
            case "maxSavePostSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getMaxSavePostSize();
                break;
            case "SSLCACertificatePath" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCACertificatePath();
                break;
            //no getProtocolName method found on this class
            case "allowHostHeaderMismatch" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getAllowHostHeaderMismatch();
                break;
            case "useSendfile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getUseSendfile();
                break;
            case "compressibleMimeType" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getCompressibleMimeType();
                break;
            case "noCompressionUserAgents" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getNoCompressionUserAgents();
                break;
            case "SSLCertificateKeyFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCertificateKeyFile();
                break;
            case "sslEnabledProtocols" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSslEnabledProtocols();
                break;
            case "keystoreFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getKeystoreFile();
                break;
            case "truststoreAlgorithm" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTruststoreAlgorithm();
                break;
            case "SSLCACertificateFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCACertificateFile();
                break;
            case "connectionUploadTimeout" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getConnectionUploadTimeout();
                break;
            case "relaxedQueryChars" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getRelaxedQueryChars();
                break;
            case "trustManagerClassName" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTrustManagerClassName();
                break;
            case "restrictedUserAgents" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getRestrictedUserAgents();
                break;
            case "keyAlias" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getKeyAlias();
                break;
            case "defaultSSLHostConfigName" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getDefaultSSLHostConfigName();
                break;
            case "useServerCipherSuitesOrder" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getUseServerCipherSuitesOrder();
                break;
            case "SSLHonorCipherOrder" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLHonorCipherOrder();
                break;
            case "secure" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSecure();
                break;
            case "keyPass" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getKeyPass();
                break;
            case "sessionCacheSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSessionCacheSize();
                break;
            case "SSLVerifyClient" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLVerifyClient();
                break;
            case "compression" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getCompression();
                break;
            case "keystorePass" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getKeystorePass();
                break;
            case "trustMaxCertLength" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTrustMaxCertLength();
                break;
            case "serverRemoveAppProvidedValues" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getServerRemoveAppProvidedValues();
                break;
            case "algorithm" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getAlgorithm();
                break;
            case "truststoreType" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTruststoreType();
                break;
            //no getCompressionLevel method found on this class
            case "maxTrailerSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getMaxTrailerSize();
                break;
            case "SSLProtocol" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLProtocol();
                break;
            case "SSLEnabled" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).isSSLEnabled();
                break;
            case "relaxedPathChars" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getRelaxedPathChars();
                break;
            case "SSLPassword" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLPassword();
                break;
            case "keystoreType" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getKeystoreType();
                break;
            case "maxSwallowSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getMaxSwallowSize();
                break;
            case "rejectIllegalHeaderName" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getRejectIllegalHeaderName();
                break;
            case "SSLCipherSuite" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCipherSuite();
                break;
            case "truststoreProvider" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getTruststoreProvider();
                break;
            case "clientAuth" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getClientAuth();
                break;
            case "maxHttpHeaderSize" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getMaxHttpHeaderSize();
                break;
            case "noCompressionStrongETag" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getNoCompressionStrongETag();
                break;
            case "SSLCertificateFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCertificateFile();
                break;
            case "maxKeepAliveRequests" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getMaxKeepAliveRequests();
                break;
            case "SSLDisableSessionTickets" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLDisableSessionTickets();
                break;
            case "SSLCARevocationFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCARevocationFile();
                break;
            case "sessionTimeout" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSessionTimeout();
                break;
            case "SSLDisableCompression" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLDisableCompression();
                break;
            case "SSLCertificateChainFile" :
                result = ((org.apache.coyote.http11.AbstractHttp11Protocol)o).getSSLCertificateChainFile();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheCoyoteAbstractProtocol(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCoyoteAbstractProtocol(Object o, String name) {
        Object result = null;
        switch (name) {
            case "nameIndex" :
                result = ((org.apache.coyote.AbstractProtocol)o).getNameIndex();
                break;
            //no getAprRequired method found on this class
            //no getProtocolName method found on this class
            //no getPaused method found on this class
            //no getSendfileSupported method found on this class
            case "acceptCount" :
                result = ((org.apache.coyote.AbstractProtocol)o).getAcceptCount();
                break;
            case "portOffset" :
                result = ((org.apache.coyote.AbstractProtocol)o).getPortOffset();
                break;
            case "connectionTimeout" :
                result = ((org.apache.coyote.AbstractProtocol)o).getConnectionTimeout();
                break;
            case "maxConnections" :
                result = ((org.apache.coyote.AbstractProtocol)o).getMaxConnections();
                break;
            case "tcpNoDelay" :
                result = ((org.apache.coyote.AbstractProtocol)o).getTcpNoDelay();
                break;
            case "maxThreads" :
                result = ((org.apache.coyote.AbstractProtocol)o).getMaxThreads();
                break;
            case "connectionCount" :
                result = ((org.apache.coyote.AbstractProtocol)o).getConnectionCount();
                break;
            case "connectionLinger" :
                result = ((org.apache.coyote.AbstractProtocol)o).getConnectionLinger();
                break;
            case "portWithOffset" :
                result = ((org.apache.coyote.AbstractProtocol)o).getPortWithOffset();
                break;
            //no getNamePrefix method found on this class
            case "name" :
                result = ((org.apache.coyote.AbstractProtocol)o).getName();
                break;
            case "minSpareThreads" :
                result = ((org.apache.coyote.AbstractProtocol)o).getMinSpareThreads();
                break;
            case "keepAliveTimeout" :
                result = ((org.apache.coyote.AbstractProtocol)o).getKeepAliveTimeout();
                break;
            case "clientCertProvider" :
                result = ((org.apache.coyote.AbstractProtocol)o).getClientCertProvider();
                break;
            case "localPort" :
                result = ((org.apache.coyote.AbstractProtocol)o).getLocalPort();
                break;
            case "port" :
                result = ((org.apache.coyote.AbstractProtocol)o).getPort();
                break;
            case "domain" :
                result = ((org.apache.coyote.AbstractProtocol)o).getDomain();
                break;
            case "threadPriority" :
                result = ((org.apache.coyote.AbstractProtocol)o).getThreadPriority();
                break;
            case "acceptorThreadCount" :
                result = ((org.apache.coyote.AbstractProtocol)o).getAcceptorThreadCount();
                break;
            case "processorCache" :
                result = ((org.apache.coyote.AbstractProtocol)o).getProcessorCache();
                break;
            case "acceptorThreadPriority" :
                result = ((org.apache.coyote.AbstractProtocol)o).getAcceptorThreadPriority();
                break;
            case "address" :
                result = ((org.apache.coyote.AbstractProtocol)o).getAddress();
                break;
            case "maxHeaderCount" :
                result = ((org.apache.coyote.AbstractProtocol)o).getMaxHeaderCount();
                break;
        }
        if (result == null) {
            result = null;
        }
        if (result == null) {
            result = ((org.apache.coyote.AbstractProtocol)o).getProperty(name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetSocketProperties(Object o, String name) {
        Object result = null;
        switch (name) {
            case "soLingerOn" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getSoLingerOn();
                break;
            case "directBuffer" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getDirectBuffer();
                break;
            case "soKeepAlive" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getSoKeepAlive();
                break;
            case "txBufSize" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getTxBufSize();
                break;
            case "soTimeout" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getSoTimeout();
                break;
            case "ooBInline" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getOoBInline();
                break;
            case "rxBufSize" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getRxBufSize();
                break;
            case "appWriteBufSize" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getAppWriteBufSize();
                break;
            case "bufferPool" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getBufferPool();
                break;
            case "appReadBufSize" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getAppReadBufSize();
                break;
            case "directBufferPool" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getDirectBufferPool();
                break;
            case "bufferPoolSize" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getBufferPoolSize();
                break;
            case "directSslBuffer" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getDirectSslBuffer();
                break;
            case "soLingerTime" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getSoLingerTime();
                break;
            case "performanceConnectionTime" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getPerformanceConnectionTime();
                break;
            case "soReuseAddress" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getSoReuseAddress();
                break;
            case "unlockTimeout" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getUnlockTimeout();
                break;
            case "performanceBandwidth" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getPerformanceBandwidth();
                break;
            case "performanceLatency" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getPerformanceLatency();
                break;
            case "tcpNoDelay" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getTcpNoDelay();
                break;
            case "processorCache" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getProcessorCache();
                break;
            case "eventCache" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getEventCache();
                break;
            case "timeoutInterval" :
                result = ((org.apache.tomcat.util.net.SocketProperties)o).getTimeoutInterval();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetNioSelectorPool(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getEnabled method found on this class
            case "maxSelectors" :
                result = ((org.apache.tomcat.util.net.NioSelectorPool)o).getMaxSelectors();
                break;
            case "sharedSelectorTimeout" :
                result = ((org.apache.tomcat.util.net.NioSelectorPool)o).getSharedSelectorTimeout();
                break;
            //no getShared method found on this class
            case "maxSpareSelectors" :
                result = ((org.apache.tomcat.util.net.NioSelectorPool)o).getMaxSpareSelectors();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProperty(Object o, String name) {
        Object result = null;
        switch (name) {
            case "name" :
                result = ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Property)o).getName();
                break;
            case "value" :
                result = ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Property)o).getValue();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaAuthenticatorJaspicSimpleAuthConfigProvider(Object o, String name) {
        Object result = null;
        switch (name) {
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProvider(Object o, String name) {
        Object result = null;
        switch (name) {
            case "appContext" :
                result = ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).getAppContext();
                break;
            case "className" :
                result = ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).getClassName();
                break;
            case "description" :
                result = ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).getDescription();
                break;
            case "layer" :
                result = ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).getLayer();
                break;
        }
        if (result == null) {
            result = null;
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetNioEndpoint(Object o, String name) {
        Object result = null;
        switch (name) {
            case "pollerThreadPriority" :
                result = ((org.apache.tomcat.util.net.NioEndpoint)o).getPollerThreadPriority();
                break;
            case "keepAliveCount" :
                result = ((org.apache.tomcat.util.net.NioEndpoint)o).getKeepAliveCount();
                break;
            case "pollerThreadCount" :
                result = ((org.apache.tomcat.util.net.NioEndpoint)o).getPollerThreadCount();
                break;
            case "selectorTimeout" :
                result = ((org.apache.tomcat.util.net.NioEndpoint)o).getSelectorTimeout();
                break;
            case "useInheritedChannel" :
                result = ((org.apache.tomcat.util.net.NioEndpoint)o).getUseInheritedChannel();
                break;
            case "deferAccept" :
                result = ((org.apache.tomcat.util.net.NioEndpoint)o).getDeferAccept();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilNetAbstractJsseEndpoint(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetNio2Endpoint(Object o, String name) {
        Object result = null;
        switch (name) {
            case "keepAliveCount" :
                result = ((org.apache.tomcat.util.net.Nio2Endpoint)o).getKeepAliveCount();
                break;
            case "deferAccept" :
                result = ((org.apache.tomcat.util.net.Nio2Endpoint)o).getDeferAccept();
                break;
            //no getInline method found on this class
            //no getAllClosed method found on this class
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilNetAbstractJsseEndpoint(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetAbstractJsseEndpoint(Object o, String name) {
        Object result = null;
        switch (name) {
            case "sslImplementationName" :
                result = ((org.apache.tomcat.util.net.AbstractJsseEndpoint)o).getSslImplementationName();
                break;
            //no getAlpnSupported method found on this class
            case "sniParseLimit" :
                result = ((org.apache.tomcat.util.net.AbstractJsseEndpoint)o).getSniParseLimit();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilNetAbstractEndpoint(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetAprEndpoint(Object o, String name) {
        Object result = null;
        switch (name) {
            //no getRootPool method found on this class
            case "pollTime" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getPollTime();
                break;
            //no getServerSockPool method found on this class
            case "sendfileSize" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getSendfileSize();
                break;
            //no getAlpnSupported method found on this class
            case "keepAliveCount" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getKeepAliveCount();
                break;
            case "ipv6v6only" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getIpv6v6only();
                break;
            case "maxConnections" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getMaxConnections();
                break;
            case "deferAccept" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getDeferAccept();
                break;
            //no getServerSock method found on this class
            //no getSslContext method found on this class
            //no getUseSendFileSet method found on this class
            case "sendfileCount" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getSendfileCount();
                break;
            case "useSendfile" :
                result = ((org.apache.tomcat.util.net.AprEndpoint)o).getUseSendfile();
                break;
        }
        if (result == null) {
            result = getPropertyForOrgApacheTomcatUtilNetAbstractEndpoint(o, name);
        }
        return result;
    }


    public static Object getPropertyForOrgApacheTomcatUtilNetAbstractEndpoint(Object o, String name) {
        Object result = null;
        switch (name) {
            case "useAsyncIO" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getUseAsyncIO();
                break;
            case "localPort" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getLocalPort();
                break;
            case "useSendfile" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getUseSendfile();
                break;
            case "maxThreads" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getMaxThreads();
                break;
            case "acceptorThreadCount" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getAcceptorThreadCount();
                break;
            case "connectionTimeout" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getConnectionTimeout();
                break;
            case "tcpNoDelay" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getTcpNoDelay();
                break;
            case "acceptorThreadPriority" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getAcceptorThreadPriority();
                break;
            case "connectionLinger" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getConnectionLinger();
                break;
            case "address" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getAddress();
                break;
            case "currentThreadCount" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getCurrentThreadCount();
                break;
            case "name" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getName();
                break;
            case "daemon" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getDaemon();
                break;
            //no getInternalExecutor method found on this class
            case "minSpareThreads" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getMinSpareThreads();
                break;
            //no getAlpnSupported method found on this class
            case "maxKeepAliveRequests" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getMaxKeepAliveRequests();
                break;
            case "port" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getPort();
                break;
            case "portOffset" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getPortOffset();
                break;
            case "domain" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getDomain();
                break;
            case "defaultSSLHostConfigName" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getDefaultSSLHostConfigName();
                break;
            case "maxConnections" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getMaxConnections();
                break;
            case "threadPriority" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getThreadPriority();
                break;
            //no getRunning method found on this class
            case "bindOnInit" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getBindOnInit();
                break;
            case "connectionCount" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getConnectionCount();
                break;
            case "acceptCount" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getAcceptCount();
                break;
            case "portWithOffset" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getPortWithOffset();
                break;
            case "currentThreadsBusy" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getCurrentThreadsBusy();
                break;
            case "keepAliveTimeout" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getKeepAliveTimeout();
                break;
            //no getPaused method found on this class
            case "executorTerminationTimeoutMillis" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getExecutorTerminationTimeoutMillis();
                break;
            case "SSLEnabled" :
                result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).isSSLEnabled();
                break;
            //no getDeferAccept method found on this class
        }
        if (result == null) {
            result = null;
        }
        if (result == null) {
            result = ((org.apache.tomcat.util.net.AbstractEndpoint)o).getProperty(name);
        }
        return result;
    }


    public static boolean setPropertyInternal(Object o, String name, String value, boolean invokeSetProperty) {
        Class<?> checkThisClass = o.getClass();
        while (checkThisClass != Object.class) {
            switch (checkThisClass.getName()) {
                case "org.apache.tomcat.util.descriptor.web.ContextResource" :
                    return setPropertyForOrgApacheTomcatUtilDescriptorWebContextResource(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.descriptor.web.ResourceBase" :
                    return setPropertyForOrgApacheTomcatUtilDescriptorWebResourceBase(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.modeler.ParameterInfo" :
                    return setPropertyForOrgApacheTomcatUtilModelerParameterInfo(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.modeler.OperationInfo" :
                    return setPropertyForOrgApacheTomcatUtilModelerOperationInfo(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.modeler.AttributeInfo" :
                    return setPropertyForOrgApacheTomcatUtilModelerAttributeInfo(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.modeler.FeatureInfo" :
                    return setPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name, value, invokeSetProperty);
                case "org.apache.catalina.core.AprLifecycleListener" :
                    return setPropertyForOrgApacheCatalinaCoreAprLifecycleListener(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.modeler.ManagedBean" :
                    return setPropertyForOrgApacheTomcatUtilModelerManagedBean(o, name, value, invokeSetProperty);
                case "org.apache.catalina.filters.RestCsrfPreventionFilter" :
                    return setPropertyForOrgApacheCatalinaFiltersRestCsrfPreventionFilter(o, name, value, invokeSetProperty);
                case "org.apache.catalina.filters.AddDefaultCharsetFilter" :
                    return setPropertyForOrgApacheCatalinaFiltersAddDefaultCharsetFilter(o, name, value, invokeSetProperty);
                case "org.apache.catalina.connector.Connector" :
                    return setPropertyForOrgApacheCatalinaConnectorConnector(o, name, value, invokeSetProperty);
                case "org.apache.catalina.valves.AccessLogValve" :
                    return setPropertyForOrgApacheCatalinaValvesAccessLogValve(o, name, value, invokeSetProperty);
                case "org.apache.catalina.core.StandardServer" :
                    return setPropertyForOrgApacheCatalinaCoreStandardServer(o, name, value, invokeSetProperty);
                case "org.apache.catalina.realm.UserDatabaseRealm" :
                    return setPropertyForOrgApacheCatalinaRealmUserDatabaseRealm(o, name, value, invokeSetProperty);
                case "org.apache.catalina.core.StandardService" :
                    return setPropertyForOrgApacheCatalinaCoreStandardService(o, name, value, invokeSetProperty);
                case "org.apache.catalina.core.StandardContext" :
                    return setPropertyForOrgApacheCatalinaCoreStandardContext(o, name, value, invokeSetProperty);
                case "org.apache.catalina.core.StandardHost" :
                    return setPropertyForOrgApacheCatalinaCoreStandardHost(o, name, value, invokeSetProperty);
                case "org.apache.catalina.core.StandardEngine" :
                    return setPropertyForOrgApacheCatalinaCoreStandardEngine(o, name, value, invokeSetProperty);
                case "org.apache.catalina.loader.ParallelWebappClassLoader" :
                    return setPropertyForOrgApacheCatalinaLoaderParallelWebappClassLoader(o, name, value, invokeSetProperty);
                case "java.net.URLClassLoader" :
                    return setPropertyForJavaNetURLClassLoader(o, name, value, invokeSetProperty);
                case "java.security.SecureClassLoader" :
                    return setPropertyForJavaSecuritySecureClassLoader(o, name, value, invokeSetProperty);
                case "org.apache.coyote.ajp.AjpNioProtocol" :
                    return setPropertyForOrgApacheCoyoteAjpAjpNioProtocol(o, name, value, invokeSetProperty);
                case "org.apache.coyote.ajp.AjpNio2Protocol" :
                    return setPropertyForOrgApacheCoyoteAjpAjpNio2Protocol(o, name, value, invokeSetProperty);
                case "org.apache.coyote.ajp.AjpAprProtocol" :
                    return setPropertyForOrgApacheCoyoteAjpAjpAprProtocol(o, name, value, invokeSetProperty);
                case "org.apache.coyote.http11.Http11AprProtocol" :
                    return setPropertyForOrgApacheCoyoteHttp11Http11AprProtocol(o, name, value, invokeSetProperty);
                case "org.apache.coyote.http11.Http11Nio2Protocol" :
                    return setPropertyForOrgApacheCoyoteHttp11Http11Nio2Protocol(o, name, value, invokeSetProperty);
                case "org.apache.coyote.http11.Http11NioProtocol" :
                    return setPropertyForOrgApacheCoyoteHttp11Http11NioProtocol(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.net.SocketProperties" :
                    return setPropertyForOrgApacheTomcatUtilNetSocketProperties(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.net.NioSelectorPool" :
                    return setPropertyForOrgApacheTomcatUtilNetNioSelectorPool(o, name, value, invokeSetProperty);
                case "org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations$Property" :
                    return setPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProperty(o, name, value, invokeSetProperty);
                case "org.apache.catalina.authenticator.jaspic.SimpleAuthConfigProvider" :
                    return setPropertyForOrgApacheCatalinaAuthenticatorJaspicSimpleAuthConfigProvider(o, name, value, invokeSetProperty);
                case "org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations$Provider" :
                    return setPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProvider(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.net.NioEndpoint" :
                    return setPropertyForOrgApacheTomcatUtilNetNioEndpoint(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.net.Nio2Endpoint" :
                    return setPropertyForOrgApacheTomcatUtilNetNio2Endpoint(o, name, value, invokeSetProperty);
                case "org.apache.tomcat.util.net.AprEndpoint" :
                    return setPropertyForOrgApacheTomcatUtilNetAprEndpoint(o, name, value, invokeSetProperty);
            }
            checkThisClass = checkThisClass.getSuperclass();
        }
        return false;
    }
    public static boolean setPropertyForOrgApacheTomcatUtilDescriptorWebContextResource(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "scope" :
                ((org.apache.tomcat.util.descriptor.web.ContextResource)o).setScope(value);
                return true;
            case "closeMethod" :
                ((org.apache.tomcat.util.descriptor.web.ContextResource)o).setCloseMethod(value);
                return true;
            //no setCloseMethodConfigured method found on this class
            case "auth" :
                ((org.apache.tomcat.util.descriptor.web.ContextResource)o).setAuth(value);
                return true;
            case "singleton" :
                ((org.apache.tomcat.util.descriptor.web.ContextResource)o).setSingleton(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheTomcatUtilDescriptorWebResourceBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilDescriptorWebResourceBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "lookupName" :
                ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).setLookupName(value);
                return true;
            case "description" :
                ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).setDescription(value);
                return true;
            case "name" :
                ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).setName(value);
                return true;
            case "type" :
                ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).setType(value);
                return true;
        }
        if (invokeSetProperty) {
            ((org.apache.tomcat.util.descriptor.web.ResourceBase)o).setProperty(name, value);
            return true;
        }
        return true;
    }

    public static boolean setPropertyForOrgApacheTomcatUtilModelerParameterInfo(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
        }
        return setPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilModelerOperationInfo(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "role" :
                ((org.apache.tomcat.util.modeler.OperationInfo)o).setRole(value);
                return true;
            case "returnType" :
                ((org.apache.tomcat.util.modeler.OperationInfo)o).setReturnType(value);
                return true;
            case "impact" :
                ((org.apache.tomcat.util.modeler.OperationInfo)o).setImpact(value);
                return true;
        }
        return setPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilModelerAttributeInfo(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "writeable" :
                ((org.apache.tomcat.util.modeler.AttributeInfo)o).setWriteable(Boolean.valueOf(value));
                return true;
            case "getMethod" :
                ((org.apache.tomcat.util.modeler.AttributeInfo)o).setGetMethod(value);
                return true;
            case "setMethod" :
                ((org.apache.tomcat.util.modeler.AttributeInfo)o).setSetMethod(value);
                return true;
            case "readable" :
                ((org.apache.tomcat.util.modeler.AttributeInfo)o).setReadable(Boolean.valueOf(value));
                return true;
            case "displayName" :
                ((org.apache.tomcat.util.modeler.AttributeInfo)o).setDisplayName(value);
                return true;
            case "is" :
                ((org.apache.tomcat.util.modeler.AttributeInfo)o).setIs(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheTomcatUtilModelerFeatureInfo(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilModelerFeatureInfo(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "type" :
                ((org.apache.tomcat.util.modeler.FeatureInfo)o).setType(value);
                return true;
            case "description" :
                ((org.apache.tomcat.util.modeler.FeatureInfo)o).setDescription(value);
                return true;
            case "name" :
                ((org.apache.tomcat.util.modeler.FeatureInfo)o).setName(value);
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreAprLifecycleListener(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setInstanceCreated method found on this class
            //no setAprInitialized method found on this class
            //no setAprAvailable method found on this class
            case "FIPSMode" :
                ((org.apache.catalina.core.AprLifecycleListener)o).setFIPSMode(value);
                return true;
            case "SSLRandomSeed" :
                ((org.apache.catalina.core.AprLifecycleListener)o).setSSLRandomSeed(value);
                return true;
            //no setFIPSModeActive method found on this class
            case "useOpenSSL" :
                ((org.apache.catalina.core.AprLifecycleListener)o).setUseOpenSSL(Boolean.valueOf(value));
                return true;
            //no setSslInitialized method found on this class
            //no setFipsModeActive method found on this class
            case "useAprConnector" :
                ((org.apache.catalina.core.AprLifecycleListener)o).setUseAprConnector(Boolean.valueOf(value));
                return true;
            case "SSLEngine" :
                ((org.apache.catalina.core.AprLifecycleListener)o).setSSLEngine(value);
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheTomcatUtilModelerManagedBean(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "className" :
                ((org.apache.tomcat.util.modeler.ManagedBean)o).setClassName(value);
                return true;
            case "domain" :
                ((org.apache.tomcat.util.modeler.ManagedBean)o).setDomain(value);
                return true;
            case "type" :
                ((org.apache.tomcat.util.modeler.ManagedBean)o).setType(value);
                return true;
            case "name" :
                ((org.apache.tomcat.util.modeler.ManagedBean)o).setName(value);
                return true;
            case "group" :
                ((org.apache.tomcat.util.modeler.ManagedBean)o).setGroup(value);
                return true;
            case "description" :
                ((org.apache.tomcat.util.modeler.ManagedBean)o).setDescription(value);
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaFiltersRestCsrfPreventionFilter(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "pathsAcceptingParams" :
                ((org.apache.catalina.filters.RestCsrfPreventionFilter)o).setPathsAcceptingParams(value);
                return true;
            //no setPathsDelimiter method found on this class
        }
        return setPropertyForOrgApacheCatalinaFiltersCsrfPreventionFilterBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaFiltersCsrfPreventionFilterBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "denyStatus" :
                ((org.apache.catalina.filters.CsrfPreventionFilterBase)o).setDenyStatus(Integer.valueOf(value));
                return true;
            case "randomClass" :
                ((org.apache.catalina.filters.CsrfPreventionFilterBase)o).setRandomClass(value);
                return true;
            //no setConfigProblemFatal method found on this class
        }
        return setPropertyForOrgApacheCatalinaFiltersFilterBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaFiltersAddDefaultCharsetFilter(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "encoding" :
                ((org.apache.catalina.filters.AddDefaultCharsetFilter)o).setEncoding(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaFiltersFilterBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaFiltersFilterBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setConfigProblemFatal method found on this class
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaConnectorConnector(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "asyncTimeout" :
                ((org.apache.catalina.connector.Connector)o).setAsyncTimeout(Long.valueOf(value));
                return true;
            case "discardFacades" :
                ((org.apache.catalina.connector.Connector)o).setDiscardFacades(Boolean.valueOf(value));
                return true;
            case "useBodyEncodingForURI" :
                ((org.apache.catalina.connector.Connector)o).setUseBodyEncodingForURI(Boolean.valueOf(value));
                return true;
            case "enableLookups" :
                ((org.apache.catalina.connector.Connector)o).setEnableLookups(Boolean.valueOf(value));
                return true;
            case "localPort" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "parseBodyMethods" :
                ((org.apache.catalina.connector.Connector)o).setParseBodyMethods(value);
                return true;
            case "objectNameKeyProperties" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "maxParameterCount" :
                ((org.apache.catalina.connector.Connector)o).setMaxParameterCount(Integer.valueOf(value));
                return true;
            case "allowTrace" :
                ((org.apache.catalina.connector.Connector)o).setAllowTrace(Boolean.valueOf(value));
                return true;
            case "portWithOffset" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "redirectPort" :
                ((org.apache.catalina.connector.Connector)o).setRedirectPort(Integer.valueOf(value));
                return true;
            case "URIEncoding" :
                ((org.apache.catalina.connector.Connector)o).setURIEncoding(value);
                return true;
            case "protocol" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "maxSavePostSize" :
                ((org.apache.catalina.connector.Connector)o).setMaxSavePostSize(Integer.valueOf(value));
                return true;
            case "useIPVHosts" :
                ((org.apache.catalina.connector.Connector)o).setUseIPVHosts(Boolean.valueOf(value));
                return true;
            case "protocolHandlerClassName" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "encodedSolidusHandling" :
                ((org.apache.catalina.connector.Connector)o).setEncodedSolidusHandling(value);
                return true;
            case "domainInternal" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "maxPostSize" :
                ((org.apache.catalina.connector.Connector)o).setMaxPostSize(Integer.valueOf(value));
                return true;
            case "scheme" :
                ((org.apache.catalina.connector.Connector)o).setScheme(value);
                return true;
            case "secure" :
                ((org.apache.catalina.connector.Connector)o).setSecure(Boolean.valueOf(value));
                return true;
            case "proxyName" :
                ((org.apache.catalina.connector.Connector)o).setProxyName(value);
                return true;
            case "maxCookieCount" :
                ((org.apache.catalina.connector.Connector)o).setMaxCookieCount(Integer.valueOf(value));
                return true;
            case "proxyPort" :
                ((org.apache.catalina.connector.Connector)o).setProxyPort(Integer.valueOf(value));
                return true;
            case "portOffset" :
                ((org.apache.catalina.connector.Connector)o).setPortOffset(Integer.valueOf(value));
                return true;
            case "xpoweredBy" :
                ((org.apache.catalina.connector.Connector)o).setXpoweredBy(Boolean.valueOf(value));
                return true;
            case "executorName" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
            case "port" :
                ((org.apache.catalina.connector.Connector)o).setPort(Integer.valueOf(value));
                return true;
            case "redirectPortWithOffset" :
                ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
                return true;
        }
        if (invokeSetProperty) {
            ((org.apache.catalina.connector.Connector)o).setProperty(name, value);
            return true;
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaValvesAccessLogValve(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "rotatable" :
                ((org.apache.catalina.valves.AccessLogValve)o).setRotatable(Boolean.valueOf(value));
                return true;
            case "prefix" :
                ((org.apache.catalina.valves.AccessLogValve)o).setPrefix(value);
                return true;
            //no setCheckForOldLogs method found on this class
            case "checkExists" :
                ((org.apache.catalina.valves.AccessLogValve)o).setCheckExists(Boolean.valueOf(value));
                return true;
            case "buffered" :
                ((org.apache.catalina.valves.AccessLogValve)o).setBuffered(Boolean.valueOf(value));
                return true;
            //no setRotationLastChecked method found on this class
            case "suffix" :
                ((org.apache.catalina.valves.AccessLogValve)o).setSuffix(value);
                return true;
            case "directory" :
                ((org.apache.catalina.valves.AccessLogValve)o).setDirectory(value);
                return true;
            case "encoding" :
                ((org.apache.catalina.valves.AccessLogValve)o).setEncoding(value);
                return true;
            //no setDateStamp method found on this class
            case "maxDays" :
                ((org.apache.catalina.valves.AccessLogValve)o).setMaxDays(Integer.valueOf(value));
                return true;
            case "renameOnRotate" :
                ((org.apache.catalina.valves.AccessLogValve)o).setRenameOnRotate(Boolean.valueOf(value));
                return true;
            case "fileDateFormat" :
                ((org.apache.catalina.valves.AccessLogValve)o).setFileDateFormat(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaValvesAbstractAccessLogValve(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaValvesAbstractAccessLogValve(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "locale" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setLocale(value);
                return true;
            case "conditionUnless" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setConditionUnless(value);
                return true;
            case "requestAttributesEnabled" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setRequestAttributesEnabled(Boolean.valueOf(value));
                return true;
            case "enabled" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setEnabled(Boolean.valueOf(value));
                return true;
            //no setTlsAttributeRequired method found on this class
            case "condition" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setCondition(value);
                return true;
            case "maxLogMessageBufferSize" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setMaxLogMessageBufferSize(Integer.valueOf(value));
                return true;
            case "ipv6Canonical" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setIpv6Canonical(Boolean.valueOf(value));
                return true;
            //no setLocaleName method found on this class
            case "pattern" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setPattern(value);
                return true;
            case "conditionIf" :
                ((org.apache.catalina.valves.AbstractAccessLogValve)o).setConditionIf(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaValvesValveBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaValvesValveBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setDomainInternal method found on this class
            case "asyncSupported" :
                ((org.apache.catalina.valves.ValveBase)o).setAsyncSupported(Boolean.valueOf(value));
                return true;
            //no setObjectNameKeyProperties method found on this class
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreStandardServer(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "periodicEventDelay" :
                ((org.apache.catalina.core.StandardServer)o).setPeriodicEventDelay(Integer.valueOf(value));
                return true;
            //no setDomainInternal method found on this class
            case "portOffset" :
                ((org.apache.catalina.core.StandardServer)o).setPortOffset(Integer.valueOf(value));
                return true;
            case "utilityThreads" :
                ((org.apache.catalina.core.StandardServer)o).setUtilityThreads(Integer.valueOf(value));
                return true;
            //no setStopAwait method found on this class
            //no setServerBuilt method found on this class
            //no setServerNumber method found on this class
            //no setServerInfo method found on this class
            case "port" :
                ((org.apache.catalina.core.StandardServer)o).setPort(Integer.valueOf(value));
                return true;
            case "shutdown" :
                ((org.apache.catalina.core.StandardServer)o).setShutdown(value);
                return true;
            //no setPortWithOffset method found on this class
            //no setObjectNameKeyProperties method found on this class
            case "address" :
                ((org.apache.catalina.core.StandardServer)o).setAddress(value);
                return true;
            case "utilityThreadsAsDaemon" :
                ((org.apache.catalina.core.StandardServer)o).setUtilityThreadsAsDaemon(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaRealmUserDatabaseRealm(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "resourceName" :
                ((org.apache.catalina.realm.UserDatabaseRealm)o).setResourceName(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaRealmRealmBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaRealmRealmBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setObjectNameKeyProperties method found on this class
            case "stripRealmForGss" :
                ((org.apache.catalina.realm.RealmBase)o).setStripRealmForGss(Boolean.valueOf(value));
                return true;
            //no setDomainInternal method found on this class
            case "allRolesMode" :
                ((org.apache.catalina.realm.RealmBase)o).setAllRolesMode(value);
                return true;
            case "x509UsernameRetrieverClassName" :
                ((org.apache.catalina.realm.RealmBase)o).setX509UsernameRetrieverClassName(value);
                return true;
            case "transportGuaranteeRedirectStatus" :
                ((org.apache.catalina.realm.RealmBase)o).setTransportGuaranteeRedirectStatus(Integer.valueOf(value));
                return true;
            //no setRealmSuffix method found on this class
            case "validate" :
                ((org.apache.catalina.realm.RealmBase)o).setValidate(Boolean.valueOf(value));
                return true;
            case "realmPath" :
                ((org.apache.catalina.realm.RealmBase)o).setRealmPath(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreStandardService(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setDomainInternal method found on this class
            //no setObjectNameKeyProperties method found on this class
            case "name" :
                ((org.apache.catalina.core.StandardService)o).setName(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreStandardContext(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "charsetMapperClass" :
                ((org.apache.catalina.core.StandardContext)o).setCharsetMapperClass(value);
                return true;
            case "skipMemoryLeakChecksOnJvmShutdown" :
                ((org.apache.catalina.core.StandardContext)o).setSkipMemoryLeakChecksOnJvmShutdown(Boolean.valueOf(value));
                return true;
            case "server" :
                ((org.apache.catalina.core.StandardContext)o).setServer(value);
                return true;
            case "docBase" :
                ((org.apache.catalina.core.StandardContext)o).setDocBase(value);
                return true;
            case "allowMultipleLeadingForwardSlashInPath" :
                ((org.apache.catalina.core.StandardContext)o).setAllowMultipleLeadingForwardSlashInPath(Boolean.valueOf(value));
                return true;
            case "sendRedirectBody" :
                ((org.apache.catalina.core.StandardContext)o).setSendRedirectBody(Boolean.valueOf(value));
                return true;
            case "defaultWebXml" :
                ((org.apache.catalina.core.StandardContext)o).setDefaultWebXml(value);
                return true;
            case "displayName" :
                ((org.apache.catalina.core.StandardContext)o).setDisplayName(value);
                return true;
            //no setWorkPath method found on this class
            case "reloadable" :
                ((org.apache.catalina.core.StandardContext)o).setReloadable(Boolean.valueOf(value));
                return true;
            case "effectiveMinorVersion" :
                ((org.apache.catalina.core.StandardContext)o).setEffectiveMinorVersion(Integer.valueOf(value));
                return true;
            case "swallowOutput" :
                ((org.apache.catalina.core.StandardContext)o).setSwallowOutput(Boolean.valueOf(value));
                return true;
            //no setRequestEncoding method found on this class
            case "cookies" :
                ((org.apache.catalina.core.StandardContext)o).setCookies(Boolean.valueOf(value));
                return true;
            case "clearReferencesThreadLocals" :
                ((org.apache.catalina.core.StandardContext)o).setClearReferencesThreadLocals(Boolean.valueOf(value));
                return true;
            case "delegate" :
                ((org.apache.catalina.core.StandardContext)o).setDelegate(Boolean.valueOf(value));
                return true;
            case "mapperDirectoryRedirectEnabled" :
                ((org.apache.catalina.core.StandardContext)o).setMapperDirectoryRedirectEnabled(Boolean.valueOf(value));
                return true;
            //no setServlet22 method found on this class
            case "preemptiveAuthentication" :
                ((org.apache.catalina.core.StandardContext)o).setPreemptiveAuthentication(Boolean.valueOf(value));
                return true;
            case "wrapperClass" :
                ((org.apache.catalina.core.StandardContext)o).setWrapperClass(value);
                return true;
            //no setMinTime method found on this class
            case "requestCharacterEncoding" :
                ((org.apache.catalina.core.StandardContext)o).setRequestCharacterEncoding(value);
                return true;
            case "fireRequestListenersOnForwards" :
                ((org.apache.catalina.core.StandardContext)o).setFireRequestListenersOnForwards(Boolean.valueOf(value));
                return true;
            case "override" :
                ((org.apache.catalina.core.StandardContext)o).setOverride(Boolean.valueOf(value));
                return true;
            case "tldValidation" :
                ((org.apache.catalina.core.StandardContext)o).setTldValidation(Boolean.valueOf(value));
                return true;
            case "workDir" :
                ((org.apache.catalina.core.StandardContext)o).setWorkDir(value);
                return true;
            //no setStartTime method found on this class
            //no setWebXmlValidation method found on this class
            case "dispatchersUseEncodedPaths" :
                ((org.apache.catalina.core.StandardContext)o).setDispatchersUseEncodedPaths(Boolean.valueOf(value));
                return true;
            case "allowCasualMultipartParsing" :
                ((org.apache.catalina.core.StandardContext)o).setAllowCasualMultipartParsing(Boolean.valueOf(value));
                return true;
            //no setRequestCount method found on this class
            case "addWebinfClassesResources" :
                ((org.apache.catalina.core.StandardContext)o).setAddWebinfClassesResources(Boolean.valueOf(value));
                return true;
            case "j2EEApplication" :
                ((org.apache.catalina.core.StandardContext)o).setJ2EEApplication(value);
                return true;
            case "distributable" :
                ((org.apache.catalina.core.StandardContext)o).setDistributable(Boolean.valueOf(value));
                return true;
            case "mapperContextRootRedirectEnabled" :
                ((org.apache.catalina.core.StandardContext)o).setMapperContextRootRedirectEnabled(Boolean.valueOf(value));
                return true;
            case "sessionCookiePath" :
                ((org.apache.catalina.core.StandardContext)o).setSessionCookiePath(value);
                return true;
            case "sessionCookiePathUsesTrailingSlash" :
                ((org.apache.catalina.core.StandardContext)o).setSessionCookiePathUsesTrailingSlash(Boolean.valueOf(value));
                return true;
            case "j2EEServer" :
                ((org.apache.catalina.core.StandardContext)o).setJ2EEServer(value);
                return true;
            case "startupTime" :
                ((org.apache.catalina.core.StandardContext)o).setStartupTime(Long.valueOf(value));
                return true;
            case "clearReferencesRmiTargets" :
                ((org.apache.catalina.core.StandardContext)o).setClearReferencesRmiTargets(Boolean.valueOf(value));
                return true;
            case "xmlNamespaceAware" :
                ((org.apache.catalina.core.StandardContext)o).setXmlNamespaceAware(Boolean.valueOf(value));
                return true;
            case "tldScanTime" :
                ((org.apache.catalina.core.StandardContext)o).setTldScanTime(Long.valueOf(value));
                return true;
            case "clearReferencesHttpClientKeepAliveThread" :
                ((org.apache.catalina.core.StandardContext)o).setClearReferencesHttpClientKeepAliveThread(Boolean.valueOf(value));
                return true;
            //no setInProgressAsyncCount method found on this class
            case "validateClientProvidedNewSessionId" :
                ((org.apache.catalina.core.StandardContext)o).setValidateClientProvidedNewSessionId(Boolean.valueOf(value));
                return true;
            case "replaceWelcomeFiles" :
                ((org.apache.catalina.core.StandardContext)o).setReplaceWelcomeFiles(Boolean.valueOf(value));
                return true;
            case "useRelativeRedirects" :
                ((org.apache.catalina.core.StandardContext)o).setUseRelativeRedirects(Boolean.valueOf(value));
                return true;
            case "sessionCookieDomain" :
                ((org.apache.catalina.core.StandardContext)o).setSessionCookieDomain(value);
                return true;
            case "crossContext" :
                ((org.apache.catalina.core.StandardContext)o).setCrossContext(Boolean.valueOf(value));
                return true;
            case "sessionCookieName" :
                ((org.apache.catalina.core.StandardContext)o).setSessionCookieName(value);
                return true;
            case "defaultContextXml" :
                ((org.apache.catalina.core.StandardContext)o).setDefaultContextXml(value);
                return true;
            case "publicId" :
                ((org.apache.catalina.core.StandardContext)o).setPublicId(value);
                return true;
            case "denyUncoveredHttpMethods" :
                ((org.apache.catalina.core.StandardContext)o).setDenyUncoveredHttpMethods(Boolean.valueOf(value));
                return true;
            //no setEncodedPath method found on this class
            case "antiResourceLocking" :
                ((org.apache.catalina.core.StandardContext)o).setAntiResourceLocking(Boolean.valueOf(value));
                return true;
            //no setPaused method found on this class
            case "resourceOnlyServlets" :
                ((org.apache.catalina.core.StandardContext)o).setResourceOnlyServlets(value);
                return true;
            //no setNamingContextName method found on this class
            case "clearReferencesObjectStreamClassCaches" :
                ((org.apache.catalina.core.StandardContext)o).setClearReferencesObjectStreamClassCaches(Boolean.valueOf(value));
                return true;
            case "useNaming" :
                ((org.apache.catalina.core.StandardContext)o).setUseNaming(Boolean.valueOf(value));
                return true;
            //no setComputedFailCtxIfServletStartFails method found on this class
            case "logEffectiveWebXml" :
                ((org.apache.catalina.core.StandardContext)o).setLogEffectiveWebXml(Boolean.valueOf(value));
                return true;
            case "originalDocBase" :
                ((org.apache.catalina.core.StandardContext)o).setOriginalDocBase(value);
                return true;
            case "path" :
                ((org.apache.catalina.core.StandardContext)o).setPath(value);
                return true;
            case "useHttpOnly" :
                ((org.apache.catalina.core.StandardContext)o).setUseHttpOnly(Boolean.valueOf(value));
                return true;
            case "clearReferencesStopTimerThreads" :
                ((org.apache.catalina.core.StandardContext)o).setClearReferencesStopTimerThreads(Boolean.valueOf(value));
                return true;
            case "responseCharacterEncoding" :
                ((org.apache.catalina.core.StandardContext)o).setResponseCharacterEncoding(value);
                return true;
            //no setBaseName method found on this class
            //no setMaxTime method found on this class
            //no setErrorCount method found on this class
            case "configured" :
                ((org.apache.catalina.core.StandardContext)o).setConfigured(Boolean.valueOf(value));
                return true;
            case "containerSciFilter" :
                ((org.apache.catalina.core.StandardContext)o).setContainerSciFilter(value);
                return true;
            case "ignoreAnnotations" :
                ((org.apache.catalina.core.StandardContext)o).setIgnoreAnnotations(Boolean.valueOf(value));
                return true;
            //no setWebXmlNamespaceAware method found on this class
            case "unloadDelay" :
                ((org.apache.catalina.core.StandardContext)o).setUnloadDelay(Long.valueOf(value));
                return true;
            //no setResponseEncoding method found on this class
            case "jndiExceptionOnFailedWrite" :
                ((org.apache.catalina.core.StandardContext)o).setJndiExceptionOnFailedWrite(Boolean.valueOf(value));
                return true;
            //no setObjectNameKeyProperties method found on this class
            case "createUploadTargets" :
                ((org.apache.catalina.core.StandardContext)o).setCreateUploadTargets(Boolean.valueOf(value));
                return true;
            //no setProcessingTime method found on this class
            case "clearReferencesStopThreads" :
                ((org.apache.catalina.core.StandardContext)o).setClearReferencesStopThreads(Boolean.valueOf(value));
                return true;
            case "privileged" :
                ((org.apache.catalina.core.StandardContext)o).setPrivileged(Boolean.valueOf(value));
                return true;
            //no setWrapperClassName method found on this class
            case "xmlValidation" :
                ((org.apache.catalina.core.StandardContext)o).setXmlValidation(Boolean.valueOf(value));
                return true;
            case "swallowAbortedUploads" :
                ((org.apache.catalina.core.StandardContext)o).setSwallowAbortedUploads(Boolean.valueOf(value));
                return true;
            case "webappVersion" :
                ((org.apache.catalina.core.StandardContext)o).setWebappVersion(value);
                return true;
            case "xmlBlockExternal" :
                ((org.apache.catalina.core.StandardContext)o).setXmlBlockExternal(Boolean.valueOf(value));
                return true;
            case "copyXML" :
                ((org.apache.catalina.core.StandardContext)o).setCopyXML(Boolean.valueOf(value));
                return true;
            case "unpackWAR" :
                ((org.apache.catalina.core.StandardContext)o).setUnpackWAR(Boolean.valueOf(value));
                return true;
            case "sessionTimeout" :
                ((org.apache.catalina.core.StandardContext)o).setSessionTimeout(Integer.valueOf(value));
                return true;
            case "renewThreadsWhenStoppingContext" :
                ((org.apache.catalina.core.StandardContext)o).setRenewThreadsWhenStoppingContext(Boolean.valueOf(value));
                return true;
            case "effectiveMajorVersion" :
                ((org.apache.catalina.core.StandardContext)o).setEffectiveMajorVersion(Integer.valueOf(value));
                return true;
            case "altDDName" :
                ((org.apache.catalina.core.StandardContext)o).setAltDDName(value);
                return true;
        }
        return setPropertyForOrgApacheCatalinaCoreContainerBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreStandardHost(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "deployOnStartup" :
                ((org.apache.catalina.core.StandardHost)o).setDeployOnStartup(Boolean.valueOf(value));
                return true;
            case "name" :
                ((org.apache.catalina.core.StandardHost)o).setName(value);
                return true;
            case "undeployOldVersions" :
                ((org.apache.catalina.core.StandardHost)o).setUndeployOldVersions(Boolean.valueOf(value));
                return true;
            case "deployXML" :
                ((org.apache.catalina.core.StandardHost)o).setDeployXML(Boolean.valueOf(value));
                return true;
            case "errorReportValveClass" :
                ((org.apache.catalina.core.StandardHost)o).setErrorReportValveClass(value);
                return true;
            case "deployIgnore" :
                ((org.apache.catalina.core.StandardHost)o).setDeployIgnore(value);
                return true;
            case "workDir" :
                ((org.apache.catalina.core.StandardHost)o).setWorkDir(value);
                return true;
            case "xmlBase" :
                ((org.apache.catalina.core.StandardHost)o).setXmlBase(value);
                return true;
            case "appBase" :
                ((org.apache.catalina.core.StandardHost)o).setAppBase(value);
                return true;
            case "createDirs" :
                ((org.apache.catalina.core.StandardHost)o).setCreateDirs(Boolean.valueOf(value));
                return true;
            case "copyXML" :
                ((org.apache.catalina.core.StandardHost)o).setCopyXML(Boolean.valueOf(value));
                return true;
            case "autoDeploy" :
                ((org.apache.catalina.core.StandardHost)o).setAutoDeploy(Boolean.valueOf(value));
                return true;
            case "failCtxIfServletStartFails" :
                ((org.apache.catalina.core.StandardHost)o).setFailCtxIfServletStartFails(Boolean.valueOf(value));
                return true;
            //no setObjectNameKeyProperties method found on this class
            case "contextClass" :
                ((org.apache.catalina.core.StandardHost)o).setContextClass(value);
                return true;
            case "configClass" :
                ((org.apache.catalina.core.StandardHost)o).setConfigClass(value);
                return true;
            case "unpackWARs" :
                ((org.apache.catalina.core.StandardHost)o).setUnpackWARs(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCatalinaCoreContainerBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreStandardEngine(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "defaultHost" :
                ((org.apache.catalina.core.StandardEngine)o).setDefaultHost(value);
                return true;
            //no setObjectNameKeyProperties method found on this class
            case "jvmRoute" :
                ((org.apache.catalina.core.StandardEngine)o).setJvmRoute(value);
                return true;
            //no setDomainInternal method found on this class
            //no setJvmRouteId method found on this class
        }
        return setPropertyForOrgApacheCatalinaCoreContainerBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaCoreContainerBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setMBeanKeyProperties method found on this class
            //no setLogName method found on this class
            case "name" :
                ((org.apache.catalina.core.ContainerBase)o).setName(value);
                return true;
            //no setAccessLogScanComplete method found on this class
            //no setDomainInternal method found on this class
            case "startStopThreads" :
                ((org.apache.catalina.core.ContainerBase)o).setStartStopThreads(Integer.valueOf(value));
                return true;
            case "backgroundProcessorDelay" :
                ((org.apache.catalina.core.ContainerBase)o).setBackgroundProcessorDelay(Integer.valueOf(value));
                return true;
            case "startChildren" :
                ((org.apache.catalina.core.ContainerBase)o).setStartChildren(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaUtilLifecycleMBeanBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "domain" :
                ((org.apache.catalina.util.LifecycleMBeanBase)o).setDomain(value);
                return true;
            //no setObjectNameKeyProperties method found on this class
            //no setDomainInternal method found on this class
        }
        return setPropertyForOrgApacheCatalinaUtilLifecycleBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaUtilLifecycleBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "throwOnFailure" :
                ((org.apache.catalina.util.LifecycleBase)o).setThrowOnFailure(Boolean.valueOf(value));
                return true;
            //no setStateName method found on this class
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaLoaderParallelWebappClassLoader(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
        }
        return setPropertyForOrgApacheCatalinaLoaderWebappClassLoaderBase(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCatalinaLoaderWebappClassLoaderBase(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "clearReferencesHttpClientKeepAliveThread" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesHttpClientKeepAliveThread(Boolean.valueOf(value));
                return true;
            //no setHostName method found on this class
            case "skipMemoryLeakChecksOnJvmShutdown" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setSkipMemoryLeakChecksOnJvmShutdown(Boolean.valueOf(value));
                return true;
            //no setContextName method found on this class
            case "clearReferencesObjectStreamClassCaches" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesObjectStreamClassCaches(Boolean.valueOf(value));
                return true;
            case "clearReferencesRmiTargets" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesRmiTargets(Boolean.valueOf(value));
                return true;
            case "clearReferencesLogFactoryRelease" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesLogFactoryRelease(Boolean.valueOf(value));
                return true;
            case "clearReferencesThreadLocals" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesThreadLocals(Boolean.valueOf(value));
                return true;
            case "clearReferencesStopThreads" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesStopThreads(Boolean.valueOf(value));
                return true;
            //no setStateName method found on this class
            //no setServiceName method found on this class
            case "delegate" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setDelegate(Boolean.valueOf(value));
                return true;
            //no setWebappName method found on this class
            //no setHasExternalRepositories method found on this class
            case "clearReferencesStopTimerThreads" :
                ((org.apache.catalina.loader.WebappClassLoaderBase)o).setClearReferencesStopTimerThreads(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForJavaNetURLClassLoader(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForJavaNetURLClassLoader(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
        }
        return setPropertyForJavaSecuritySecureClassLoader(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForJavaSecuritySecureClassLoader(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
        }
        return setPropertyForJavaLangClassLoader(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForJavaLangClassLoader(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            //no setSclSet method found on this class
            case "defaultAssertionStatus" :
                ((java.lang.ClassLoader)o).setDefaultAssertionStatus(Boolean.valueOf(value));
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCoyoteAjpAjpNioProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "namePrefix" :
                ((org.apache.coyote.ajp.AjpNioProtocol)o).setProperty(name, value);
                return true;
        }
        return setPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteAjpAjpNio2Protocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "namePrefix" :
                ((org.apache.coyote.ajp.AjpNio2Protocol)o).setProperty(name, value);
                return true;
        }
        return setPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteAjpAjpAprProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "pollTime" :
                ((org.apache.coyote.ajp.AjpAprProtocol)o).setPollTime(Integer.valueOf(value));
                return true;
            case "namePrefix" :
                ((org.apache.coyote.ajp.AjpAprProtocol)o).setProperty(name, value);
                return true;
            case "aprRequired" :
                ((org.apache.coyote.ajp.AjpAprProtocol)o).setProperty(name, value);
                return true;
        }
        return setPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteAjpAbstractAjpProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "secret" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setSecret(value);
                return true;
            case "desiredBufferSize" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setProperty(name, value);
                return true;
            case "tomcatAuthorization" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setTomcatAuthorization(Boolean.valueOf(value));
                return true;
            case "requiredSecret" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setRequiredSecret(value);
                return true;
            case "ajpFlush" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setAjpFlush(Boolean.valueOf(value));
                return true;
            case "secretRequired" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setSecretRequired(Boolean.valueOf(value));
                return true;
            case "protocolName" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setProperty(name, value);
                return true;
            case "allowedRequestAttributesPattern" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setAllowedRequestAttributesPattern(value);
                return true;
            case "packetSize" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setPacketSize(Integer.valueOf(value));
                return true;
            case "tomcatAuthentication" :
                ((org.apache.coyote.ajp.AbstractAjpProtocol)o).setTomcatAuthentication(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCoyoteAbstractProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteHttp11Http11AprProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "aprRequired" :
                ((org.apache.coyote.http11.Http11AprProtocol)o).setProperty(name, value);
                return true;
            case "pollTime" :
                ((org.apache.coyote.http11.Http11AprProtocol)o).setPollTime(Integer.valueOf(value));
                return true;
            case "namePrefix" :
                ((org.apache.coyote.http11.Http11AprProtocol)o).setProperty(name, value);
                return true;
            case "deferAccept" :
                ((org.apache.coyote.http11.Http11AprProtocol)o).setDeferAccept(Boolean.valueOf(value));
                return true;
            case "sendfileSize" :
                ((org.apache.coyote.http11.Http11AprProtocol)o).setSendfileSize(Integer.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCoyoteHttp11AbstractHttp11Protocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteHttp11Http11Nio2Protocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "namePrefix" :
                ((org.apache.coyote.http11.Http11Nio2Protocol)o).setProperty(name, value);
                return true;
        }
        return setPropertyForOrgApacheCoyoteHttp11AbstractHttp11JsseProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteHttp11Http11NioProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "selectorTimeout" :
                ((org.apache.coyote.http11.Http11NioProtocol)o).setSelectorTimeout(Long.valueOf(value));
                return true;
            case "namePrefix" :
                ((org.apache.coyote.http11.Http11NioProtocol)o).setProperty(name, value);
                return true;
            case "pollerThreadCount" :
                ((org.apache.coyote.http11.Http11NioProtocol)o).setPollerThreadCount(Integer.valueOf(value));
                return true;
            case "pollerThreadPriority" :
                ((org.apache.coyote.http11.Http11NioProtocol)o).setPollerThreadPriority(Integer.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCoyoteHttp11AbstractHttp11JsseProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteHttp11AbstractHttp11JsseProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "sslImplementationShortName" :
                ((org.apache.coyote.http11.AbstractHttp11JsseProtocol)o).setProperty(name, value);
                return true;
            case "sslImplementationName" :
                ((org.apache.coyote.http11.AbstractHttp11JsseProtocol)o).setSslImplementationName(value);
                return true;
            case "sniParseLimit" :
                ((org.apache.coyote.http11.AbstractHttp11JsseProtocol)o).setSniParseLimit(Integer.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheCoyoteHttp11AbstractHttp11Protocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteHttp11AbstractHttp11Protocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "crlFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setCrlFile(value);
                return true;
            case "truststorePass" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTruststorePass(value);
                return true;
            case "maxExtensionSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setMaxExtensionSize(Integer.valueOf(value));
                return true;
            case "sslProtocol" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSslProtocol(value);
                return true;
            case "compressionMinSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setCompressionMinSize(Integer.valueOf(value));
                return true;
            case "truststoreFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTruststoreFile(value);
                return true;
            case "server" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setServer(value);
                return true;
            case "SSLVerifyDepth" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLVerifyDepth(Integer.valueOf(value));
                return true;
            case "rejectIllegalHeader" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setRejectIllegalHeader(Boolean.valueOf(value));
                return true;
            case "keystoreProvider" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setKeystoreProvider(value);
                return true;
            case "SSLCARevocationPath" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCARevocationPath(value);
                return true;
            case "disableUploadTimeout" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setDisableUploadTimeout(Boolean.valueOf(value));
                return true;
            case "allowedTrailerHeaders" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setAllowedTrailerHeaders(value);
                return true;
            case "useKeepAliveResponseHeader" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setUseKeepAliveResponseHeader(Boolean.valueOf(value));
                return true;
            case "ciphers" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setCiphers(value);
                return true;
            case "maxSavePostSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setMaxSavePostSize(Integer.valueOf(value));
                return true;
            case "SSLCACertificatePath" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCACertificatePath(value);
                return true;
            case "protocolName" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setProperty(name, value);
                return true;
            case "allowHostHeaderMismatch" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setAllowHostHeaderMismatch(Boolean.valueOf(value));
                return true;
            case "useSendfile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setUseSendfile(Boolean.valueOf(value));
                return true;
            case "compressibleMimeType" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setCompressibleMimeType(value);
                return true;
            case "noCompressionUserAgents" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setNoCompressionUserAgents(value);
                return true;
            case "SSLCertificateKeyFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCertificateKeyFile(value);
                return true;
            case "sslEnabledProtocols" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSslEnabledProtocols(value);
                return true;
            case "keystoreFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setKeystoreFile(value);
                return true;
            case "truststoreAlgorithm" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTruststoreAlgorithm(value);
                return true;
            case "SSLCACertificateFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCACertificateFile(value);
                return true;
            case "connectionUploadTimeout" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setConnectionUploadTimeout(Integer.valueOf(value));
                return true;
            case "relaxedQueryChars" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setRelaxedQueryChars(value);
                return true;
            case "trustManagerClassName" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTrustManagerClassName(value);
                return true;
            case "restrictedUserAgents" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setRestrictedUserAgents(value);
                return true;
            case "keyAlias" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setKeyAlias(value);
                return true;
            case "defaultSSLHostConfigName" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setDefaultSSLHostConfigName(value);
                return true;
            case "useServerCipherSuitesOrder" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setUseServerCipherSuitesOrder(Boolean.valueOf(value));
                return true;
            case "SSLHonorCipherOrder" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLHonorCipherOrder(Boolean.valueOf(value));
                return true;
            case "secure" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSecure(Boolean.valueOf(value));
                return true;
            case "keyPass" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setKeyPass(value);
                return true;
            case "sessionCacheSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSessionCacheSize(Integer.valueOf(value));
                return true;
            case "SSLVerifyClient" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLVerifyClient(value);
                return true;
            case "compression" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setCompression(value);
                return true;
            case "keystorePass" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setKeystorePass(value);
                return true;
            case "trustMaxCertLength" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTrustMaxCertLength(Integer.valueOf(value));
                return true;
            case "serverRemoveAppProvidedValues" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setServerRemoveAppProvidedValues(Boolean.valueOf(value));
                return true;
            case "algorithm" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setAlgorithm(value);
                return true;
            case "truststoreType" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTruststoreType(value);
                return true;
            case "compressionLevel" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setProperty(name, value);
                return true;
            case "maxTrailerSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setMaxTrailerSize(Integer.valueOf(value));
                return true;
            case "SSLProtocol" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLProtocol(value);
                return true;
            case "SSLEnabled" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLEnabled(Boolean.valueOf(value));
                return true;
            case "relaxedPathChars" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setRelaxedPathChars(value);
                return true;
            case "SSLPassword" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLPassword(value);
                return true;
            case "keystoreType" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setKeystoreType(value);
                return true;
            case "maxSwallowSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setMaxSwallowSize(Integer.valueOf(value));
                return true;
            case "rejectIllegalHeaderName" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setRejectIllegalHeaderName(Boolean.valueOf(value));
                return true;
            case "SSLCipherSuite" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCipherSuite(value);
                return true;
            case "truststoreProvider" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setTruststoreProvider(value);
                return true;
            case "clientAuth" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setClientAuth(value);
                return true;
            case "maxHttpHeaderSize" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setMaxHttpHeaderSize(Integer.valueOf(value));
                return true;
            case "noCompressionStrongETag" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setNoCompressionStrongETag(Boolean.valueOf(value));
                return true;
            case "SSLCertificateFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCertificateFile(value);
                return true;
            case "maxKeepAliveRequests" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setMaxKeepAliveRequests(Integer.valueOf(value));
                return true;
            case "SSLDisableSessionTickets" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLDisableSessionTickets(Boolean.valueOf(value));
                return true;
            case "SSLCARevocationFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCARevocationFile(value);
                return true;
            case "sessionTimeout" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSessionTimeout(Integer.valueOf(value));
                return true;
            case "SSLDisableCompression" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLDisableCompression(Boolean.valueOf(value));
                return true;
            case "SSLCertificateChainFile" :
                ((org.apache.coyote.http11.AbstractHttp11Protocol)o).setSSLCertificateChainFile(value);
                return true;
        }
        return setPropertyForOrgApacheCoyoteAbstractProtocol(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheCoyoteAbstractProtocol(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "nameIndex" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "aprRequired" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "protocolName" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "paused" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "sendfileSupported" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "acceptCount" :
                ((org.apache.coyote.AbstractProtocol)o).setAcceptCount(Integer.valueOf(value));
                return true;
            case "portOffset" :
                ((org.apache.coyote.AbstractProtocol)o).setPortOffset(Integer.valueOf(value));
                return true;
            case "connectionTimeout" :
                ((org.apache.coyote.AbstractProtocol)o).setConnectionTimeout(Integer.valueOf(value));
                return true;
            case "maxConnections" :
                ((org.apache.coyote.AbstractProtocol)o).setMaxConnections(Integer.valueOf(value));
                return true;
            case "tcpNoDelay" :
                ((org.apache.coyote.AbstractProtocol)o).setTcpNoDelay(Boolean.valueOf(value));
                return true;
            case "maxThreads" :
                ((org.apache.coyote.AbstractProtocol)o).setMaxThreads(Integer.valueOf(value));
                return true;
            case "connectionCount" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "connectionLinger" :
                ((org.apache.coyote.AbstractProtocol)o).setConnectionLinger(Integer.valueOf(value));
                return true;
            case "portWithOffset" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "namePrefix" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "name" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "minSpareThreads" :
                ((org.apache.coyote.AbstractProtocol)o).setMinSpareThreads(Integer.valueOf(value));
                return true;
            case "keepAliveTimeout" :
                ((org.apache.coyote.AbstractProtocol)o).setKeepAliveTimeout(Integer.valueOf(value));
                return true;
            case "clientCertProvider" :
                ((org.apache.coyote.AbstractProtocol)o).setClientCertProvider(value);
                return true;
            case "localPort" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "port" :
                ((org.apache.coyote.AbstractProtocol)o).setPort(Integer.valueOf(value));
                return true;
            case "domain" :
                ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
                return true;
            case "threadPriority" :
                ((org.apache.coyote.AbstractProtocol)o).setThreadPriority(Integer.valueOf(value));
                return true;
            case "acceptorThreadCount" :
                ((org.apache.coyote.AbstractProtocol)o).setAcceptorThreadCount(Integer.valueOf(value));
                return true;
            case "processorCache" :
                ((org.apache.coyote.AbstractProtocol)o).setProcessorCache(Integer.valueOf(value));
                return true;
            case "acceptorThreadPriority" :
                ((org.apache.coyote.AbstractProtocol)o).setAcceptorThreadPriority(Integer.valueOf(value));
                return true;
            case "address" :
                ((org.apache.coyote.AbstractProtocol)o).setAddress(getInetAddress(value));
                return true;
            case "maxHeaderCount" :
                ((org.apache.coyote.AbstractProtocol)o).setMaxHeaderCount(Integer.valueOf(value));
                return true;
        }
        if (invokeSetProperty) {
            ((org.apache.coyote.AbstractProtocol)o).setProperty(name, value);
            return true;
        }
        return true;
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetSocketProperties(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "soLingerOn" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setSoLingerOn(Boolean.valueOf(value));
                return true;
            case "directBuffer" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setDirectBuffer(Boolean.valueOf(value));
                return true;
            case "soKeepAlive" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setSoKeepAlive(Boolean.valueOf(value));
                return true;
            case "txBufSize" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setTxBufSize(Integer.valueOf(value));
                return true;
            case "soTimeout" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setSoTimeout(Integer.valueOf(value));
                return true;
            case "ooBInline" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setOoBInline(Boolean.valueOf(value));
                return true;
            case "rxBufSize" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setRxBufSize(Integer.valueOf(value));
                return true;
            case "appWriteBufSize" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setAppWriteBufSize(Integer.valueOf(value));
                return true;
            case "bufferPool" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setBufferPool(Integer.valueOf(value));
                return true;
            case "appReadBufSize" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setAppReadBufSize(Integer.valueOf(value));
                return true;
            case "directBufferPool" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setDirectBufferPool(Integer.valueOf(value));
                return true;
            case "bufferPoolSize" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setBufferPoolSize(Integer.valueOf(value));
                return true;
            case "directSslBuffer" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setDirectSslBuffer(Boolean.valueOf(value));
                return true;
            case "soLingerTime" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setSoLingerTime(Integer.valueOf(value));
                return true;
            case "performanceConnectionTime" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setPerformanceConnectionTime(Integer.valueOf(value));
                return true;
            case "soReuseAddress" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setSoReuseAddress(Boolean.valueOf(value));
                return true;
            case "unlockTimeout" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setUnlockTimeout(Integer.valueOf(value));
                return true;
            case "performanceBandwidth" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setPerformanceBandwidth(Integer.valueOf(value));
                return true;
            case "performanceLatency" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setPerformanceLatency(Integer.valueOf(value));
                return true;
            case "tcpNoDelay" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setTcpNoDelay(Boolean.valueOf(value));
                return true;
            case "processorCache" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setProcessorCache(Integer.valueOf(value));
                return true;
            case "eventCache" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setEventCache(Integer.valueOf(value));
                return true;
            case "timeoutInterval" :
                ((org.apache.tomcat.util.net.SocketProperties)o).setTimeoutInterval(Long.valueOf(value));
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetNioSelectorPool(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "enabled" :
                ((org.apache.tomcat.util.net.NioSelectorPool)o).setEnabled(Boolean.valueOf(value));
                return true;
            case "maxSelectors" :
                ((org.apache.tomcat.util.net.NioSelectorPool)o).setMaxSelectors(Integer.valueOf(value));
                return true;
            case "sharedSelectorTimeout" :
                ((org.apache.tomcat.util.net.NioSelectorPool)o).setSharedSelectorTimeout(Long.valueOf(value));
                return true;
            case "shared" :
                ((org.apache.tomcat.util.net.NioSelectorPool)o).setShared(Boolean.valueOf(value));
                return true;
            case "maxSpareSelectors" :
                ((org.apache.tomcat.util.net.NioSelectorPool)o).setMaxSpareSelectors(Integer.valueOf(value));
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProperty(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "name" :
                ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Property)o).setName(value);
                return true;
            case "value" :
                ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Property)o).setValue(value);
                return true;
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaAuthenticatorJaspicSimpleAuthConfigProvider(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
        }
        return false;
    }

    public static boolean setPropertyForOrgApacheCatalinaAuthenticatorJaspicPersistentProviderRegistrationsProvider(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "appContext" :
                ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).setAppContext(value);
                return true;
            case "className" :
                ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).setClassName(value);
                return true;
            case "description" :
                ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).setDescription(value);
                return true;
            case "layer" :
                ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).setLayer(value);
                return true;
        }
        if (invokeSetProperty) {
            ((org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Provider)o).setProperty(name, value);
            return true;
        }
        return true;
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetNioEndpoint(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "pollerThreadPriority" :
                ((org.apache.tomcat.util.net.NioEndpoint)o).setPollerThreadPriority(Integer.valueOf(value));
                return true;
            case "keepAliveCount" :
                ((org.apache.tomcat.util.net.NioEndpoint)o).setProperty(name, value);
                return true;
            case "pollerThreadCount" :
                ((org.apache.tomcat.util.net.NioEndpoint)o).setPollerThreadCount(Integer.valueOf(value));
                return true;
            case "selectorTimeout" :
                ((org.apache.tomcat.util.net.NioEndpoint)o).setSelectorTimeout(Long.valueOf(value));
                return true;
            case "useInheritedChannel" :
                ((org.apache.tomcat.util.net.NioEndpoint)o).setUseInheritedChannel(Boolean.valueOf(value));
                return true;
            case "deferAccept" :
                ((org.apache.tomcat.util.net.NioEndpoint)o).setProperty(name, value);
                return true;
        }
        if (invokeSetProperty) {
            ((org.apache.tomcat.util.net.NioEndpoint)o).setProperty(name, value);
            return true;
        }
        return setPropertyForOrgApacheTomcatUtilNetAbstractJsseEndpoint(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetNio2Endpoint(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "keepAliveCount" :
                ((org.apache.tomcat.util.net.Nio2Endpoint)o).setProperty(name, value);
                return true;
            case "deferAccept" :
                ((org.apache.tomcat.util.net.Nio2Endpoint)o).setProperty(name, value);
                return true;
            case "inline" :
                ((org.apache.tomcat.util.net.Nio2Endpoint)o).setProperty(name, value);
                return true;
            case "allClosed" :
                ((org.apache.tomcat.util.net.Nio2Endpoint)o).setProperty(name, value);
                return true;
        }
        return setPropertyForOrgApacheTomcatUtilNetAbstractJsseEndpoint(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetAbstractJsseEndpoint(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "sslImplementationName" :
                ((org.apache.tomcat.util.net.AbstractJsseEndpoint)o).setSslImplementationName(value);
                return true;
            case "alpnSupported" :
                ((org.apache.tomcat.util.net.AbstractJsseEndpoint)o).setProperty(name, value);
                return true;
            case "sniParseLimit" :
                ((org.apache.tomcat.util.net.AbstractJsseEndpoint)o).setSniParseLimit(Integer.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheTomcatUtilNetAbstractEndpoint(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetAprEndpoint(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "rootPool" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "pollTime" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setPollTime(Integer.valueOf(value));
                return true;
            case "serverSockPool" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "sendfileSize" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setSendfileSize(Integer.valueOf(value));
                return true;
            case "alpnSupported" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "keepAliveCount" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "ipv6v6only" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setIpv6v6only(Boolean.valueOf(value));
                return true;
            case "maxConnections" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setMaxConnections(Integer.valueOf(value));
                return true;
            case "deferAccept" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setDeferAccept(Boolean.valueOf(value));
                return true;
            case "serverSock" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "sslContext" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "useSendFileSet" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "sendfileCount" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setProperty(name, value);
                return true;
            case "useSendfile" :
                ((org.apache.tomcat.util.net.AprEndpoint)o).setUseSendfile(Boolean.valueOf(value));
                return true;
        }
        return setPropertyForOrgApacheTomcatUtilNetAbstractEndpoint(o, name, value, invokeSetProperty);
    }

    public static boolean setPropertyForOrgApacheTomcatUtilNetAbstractEndpoint(Object o, String name, String value, boolean invokeSetProperty) {
        switch (name) {
            case "useAsyncIO" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setUseAsyncIO(Boolean.valueOf(value));
                return true;
            case "localPort" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "useSendfile" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setUseSendfile(Boolean.valueOf(value));
                return true;
            case "maxThreads" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setMaxThreads(Integer.valueOf(value));
                return true;
            case "acceptorThreadCount" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setAcceptorThreadCount(Integer.valueOf(value));
                return true;
            case "connectionTimeout" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setConnectionTimeout(Integer.valueOf(value));
                return true;
            case "tcpNoDelay" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setTcpNoDelay(Boolean.valueOf(value));
                return true;
            case "acceptorThreadPriority" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setAcceptorThreadPriority(Integer.valueOf(value));
                return true;
            case "connectionLinger" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setConnectionLinger(Integer.valueOf(value));
                return true;
            case "address" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setAddress(getInetAddress(value));
                return true;
            case "currentThreadCount" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "name" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setName(value);
                return true;
            case "daemon" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setDaemon(Boolean.valueOf(value));
                return true;
            case "internalExecutor" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "minSpareThreads" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setMinSpareThreads(Integer.valueOf(value));
                return true;
            case "alpnSupported" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "maxKeepAliveRequests" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setMaxKeepAliveRequests(Integer.valueOf(value));
                return true;
            case "port" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setPort(Integer.valueOf(value));
                return true;
            case "portOffset" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setPortOffset(Integer.valueOf(value));
                return true;
            case "domain" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setDomain(value);
                return true;
            case "defaultSSLHostConfigName" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setDefaultSSLHostConfigName(value);
                return true;
            case "maxConnections" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setMaxConnections(Integer.valueOf(value));
                return true;
            case "threadPriority" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setThreadPriority(Integer.valueOf(value));
                return true;
            case "running" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "bindOnInit" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setBindOnInit(Boolean.valueOf(value));
                return true;
            case "connectionCount" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "acceptCount" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setAcceptCount(Integer.valueOf(value));
                return true;
            case "portWithOffset" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "currentThreadsBusy" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "keepAliveTimeout" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setKeepAliveTimeout(Integer.valueOf(value));
                return true;
            case "paused" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
            case "executorTerminationTimeoutMillis" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setExecutorTerminationTimeoutMillis(Long.valueOf(value));
                return true;
            case "SSLEnabled" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setSSLEnabled(Boolean.valueOf(value));
                return true;
            case "deferAccept" :
                ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
                return true;
        }
        if (invokeSetProperty) {
            ((org.apache.tomcat.util.net.AbstractEndpoint)o).setProperty(name, value);
            return true;
        }
        return true;
    }

}
