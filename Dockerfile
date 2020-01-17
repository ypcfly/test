FROM openjdk:8-jre-alpine
ENV TIME_ZONE=aisa/shanghai
VOLUME /tmp
ADD service-k8s-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]