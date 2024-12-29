# Use an ARM64-compatible base image
FROM --platform=linux/arm64 openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file(s) to the working directory
COPY build/libs/PubSubDapr-*.jar /app/

# Handle cases where multiple files might match or no files exist
RUN set -e && \
    FILE=$(ls /app/PubSubDapr-*.jar 2>/dev/null || echo "") && \
    if [ -n "$FILE" ]; then mv "$FILE" /app/app.jar; else echo "No matching JAR file found"; fi

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
