# Etapa 1: Base de execução com o JDK 17
FROM eclipse-temurin:17-jdk-jammy as runtime

# Diretório de trabalho dentro da imagem
WORKDIR /app

# Copiar o único arquivo WAR gerado pelo Gradle
# Ajuste o nome do arquivo WAR se necessário
COPY build/libs/app.war /app/app.war

# Expor a porta usada pela aplicação
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.war"]

