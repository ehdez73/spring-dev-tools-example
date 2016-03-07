#!/bin/bash
./gradlew clean build
docker rmi spring-demo
docker build -t spring-demo .
docker run --rm -p 8080:8080 -p 8000:8000 spring-demo
