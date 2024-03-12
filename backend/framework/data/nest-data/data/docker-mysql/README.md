dc -f mysql.yaml up

dc -f mysql.yaml stop

dc -f mysql.yaml down

docker compose up

mysql-client:

		mysql -h localhost -P 3306 --protocol=tcp -u myuser -p
        
        mysql -hlocalhost -P3306 -uroot -pexample --protocol=tcp
        
	docker exec -it <container-id> bash

	mysql -uroot -pexample


adminer:

	http://localhost:8080


docker-mysql:
	
	https://hub.docker.com/_/mysql
