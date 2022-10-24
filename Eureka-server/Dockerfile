FROM public.ecr.aws/docker/library/openjdk:latest
EXPOSE 9090
COPY target/eureka-server-0.0.1-SNAPSHOT.jar /eureka-server.jar
ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]