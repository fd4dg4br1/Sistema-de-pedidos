# ESTÁGIO 1: Compilação (O "Canteiro de Obras")
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# 1. Cache de dependências: evita baixar a internet toda vez que mudar o código
COPY pom.xml .
RUN mvn dependency:go-offline

# 2. Copia o código e gera o pacote .jar
COPY src ./src
RUN mvn clean package -DskipTests

# ESTÁGIO 2: Execução (A "Casa Pronta")
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copia apenas o que é estritamente necessário para rodar
COPY --from=build /app/target/*.jar app.jar

# Configuração de segurança: não rodar como root (opcional, mas boa prática)
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]