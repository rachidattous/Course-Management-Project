# Production Dockerfile
FROM openjdk:19

WORKDIR /app
RUN  mkdir ./logs
RUN chmod -R 777 /app/logs
COPY target/CourseManagement.jar /app/app.jar
RUN chmod -R 777 /app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
