#!/bin/sh
mvn clean package && docker build -t com.airhacks/cyberjug .
docker rm -f cyberjug || true && docker run -d -p 8080:8080 -p 4848:4848 --name cyberjug com.airhacks/cyberjug 
