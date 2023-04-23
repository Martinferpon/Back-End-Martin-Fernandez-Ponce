FROM amazoncorretto:11-alpine-jdk
MAINTAINER MAFP
COPY target/mafp-0.0.1-SNAPSHOT.jar mafp-app.jar
ENTRYPOINT ["java","-jar","/mafp-app.jar"]

