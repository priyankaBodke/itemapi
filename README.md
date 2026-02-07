# Item API - Spring Boot REST Application

A simple Java backend application to manage a collection of items (like e-commerce products or movies) using **Spring Boot**.

## Features

- **Item Model:** `id`, `name`, `description`  
- **Data Storage:** In-memory `ArrayList`  
- **API Endpoints:**  
  - `POST /api/items` → Add a new item  
  - `GET /api/items` → Get all items  
  - `GET /api/items/{id}` → Get item by ID  
- **Input Validation:** Ensures `name` and `description` are provided
