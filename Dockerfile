# Use a lightweight Java 17 image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy all files into the container
COPY . .

# Compile the Calculator application
RUN javac Calculator.java

# Set the command to run the application
ENTRYPOINT ["java", "Calculator"]