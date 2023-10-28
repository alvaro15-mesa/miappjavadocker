FROM adoptopenjdk/openjdk11-openj9:alpine-slim
VOLUME /tmp
COPY *.jar ms_ch_app.jar

ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
# Replace with a non-root user to avoid running the container with excessive privileges
USER root
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar ms_ch_app.jar" ]
