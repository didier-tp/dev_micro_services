#se placer (cd) dans répertoire springWsV1 
#(où est situé Dockerfile et target/springWsV1.jar construit par maven)
su
docker image build -t xyz/spring-ws  .
docker image ls
docker run -p 8383:8383 -d --name spring-ws-container --network mynetwork --network-alias=spring-ws.host xyz/spring-ws
docker container ls
