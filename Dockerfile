FROM openjdk:latest
RUN mkdir /app
MAINTAINER kaandiren
EXPOSE 8085
COPY target/devopstraining-0.0.1-SNAPSHOT.jar /app/devopstraining-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/app/devopstraining-0.0.1-SNAPSHOT.jar" ]

