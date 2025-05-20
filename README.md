# 🧪 Spring Boot GC Load Test with VisualVM, Prometheus, and Grafana

This project is a minimal Spring Boot app that simulates heavy CPU or memory load, useful for garbage collection (GC) analysis and performance tuning. It integrates with **VisualVM** (via JMX), **Prometheus**, and **Grafana** for live monitoring and diagnostics.

---

## ⚙️ Prerequisites

- [Docker](https://www.docker.com/products/docker-desktop)
- [VisualVM](https://visualvm.github.io/)
- Java 21 (already handled via container)
- A `app.jar` file built via `mvn clean package`

---

## 🐳 Getting Started with Docker Compose

1. **Update `.env` File**

   Add your host machine's IP so that the container can be accessed externally via VisualVM:

   ```env
   HOST_IP=192.168.x.x

---
## Endpoints
 GET http://localhost:8080/burn

---

## ⚙️ Need to know

- run visualvm manually and add jmx connection to see it in action (HOST_IP:9010)
- do not forget installing app.jar file wtih maven before running the docker compose
- do not forget to replace HOST_IP
