# 🔖 SpringBoot Bookmark API — RESTful Bookmark Management

## 🚀 Description

A Spring Boot backend project for managing bookmarks with full CRUD functionality and clean REST API architecture. Ideal for portfolio projects demonstrating Java, Spring Boot, and MySQL integration.

**Portfolio Highlights:**

-   Implemented full CRUD operations for bookmarks
-   Built REST API with Jakarta Validation and response formatting
-   Structured project with controller-service-repository pattern using Spring Boot best practices

---

## ✨ Features

-   **Bookmark Management**

    -   → Create, Read, Read Detail, Update, and Delete bookmarks

-   **API Architecture**

    -   → Layered Architecture
    -   → REST API with Jakarta Validation and response formatting (wrapper)

-   **Error Handling**
    -   → Global Exception Handling

---

## 🛠 Tech Stack

-   **Runtime:** Java 21
-   **Framework:** Spring Boot 3.4.12
-   **Language:** Java
-   **Database:** MySQL
-   **ORM:** Spring Data JPA
-   **Validation:** Jakarta Validation
-   **Other Tools:** Spring Web, Lombok

---

## ⚡ Quickstart

### 1. Clone repository

```bash
git clone https://github.com/yourname/bookmark-manager.git
cd bookmark-manager
```

### 2. Create MySQL database

```bash
CREATE DATABASE bookmark_db;
```

### 3. Configure application.properties

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/bookmark_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the project

Klik "Run" project button in IDE, or:

```bash
./mvnw spring-boot:run
```

---

## 🧪 Testing

Use Postman or ThunderClient to test all available endpoints. Ensure the environment and configuration are correctly set up.

**Endpoints:**

```bash
POST /api/bookmarks
GET /api/bookmarks
GET /api/bookmarks/{id}
PUT /api/bookmarks/{id}
DELETE /api/bookmarks/{id}
```

---

## 📁 Project Structure

```bash
.
├── HELP.md
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── bookmarkmanager
    │   │               ├── BookmarkmanagerApplication.java
    │   │               ├── controller
    │   │               │   └── BookmarkController.java
    │   │               ├── dto
    │   │               │   ├── ApiResponse.java
    │   │               │   ├── ApiResponseFactory.java
    │   │               │   ├── BookmarkRequest.java
    │   │               │   └── BookmarkResponse.java
    │   │               ├── entity
    │   │               │   └── Bookmark.java
    │   │               ├── exception
    │   │               │   ├── BadRequestException.java
    │   │               │   ├── GlobalExceptionHandler.java
    │   │               │   └── NotFoundException.java
    │   │               ├── repository
    │   │               │   └── BookmarkRepository.java
    │   │               └── service
    │   │                   ├── BookmarkService.java
    │   │                   └── impl
    │   │                       └── BookmarkServiceImpl.java
    │   └── resources
    │       ├── application.properties
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── com
                └── example
                    └── bookmarkmanager
                        └── BookmarkmanagerApplicationTests.java
```

Explanation:

-   Controller: Handles HTTP requests and responses
-   Service: Business logic for bookmarks
-   Repository: Database access layer for Bookmark entity
-   Entity: Database model for Bookmark table
-   DTO: Request and response payloads
-   Exception: Handles validation and resource errors

---

## 🎯 Goals

-   Learn and implement RESTful CRUD operations in Spring Boot
-   Apply Jakarta Validation and response formatting
-   Build a clean, maintainable backend project for portfolio
-   Integrate MySQL with Spring Data JPA
-   Follow controller-service-repository architecture pattern

---

## 🗺 Planning

-   Implement API Gateway
-   Improve project with additional features
