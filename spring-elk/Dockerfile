FROM openjdk:8-jre-alpine
COPY target/gs-spring-boot-0.1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]