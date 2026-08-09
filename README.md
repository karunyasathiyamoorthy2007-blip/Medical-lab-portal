# Medical Lab Portal

## 1. Project Overview

Medical Lab Portal is a web-based application that allows users to register, log in, and book medical laboratory tests. The system stores user and booking information in a MySQL database.

## 2. Problem Statement

Patients often need a simple way to manage medical laboratory test bookings. This project provides an online portal where users can register, log in, and book laboratory tests. The system stores the booking information securely in a database and allows bookings to be retrieved when required.

## 3. Features

* User Registration (Signup)
* User Login
* User Authentication
* Lab Test Booking
* View All Lab Bookings
* MySQL Database Storage

## 4. Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Spring Security
* MySQL
* Maven
* Visual Studio Code
* draw.io

## 5. Database

Database Name:

`medical_lab_portal`

Main tables:

* `user`
* `lab_booking`

## 6. Project Structure

```text
medical-lab-portal
│
├── src
│   └── main
│       └── java
│           └── com.karunya.medicallabportal
│               ├── config
│               ├── controller
│               ├── model
│               └── repository
│
├── docs
│   └── diagrams
│       ├── ER_Diagram.png
│       ├── System_Architecture.png
│       └── Class_Module_Diagram.png
│
├── pom.xml
└── README.md
```

## 7. How to Run

### Step 1: Start MySQL

Make sure MySQL Server is running.

### Step 2: Open the project

Open the `medical-lab-portal` folder in Visual Studio Code.

### Step 3: Run the Spring Boot application

Open the VS Code terminal and run:

```powershell
.\mvnw.cmd spring-boot:run
```

The application runs on:

`http://localhost:8080`

## 8. API Endpoints

### Signup

```text
POST /api/users/signup
```

### Login

```text
POST /api/users/login
```

### Create Booking

```text
POST /api/bookings
```

### View All Bookings

```text
GET /api/bookings
```

## 9. Working Modules

### User Management Module

Users can:

* Create an account
* Log in using email and password

### Lab Booking Module

Users can:

* Book a laboratory test
* Store patient name, test name and booking date
* View all bookings

## 10. Review 1 Status

The following basic functionalities have been implemented:

* User Signup
* User Login
* MySQL Database Connection
* Lab Booking
* View All Bookings
* System Architecture Diagram
* ER Diagram
* Class/Module Diagram
* Project Documentation
