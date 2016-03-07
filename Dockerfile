FROM java:8
ADD build/libs/dev-tools-demo-0.0.1-SNAPSHOT.jar /data/app.jar
EXPOSE 8080
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "-Xdebug", "-Xrunjdwp:server=y,transport=dt_socket,suspend=n,address=8000", "/data/app.jar"]

