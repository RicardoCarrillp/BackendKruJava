# Java Spring Boot CRUD Application with MongoDB

This README provides an overview and setup instructions for a Java Spring Boot CRUD (Create, Read, Update, Delete) application with MongoDB as the database. This application allows you to perform basic CRUD operations on a MongoDB database using the Java Spring Boot framework.

## Prerequisites

Before you begin, make sure you have the following installed on your system:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- An IDE (Integrated Development Environment) such as IntelliJ IDEA or Eclipse
- MongoDB

## Getting Started

To set up and run the Java Spring Boot CRUD application with MongoDB, follow these steps:

1. Clone the repository or download the source code.

2. Import the project into your IDE as a Maven project.

3. Configure the MongoDB connection properties in the `application.properties` file. You can find this file in the `src/main/resources` directory. Modify the following properties to match your MongoDB configuration:

   ```properties
    spring.data.mongodb.uri=mongodb+srv://admin:<password>@javadb.aolhy7e.mongodb.net/?retryWrites=true&w=majority
    spring.data.mongodb.database=kruDatabase

# API Endpoints
The CRUD application provides the following RESTful API endpoints:

- GET /contacts: Retrieves a list of all contact.
- GET /contacts/{id}: Retrieves a specific contact by ID.
- POST /contacts: Creates a new contact.
- PUT /contacts/{id}: Updates an existing contact by ID.
- DELETE /contacts/{id}: Deletes a contact by ID.
  
You can test these endpoints using the appropriate HTTP methods.

# Conclusion
This README provides a basic overview of a Java Spring Boot CRUD application with MongoDB. Follow the instructions to set up the project, configure the MongoDB connection, and run the application. You can further customize and extend the application to meet your specific requirements. Happy coding!
