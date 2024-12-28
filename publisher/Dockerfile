# Usar a imagem do OpenJDK
FROM openjdk:17-jdk-slim

# Copiar o código para o contêiner
WORKDIR /app
COPY build/libs/PubSubDapr.jar app.jar

# Expor a porta do Publisher
EXPOSE 8081

# Comando para iniciar a aplicação com o Dapr
ENTRYPOINT ["java", "-jar", "app.jar"]
