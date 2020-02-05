ant clean 
ant
ant embed-jars
jar tvf output/embed/tomcat-embed-core.jar |egrep "(Nio2|Apr|Ajp|openssl|digester)"
rm -f ~/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.30/tomcat-embed-core-9.0.30.jar
cp output/embed/tomcat-embed-core.jar ~/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.30/tomcat-embed-core-9.0.30.jar
