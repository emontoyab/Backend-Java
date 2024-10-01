# ReadMe

## Instructions

In order to use this repository, is necessary to follow the instructions above:

1. Bring your own SQL credentials into `application.properties` file in the next path: `src/main/resources/application.properties`. They should look like the following:

      ```
      spring.application.name=cv-tbn
      
      spring.datasource.url = jdbc:mysql://localhost:3307/bookstore
      spring.datasource.username=root
      spring.datasource.password=###YOUR-PASSWORD-HERE###
      
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
      spring.jpa.hibernate.ddl-auto=update
      ```
  
