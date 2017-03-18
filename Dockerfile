FROM java:8
EXPOSE 8080
ADD /target/Threshold.jar Threshold.jar
ENTRYPOINT ["java", "-jar", "Threshold.jar"]
