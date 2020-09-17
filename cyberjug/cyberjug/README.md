# Build
mvn clean package && docker build -t com.airhacks/cyberjug .

# RUN

docker rm -f cyberjug || true && docker run -d -p 8080:8080 -p 4848:4848 --name cyberjug com.airhacks/cyberjug 

# System Test

Switch to the "-st" module and perform:

mvn compile failsafe:integration-test