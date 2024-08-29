FROM gradle:8-jdk21 as buildgradle
WORKDIR /app
COPY . .
RUN chmod +rx gradlew
RUN ./gradlew clean build

FROM openjdk:21-jdk-slim
COPY --from=buildgradle /app/build/libs/*SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "/app.jar"]