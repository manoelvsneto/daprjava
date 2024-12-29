FROM adoptopenjdk:11-jre-hotspot
# Set the working directory
WORKDIR /app
# Copy the JAR file to the container
COPY build/libs/PubSubDapr-0.0.1-SNAPSHOT.war /app/app.war
# Expose the port that your Spring Boot application listens on (default is 8080)
EXPOSE 8080
# Define the command to run your application
CMD ["java", "-jar", "app.war"]
