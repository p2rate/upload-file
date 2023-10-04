# Use a base image with Java 17 and Alpine Linux
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container at /app
COPY build/libs/uploading-files-0.0.1-SNAPSHOT.jar /app/application.jar

# Expose the port that your application will run on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "application.jar"]