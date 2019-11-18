FROM openjdk:8
ADD target/docker-demo-institution.jar docker-demo-institution.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-demo-institution.jar"]