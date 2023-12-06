FROM maven:3.6.3-openjdk-17-slim AS build

COPY . .
RUN mvn clean package -DskipTests

# Use an official OpenJDK image as the base image for the runtime stage
FROM openjdk:17-slim

COPY --from=build /target/SpringMongoCRUD-0.0.1-SNAPSHOT.jar SpringMongoCRUD.jar
CMD ["java", "-jar", "SpringMongoCRUD.jar"]
