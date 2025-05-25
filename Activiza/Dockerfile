# -----------------------------
# Etapa de construcción (Build)
# -----------------------------
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Crear carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos necesarios para compilar
COPY pom.xml .
COPY src ./src

# Compilar el proyecto (incluye 'clean' y omite tests)
RUN mvn clean package -DskipTests

# -----------------------------
# Etapa de ejecución (Run)
# -----------------------------
FROM eclipse-temurin:17

# Crear carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR compilado desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

# Ejecutar el JAR
CMD ["java", "-jar", "app.jar"]
