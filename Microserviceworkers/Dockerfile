FROM openjdk:17
WORKDIR /app
COPY ./target/Microserviceworkers-1.0.0.jar workers.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","item.jar" ]