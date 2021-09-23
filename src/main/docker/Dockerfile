# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 7070

# Refer to Maven build -> finalName
#ARG JAR_FILE=target/boot-play-app-1.0.0-SNAPSHOT.jar
ARG JAR_FILE=maven/springboot-docker-app-1.0.0-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
# COPY ./target/boot-play-app-1.0.0-SNAPSHOT.jar app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]