FROM amazoncorretto:8-alpine-jdk
MAINTAINER alemariaemilia
COPY target/ame-0.0.1-SNAPSHOT.jar ame-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ame-0.0.1-SNAPSHOT.jar"]
