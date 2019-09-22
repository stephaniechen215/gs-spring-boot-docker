To build the containerized service
>./mvnw install dockerfile:build

To start the web mvc service
>docker run -p 8080:8080 -t springio/gs-spring-boot-docker

To start mysql instance
>docker-compose up
