FROM public.ecr.aws/docker/library/openjdk:latest
EXPOSE 9095 80
COPY target/authorization-0.0.1-SNAPSHOT.jar authorization.jar
ENTRYPOINT ["java", "-jar", "/authorization.jar"]