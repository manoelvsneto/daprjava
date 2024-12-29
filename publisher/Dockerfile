FROM tomcat:10.1-jdk17

# Remover os arquivos de exemplo padrão do Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar o WAR gerado para o diretório de deploy do Tomcat
COPY build/libs/PubSubDapr-*.war /usr/local/tomcat/webapps/ROOT.war

# Expor a porta padrão do Tomcat
EXPOSE 8080

# Iniciar o Tomcat
CMD ["catalina.sh", "run"]
