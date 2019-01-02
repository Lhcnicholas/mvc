FROM tomcat
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/mvc.war /usr/local/tomcat/webapps/ROOT.war
ENV JPDA_ADDRESS=8000
ENV JPDA_TRANSPORT=dt_socket
EXPOSE 8000
CMD ["catalina.sh","jpda","run"]
