FROM openjdk:17
WORKDIR /app
COPY ./target/Microserviceworkers-0.0.1.jar workers.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","item.jar" ]