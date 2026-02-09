Item API – Simple Java Spring Boot Backend
Overview

This is a simple Java backend application built using Spring Boot.
It provides a RESTful API to manage a collection of items (similar to products in an e-commerce application).

The application uses in-memory storage (ArrayList), so no database setup is required.

Technologies Used

Java

Spring Boot

Spring Web

Jakarta Validation

Maven

How to Run the Application
Prerequisites

Java 17 or above

Maven

IDE like IntelliJ IDEA (recommended)


Steps

Clone the repository

git clone <your-repo-url>


Open the project in IntelliJ IDEA

Build the project

mvn clean install


Run the application

Run the main Spring Boot class (ItemApiApplication)

Server starts on:

https://item-management-api-o0x4.onrender.com/api/items/


API Endpoints
1. Get All Items

URL

GET   -   https://item-management-api-o0x4.onrender.com/api/items/getAll
POST  -  https://item-management-api-o0x4.onrender.com/api/items/add

Description

Returns all items stored in memory

Sample Response

[
  {
    "id": 1,
    "name": "Laptop",
    "description": "asus tuf F15"
  },
  {
    "id": 2,
    "name": "Mobile",
    "description": "Iphone 15"
  }
]

2. Get Item by ID



Description

Returns a single item based on ID

If ID is not found, returns null

Sample Response

{
  "id": 1,
  "name": "Laptop",
  "description": "asus tuf F15"
}

3. Add New Item

URL

POST /api/items/add


Request Body

{
  "name": "Tablet",
  "description": "Samsung Galaxy Tab"
}


Description

Adds a new item to the in-memory list

ID is auto-generated

Validates required fields (name, description)

Sample Response

{
  "id": 3,
  "name": "Tablet",
  "description": "Samsung Galaxy Tab"
}

Input Validation

name and description are mandatory

Validation is implemented using @NotBlank

Invalid input will result in a 400 Bad Request


<img width="1908" height="893" alt="image" src="https://github.com/user-attachments/assets/2a82e20f-bb11-43e2-9283-f63fa425529a" />
