# 🧑‍🎓 Student Management API (Spring Boot)

This is a RESTful API built with Java and Spring Boot for managing student records.  
It supports CRUD operations and includes input validation using DTOs and a custom error handler.

## 🔧 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Jakarta Bean Validation
- Postman (for testing)

## 📦 Features

- ✅ Create a student with validation (`@Valid`, `@NotBlank`, `@Min`, `@Max`)
- ✅ Clean error handling with `@ControllerAdvice`
- ✅ Uses DTOs to decouple input data from entity
- ✅ Auto-generated ID and in-memory H2 storage
- ✅ ResponseEntity for structured HTTP responses

## 📂 Endpoints

| Method | Endpoint           | Description             |
|--------|--------------------|-------------------------|
| POST   | `/students`        | Create new student      |
| GET    | `/students`        | List all students       |
| GET    | `/students/{id}`   | Get student by ID       |
| DELETE | `/students/{id}`   | Delete student by ID    |

## 📥 Sample JSON (POST)

```json
{
  "name": "Carlos",
  "grade": 10,
  "score": 88
}
