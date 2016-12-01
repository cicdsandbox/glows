Fix Docker:
http://stackoverflow.com/questions/30984569/error-error-creating-aufs-mount-to-when-building-dockerfile

Glows
----
mvn install
mvn spring-boot:run -Drun.jvmArguments='-Dserver.port=8080'
http://localhost:8080/name   (?index=0)

sudo mvn package docker:build
sudo docker run -p 8080:8080 -d -t glows/glows-service


Scheduling
----------
mvn install
mvn spring-boot:run -Drun.jvmArguments='-Dserver.port=8081'
http://localhost:8081/days

sudo mvn package docker:build
sudo docker run -p 8081:8080 -d -t glows/scheduling-service

AngularJS
---------
python -m SimpleHTTPServer 8000
localhost:8000

sudo docker run -p 80:80 -d -v <path/to>/AngularJS_Frontend:/usr/share/nginx/html nginx
