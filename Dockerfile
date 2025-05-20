FROM eclipse-temurin:21-jdk

WORKDIR /app
COPY target/*.jar app.jar

EXPOSE 8080
EXPOSE 9010

ENTRYPOINT java -XX:+UseSerialGC \
  -Dcom.sun.management.jmxremote \
  -Dcom.sun.management.jmxremote.port=9010 \
  -Dcom.sun.management.jmxremote.rmi.port=9010 \
  -Dcom.sun.management.jmxremote.local.only=false \
  -Dcom.sun.management.jmxremote.authenticate=false \
  -Dcom.sun.management.jmxremote.ssl=false \
  -Djava.rmi.server.hostname=$HOST_IP \
  -jar app.jar