# spring-boot-crud
Aplicación basada en microservicios que implementa todo un CRUD, apoyado en el framework Spring Boot

## Base de datos
Se utiliza MySQL en un contenedor para almacenar los datos. Primero debemos crear un volumen que va 
a utilizar el contenedor para persistir los datos:
```
sudo docker volume create bd-datos
```

El servicio se levanta así:
```
sudo docker run --name bd-springboot-crud \
-e MYSQL_ROOT_PASSWORD=1111 \
-v bd-datos:/var/lib/mysql \
-p 9000:3306 \
-d mysql:8.0.33-debian
```

Para meter los datos nos metemos al contenedor:
```
sudo docker exec -it bd-springboot-crud bash
```

Dentro del contenedor creamos la bd y nos cambiamos a ella para poner los scripts:
```sql
CREATE DATABASE mensajes;
USE mensajes;
```
