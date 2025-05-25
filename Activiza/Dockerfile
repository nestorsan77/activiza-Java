# Etapa de construcción
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Crear carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copiar el contenido del proyecto (incluyendo el pom.xml y src/)
COPY . .

# Compilar el proyecto sin correr tests
RUN mvn clean package -DskipTests

# Etapa final: solo el JAR
FROM eclipse-temurin:17

WORKDIR /app

# Copiar el JAR desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar el JAR
CMD ["java", "-jar", "app.jar"]
