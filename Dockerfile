FROM openjdk:19-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} hello-world.jar

ENTRYPOINT [ "java","-jar","hello-world.jar" ]

EXPOSE 8080

