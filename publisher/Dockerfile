FROM --platform=linux/arm64 openjdk:11-jre-slim

WORKDIR /app

# Copy the JAR files
COPY build/libs/PubSubDapr-*.jar /app/

# Ensure a single JAR file is moved to app.jar
RUN for file in /app/PubSubDapr-*.jar; do \
      if [ -f "$file" ]; then cp "$file" /app/app.jar; fi; \
    done

ENTRYPOINT ["java", "-jar", "/app/app.jar"]

