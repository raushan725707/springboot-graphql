# GraphQL Product Management API

This project is a **Product Management API** built using **Spring Boot** and **GraphQL**. It provides a set of endpoints to manage products, such as querying, adding, and updating products through a **GraphQL** API.

## Features

- **GraphQL Queries**: Fetch products by various filters such as category, stock, or rating.
- **GraphQL Mutations**: Add new products and update existing ones.
- **Product Management**: Allows CRUD operations for product data.
- **Schema**: Designed to provide a flexible schema for easy integration with front-end applications.

## Technologies Used

- **Spring Boot**: Backend framework used to create the RESTful API and GraphQL endpoints.
- **Spring GraphQL**: Provides GraphQL support within Spring Boot.
- **Java**: The programming language used to build the API.
- **GraphQL**: Query language for APIs and runtime for executing queries.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java 17 or higher
- Maven or Gradle
- An IDE (such as IntelliJ IDEA, Eclipse, etc.)
- PostgreSQL (if using a database) or any database of your choice

## Setup

Follow these steps to set up the project locally:

1. Clone this repository:
    ```bash
    git clone https://github.com/raushan725707/springboot-graphql.git
    ```

2. Navigate to the project directory:
    ```bash
    cd springboot-graphql
    ```

3. Install the dependencies:
    - If you're using **Maven**:
        ```bash
        mvn clean install
        ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

    The application should now be running on `http://localhost:8080`.

## GraphQL Endpoints

Once the application is running, you can access the **GraphQL endpoint** at:

- **GraphQL endpoint**: `http://localhost:8080/graphql`
