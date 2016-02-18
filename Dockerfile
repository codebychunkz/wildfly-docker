FROM jboss/wildfly
 
ADD target/docker-app.war /opt/jboss/wildfly/standalone/deployments/