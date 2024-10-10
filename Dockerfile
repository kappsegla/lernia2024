FROM eclipse-temurin:23-jre-alpine
COPY target/classes/se/lernia/java/server /app/se/lernia/java/server
ENTRYPOINT ["java", "-classpath", "/app", "se.lernia.java.server.Server"]
