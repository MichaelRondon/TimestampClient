call mvn clean package
echo ---------------------------------------
echo ---------------------------------------
echo Starts local timestamp-client image building:
echo ---------------------------------------
echo ---------------------------------------
pause
docker build -t timestamp-client .
