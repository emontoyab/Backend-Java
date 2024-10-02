# CV backend
#### by: Esteban Montoya 🦊
---

This backend is aimed to build a first stage of a web page backend connected to a SQL Database to retrieve information about the user's profile. This stage provides a script to create a Database including one table of courses with columns for name, institution, start and end date and if the course obtained a certification. After running this script, the database will be created and API requests will be available to retrieve any CRUD method, just by running the server. 

## Instructions
---

In order to use this repository, is necessary to follow the instructions above:

1. Bring your own SQL credentials into `application.properties` file in the next path: `src/main/resources/application.properties`. They should look like the following:

      ```java
      spring.application.name=cv-tbn
      
      spring.datasource.url = jdbc:mysql://localhost:3307/bookstore
      spring.datasource.username=root
      spring.datasource.password=###YOUR-PASSWORD-HERE###
      
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
      spring.jpa.hibernate.ddl-auto=update
      ```
2. Run the `courses.sql` script with the following code:

   ```
         mysql -u USERNAME -p --port 3306 < courses.sql
   ```
   Replace "USERNAME" with your username and change the port (if you use a different one). After this, your password could be required.

3. Run the entry-point file `CvTbnApplication.java` to start the server.

4. Finally, you can make your requests as shown bellow.

## API requests
---

This program is able to make CRUD requests using the methods POST, GET, PUT and DELETE. Using a software like postman is recommended.
The endpoint assigned to make requests is `http://localhost:8080/courses` after running the server locally.

The body associated to requests is shown next:

### Get method:

Get method does not need a body. It will respond a list of objects indicating each row of the table.

### Post method:

This method needs a JSON body and it will return a message indicating it was successfully. Example:

```JSON
{
    "name": "String",
    "institution": "String",
    "dateStart": "String",
    "dateEnd": "String",
    "certification": boolean
}
```

### Put method:

Put method will need a JSON body indicating also the ID of the row to modify. It will respond a confirmation message. Ex:

```JSON
{
    "id": Long,
    "name": "String",
    "institution": "String",
    "dateStart": "String",
    "dateEnd": "String",
    "certification": boolean
}
```

### Delete method:

This method only needs a parameter called `id`, indicating a Long number with the id of the row to delete.

