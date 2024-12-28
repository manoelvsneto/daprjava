# Use uma imagem base do JDK para execução
FROM openjdk:11-jre-slim

# Diretório de trabalho
WORKDIR /app

# Copiar o JAR gerado pelo Gradle
COPY build/libs/publisher-*.jar app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
