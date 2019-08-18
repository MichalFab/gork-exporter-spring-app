FROM adoptopenjdk/openjdk12:jre-12.33
COPY target/grok-example-app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]