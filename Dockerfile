# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="callicoder@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=build/libs/spring-helloworld-0.1.0.jar

# Add the application's jar to the container
ADD ${JAR_FILE} spring-helloworld.jar

# The application's jar file
ARG CONFIG_FILE=build/resources/main/application.properties

# Add the application's jar to the container
ADD ${CONFIG_FILE} application.properties

# ENV RESPONSE_STRING Some Helloworld String in DOCKER

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-helloworld.jar","--spring.config.location=file:${configDirectory}/application.properties"]