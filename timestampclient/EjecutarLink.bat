docker run -p 4000:8080 -d --name timestamp mfrondon/timestamp-test:1.0
docker run -p 4001:8080 -d --name client --link timestamp:timestamp-test mfrondon/timestamp-client:1.0
