FROM openjdk:8-jdk-alpine
COPY target/Currency-Exchange-1.0-SNAPSHOT.jar /app/
CMD java -jar /app/Currency-Exchange-1.0-SNAPSHOT.jar