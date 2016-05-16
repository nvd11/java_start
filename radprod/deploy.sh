#!/bin/bash

cd $TOMCAT_HOME/bin
./shutdown.sh


rm -rf $TOMCAT_HOME/webapps/radprod.war
rm -rf $TOMCAT_HOME/webapps/radprod

cp /home/gateman/Studies/java_start/radprod/target/radprod.war $TOMCAT_HOME/webapps/

./startup.sh


