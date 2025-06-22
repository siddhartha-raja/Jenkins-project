# Use the official Tomcat base image (adjust version as needed)
FROM tomcat:10.1-jdk17

# Remove the default ROOT webapp to avoid conflicts
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy your WAR file into the webapps directory
COPY target/hello-springboot-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/hello.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
