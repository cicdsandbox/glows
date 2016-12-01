cd Glows_Backend
sudo mvn package docker:build
cd ../Scheduling_Backend
sudo mvn package docker:build
cd ..
sudo docker-compose up
