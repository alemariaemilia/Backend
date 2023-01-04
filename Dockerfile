FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY target/ame-0.0.1-SNAPSHOT.jar app.jar 
ENTRYPOINT ["java","-jar","/ame-0.0.1-SNAPSHOT.jar"]
