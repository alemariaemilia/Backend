FROM amazoncorretto:8-alpine-jdk
COPY .target/ame-0.0.1-SNAPSHOT.jar .target/ame-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/target/ame-0.0.1-SNAPSHOT.jar"]
