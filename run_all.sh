cd ../scheduling
mvn package docker:build
cd ../glows
mvn package docker:build
docker-compose -f docker-compose-all.yml up
