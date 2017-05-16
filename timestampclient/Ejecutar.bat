call mvn clean package
echo ---------------------------------------
echo ---------------------------------------
echo Starts local timestamp-client image building:
echo ---------------------------------------
echo ---------------------------------------
pause
docker build -t timestamp-client .
echo ---------------------------------------
echo ---------------------------------------
echo Executing timestamp-client image:
echo ---------------------------------------
echo ---------------------------------------
pause
REM docker login
REM docker tag timestamp-client mfrondon/timestamp-client:1.0
REM docker push mfrondon/timestamp-client:1.0
docker run -p 4001:8080 mfrondon/timestamp-client:1.0