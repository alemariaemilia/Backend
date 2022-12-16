FROM amazoncorretto:11-alpine-jdk
COPY . /target/ame-0.0.1-SNAPSHOT.jar
WORKDIR /Backend/target/ame-0.0.1-SNAPSHOT.jar.original
ENTRYPOINT ["java", "Main"/Backend/target/ame-0.0.1-SNAPSHOT.jar]

