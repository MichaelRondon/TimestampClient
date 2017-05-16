docker run -p 4000:8080 -d --name timestamp mfrondon/timestamp-test:1.0
docker run -p 4001:8080 -d --name client --link timestamp:timestamp-test mfrondon/timestamp-client:1.0
REM docker exec -it <container_id_or_name> echo "Hello from container!"
REM cat /etc/hosts
REM docker exec -it client cat /etc/hosts
REM docker exec -it client ping timestamp
REM docker exec -it client nmap -p 4000 timestamp
REM docker exec -it client cat /dev/tcp/host/port
REM docker exec -it client cat /dev/udp/host/port
REM docker exec -it client nc -zv timestamp 4000