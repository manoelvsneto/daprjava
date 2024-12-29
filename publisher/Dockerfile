# Etapa 1: Construir a imagem base com o JDK para rodar a aplicação
FROM eclipse-temurin:17-jdk-jammy as builder

# Diretório de trabalho dentro da imagem
WORKDIR /app

# Copiar o arquivo WAR para dentro do contêiner
COPY build/libs/*.war app.war

# Exposição da porta usada pelo Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.war"]

