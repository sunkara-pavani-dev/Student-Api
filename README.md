# Student Management REST API

## 📌 Description
Student Management REST API is a backend application built using Spring Boot.
It provides basic CRUD operations to manage student information such as
adding, updating, retrieving, and deleting student records.

This project was developed to practice RESTful API development and database
integration using Spring Boot and Spring Data JPA.

---

## 🚀 Features
- Add a new student
- Retrieve all students
- Update student details
- Delete a student
- In-memory database using H2
- RESTful API design

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 📂 Entity Details
**Student**
- id
- name
- age

---

## 🔗 API Endpoints
| Method | Endpoint                    | Description          |
|------|-----------------------------|----------------------|
| POST | /addstudent                 | Add a new student    |
| GET  | /getallstudents             | Get all students     |
| PUT  | /updatestudent/{id}         | Update student       |
| DELETE | /deletestudent/{id}       | Delete student       |

---

## ⚙️ How to Run the Project
1. Clone the repository
2. Run the application as a Spring Boot project
3. Access the H2 console from the browser
4. Test APIs using Postman or any REST client

---

## 🎯 Learning Outcomes
- Understanding of Spring Boot REST APIs
- CRUD operations using Spring Data JPA
- Working with H2 in-memory database
- Project structuring in Spring Boot

---

## 📌 Future Enhancements
- Input validation
- Global exception handling
- Pagination and sorting
- Authentication and authorization
