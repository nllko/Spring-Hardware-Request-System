![GIF](readme\idk.gif)

#Hardware Request System

Web API made with Java, Spring Boot , Thymeleaf and H2 database.

Can add, delete, update, get requests and get a list containing all requests.

### Spring Boot:
```
mvn spring-boot:run
```

### H2 Database:
```
URL: localhost:8080/h2-console/
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:mydb
User Name: sa
Password: 
```


## Web APIs Endpoints
### Add a request

* /requests [POST]

### Get request list

* /requests [GET]

### Create request form

* /requests/new [GET]

### Update request

* /requests/{id} [POST]

### Delete request

* /requests/{id} [GET]
