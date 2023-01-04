FROM amazoncorretto:8-alpine-jdk
COPY . /target/ame-0.0.1-SNAPSHOT.jar
WORKDIR /target/ame-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "master"/target/ame-0.0.1-SNAPSHOT.jar]
