# Etapa 1: Usar uma imagem base com JDK 17
FROM openjdk:17-jdk-slim-buster as builder
RUN apt-get update && apt-get install -y curl
RUN curl -fsSL https://github.com/dapr/cli/releases/download/v1.9.0/dapr_linux_amd64.tar.gz -o /tmp/dapr.tar.gz \
    && tar -xzf /tmp/dapr.tar.gz -C /usr/local/bin dapr
# Diretório de trabalho dentro da imagem
WORKDIR /app
# Copiar o arquivo WAR gerado para dentro da imagem
COPY build/libs/PubSubDapr-0.0.1-SNAPSHOT.war /app/app.war
# Expor a porta 8080
EXPOSE 8080
# Comando para rodar a aplicação
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.war"]
