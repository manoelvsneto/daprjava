FROM quay.io/wildfly/wildfly:29.0.1.Final-jdk17

# Diretório de trabalho no WildFly
WORKDIR /opt/jboss/wildfly/standalone/deployments/

# Copia o WAR para a pasta de deploy do WildFly
COPY build/libs/PubSubDapr-*.war ./app.war

# Expor a porta padrão do WildFly
EXPOSE 8080

# Comando para iniciar o WildFly
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
