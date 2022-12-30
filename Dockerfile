FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY . /target/ame-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "Main"/Backend/target/ame-0.0.1-SNAPSHOT.jar]

