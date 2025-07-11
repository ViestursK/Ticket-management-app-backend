# Use a Java 21 JRE base image
FROM eclipse-temurin:21-jre-jammy

# Argument for jar file location (adjust if needed)
ARG JAR_FILE=target/ticket-management-backend-0.0.1-SNAPSHOT.jar

# Copy the built jar into the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
