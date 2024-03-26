# Workout API

## Requirements
- Java 21
- Docker
- Maven

## How to run it locally?

### Using IntelliJ
1) Go to docs folder `cd docs`
2) Run the docker compose file `docker-compose up -d`
3) Run the main method in **BackendApplication.java**

### Using Terminal
1) Go to docs folder `cd docs`
2) Run the docker compose file `docker-compose up -d`
3) Return to root folder `cd ..`
4) Build the project `mvn clean package`
5) Run the project `java -jar ./target/backend-0.0.1-SNAPSHOT.jar`

## How to Open PgAdmin?
1) Run docker compose file as mentioned in the previous section.
2) Go to http://localhost:8888 (PgAdmin was mapped to that port)
3) Login using the email and password in the docker compose file.
4) Click on the button "Add New Server"
5) Select a name for the server. For instance, **Workout LOCAL**
6) Click on Connection tab.
7) Set the host name as **db** (this is the host name in the docker compose file), username as **postgres** (default one), and the password in the docker compose file.
8) Save and enjoy.

## Hexagonal Architecture
- Reference: https://github.com/hirannor/spring-boot-hexagonal-architecture/tree/master