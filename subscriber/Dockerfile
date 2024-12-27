# Usar a imagem do OpenJDK
FROM openjdk:17-jdk-slim

# Copiar o código para o contêiner
WORKDIR /app
COPY build/libs/subscriber-1.0.0.jar app.jar

# Expor a porta do Subscriber
EXPOSE 8080

# Comando para iniciar a aplicação com o Dapr
ENTRYPOINT ["java", "-jar", "app.jar"]