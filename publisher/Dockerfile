# Etapa 1: Usar uma imagem base com JDK 17
FROM openjdk:17-jdk-slim-buster as builder

# Instalar Dapr (se necessário)
RUN curl -fsSL https://github.com/dapr/cli/releases/download/v1.10.0/dapr_1.10.0_linux_arm64.tar.gz -o dapr.tar.gz \
    && tar -xvzf dapr.tar.gz -C /usr/local/bin \
    && rm dapr.tar.gz
    
# Diretório de trabalho dentro da imagem
WORKDIR /app
# Copiar o arquivo WAR gerado para dentro da imagem
COPY build/libs/PubSubDapr-0.0.1-SNAPSHOT.war /app/app.war
# Expor a porta 8080
EXPOSE 8080
# Comando para rodar a aplicação
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.war"]
