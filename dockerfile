FROM openjdk:8
MAINTAINER jay.wong@and.digital

COPY target/test-service-0.1.0.jar /jar/
ENV PATH=$PATH:/usr/bin/java
CMD ["java", "-jar", "jar/test-service-0.1.0.jar"]
EXPOSE 8080