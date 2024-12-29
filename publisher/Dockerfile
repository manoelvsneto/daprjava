# Use an ARM64-compatible base image
FROM --platform=linux/arm64 openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file(s) to the working directory
COPY build/libs/PubSubDapr-*.jar /app/

# Rename the JAR file if there's only one
RUN mv /app/PubSubDapr-*.jar /app/app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
