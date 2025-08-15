<<<<<<< HEAD

# Java Tutorial Web Application

This is a simple Java application built using Spring Boot and Thymeleaf to provide an introductory webpage about Java basics for students.

## Features
- Displays a webpage with Java tutorials.
- Explains Java's relevance in the IT industry.
- Provides resources for further learning.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-tutorial.git
   ```
2. Navigate to the project directory:
   ```bash
   cd java-tutorial
   ```
3. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Open the browser and visit `http://localhost:8080`.

## License
[MIT License](LICENSE)
=======
# java-spring
>>>>>>> d6d4dcd (first commit)


##
mvn clean package -DskipTests
java -jar target/java-tutorial-1.0-SNAPSHOT.jar


## Final obserability workshop 

# Observability Lab: Spring Boot + Minikube + Prometheus + Grafana + Loki + Tempo

End-to-end, local, reproducible setup to learn observability with a Java Spring Boot app:
- **Metrics** via Micrometer → **Prometheus**
- **Logs** via stdout → **Promtail → Loki**
- **Traces** via OpenTelemetry → **Tempo**
- Visualize everything in **Grafana**

> Works great on **Minikube**. No cloud required.

---

## ✅ Prerequisites

- Java 17+ and Maven
- Docker
- Minikube & kubectl
- Helm
- (Optional) GHCR account & PAT if you push images to GitHub Container Registry

---

## 1) Build the app & container image

```bash
# from repo root
mvn clean package -DskipTests

# OPTION A: Build directly into Minikube (fastest local dev)
eval $(minikube docker-env)
docker build -t java-tutorial:latest .

# OPTION B: Build for GHCR (if you want to pull from registry)
docker build -t ghcr.io/<your-username>/java-tutorial:latest .
docker push ghcr.io/<your-username>/java-tutorial:latest

##samaut