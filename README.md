# Build
mvn clean package && docker build -t org.example/Optional .

# RUN

docker rm -f Optional || true && docker run -d -p 8080:8080 -p 4848:4848 --name Optional org.example/Optional 