FROM openjdk:21-jdk
ADD target/reskilling-0.0.1-SNAPSHOT.jar reskilling-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /reskilling-0.0.1-SNAPSHOT.jar"]

