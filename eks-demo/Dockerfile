FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/eks-demo-0.0.1-SNAPSHOT.jar /app/eks-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/eks-demo-0.0.1-SNAPSHOT.jar"]