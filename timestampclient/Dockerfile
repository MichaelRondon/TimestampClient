FROM maven:latest
WORKDIR /app
ADD . /app
EXPOSE 8080
CMD mvn clean package
#FROM java:latest
CMD java -jar -Dserver.port=8080 target/timestampclient-1.0-SNAPSHOT.jar
#Se debe usar $(docker-machine ip default)