# IETI-POSTGRES 🐘

Spring Boot con Postgres

## Parte 1️⃣

Iniciar un servidor con la base de datos Postgres usando [Docker](https://hub.docker.com/_/postgres).

```bash
docker run --name some-postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres
```

## Parte 2️⃣

Crear un proyecto de Spring Boot con las siguientes dependencias [Spring Initializr](https://start.spring.io/):

- Spring Web
- Spring Data JPA
- PostgreSQL Driver

## Parte 3️⃣

Agregar a la configuración de Spring Boot la conexión a la base de datos Postgres.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=mysecretpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

## Parte 4️⃣

Con el uso de postman realizar las operaciones crear y leer sobre los usuarios de la base de datos.

```json
{
    "name": "Daniel Santanilla",
    "email": "daniel.santanilla@mail.escuelaing.edu.co"
}
```


## Parte 5️⃣

Verificar que los datos se estén almacenando en la base de datos con un cliente de base de datos como [DBeaver](https://dbeaver.io/).

