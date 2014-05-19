#!/bin/sh

mvn clean package
sudo rm -rf  /var/lib/tomcat7/webapps/gqt-web*
sudo cp -f  target/gqt-web.war  /var/lib/tomcat7/webapps/
