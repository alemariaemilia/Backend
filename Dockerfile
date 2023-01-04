FROM amazoncorretto:1.8-alpine-jdk
MAINTAINER .emaaristimuno
COPY .target/ame-0.0.1-SNAPSHOT.jar .target/ame-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/target/ame-0.0.1-SNAPSHOT.jar"]
