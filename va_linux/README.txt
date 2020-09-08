Phase de mise au point :
==============
cd /vagrant
cd conf-docker
cd backend-api
./build-docker-image.sh
cd ..
cd frontend
./build-docker-image.sh
cd ..

docker image ls

docker run -p 8383:8383 -d --name backend-api-container xyz/backend-api
docker container ls
curl http://localhost:8383/springWs/devise-api/public/devise
--> test via http://localhost:8383/springWs/index.html
docker container stop backend-api-container
docker container rm backend-api-container

docker network create --driver bridge mynetwork
docker run -p 8383:8383 -d --name backend-api-container --network mynetwork --network-alias=backend.api.service xyz/backend-api
docker container ls
curl http://localhost:8383/springWs/devise-api/public/devise

docker run -p 80:80 -d --network mynetwork --name frontend-container xyz/frontend
docker container ls
curl http://localhost:80/index.html 
curl http://localhost:80/devise-api/public/devise
--> test via http://localhost:80/index.html 

docker container  rm -f backend-api-container
docker container  rm -f frontend-container
docker network rm mynetwork
docker image rm xyz/backend-api
docker image rm xyz/frontend

