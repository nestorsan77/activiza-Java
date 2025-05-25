# Imagen base de Java con Maven
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Copiar el proyecto y compilar
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Imagen final solo con Java
FROM eclipse-temurin:17
WORKDIR /app

# Copiamos el JAR construido
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar el JAR
CMD ["java", "-jar", "app.jar"]

