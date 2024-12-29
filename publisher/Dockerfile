# Use uma imagem base com suporte ARM64
FROM --platform=linux/arm64 openjdk:11-jre-slim

# Diretório de trabalho
WORKDIR /app


# Copiar o JAR gerado pelo Gradle
COPY build/libs/PubSubDapr-*.jar app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
