FROM java:8
VOLUME /Users/maze/Docker/:/spring-cloud-order
ADD order-application-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["java","-Xms128m","-Xmx256m","-Djava.security.egb=file:/dev/./urandom/","-jar","/app.jar"]