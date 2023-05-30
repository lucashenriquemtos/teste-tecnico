# Define a imagem base
FROM openjdk:8-jdk

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR do projeto para o contêiner
COPY target/teste-tecnico.jar app.jar

# Define as variáveis de ambiente
ENV JAVA_OPTS=""

# Expõe a porta utilizada pela aplicação Spring Boot
EXPOSE 8080

# Comando para executar a aplicação quando o contêiner for iniciado
ENTRYPOINT ["java", "-jar", "app.jar"]
