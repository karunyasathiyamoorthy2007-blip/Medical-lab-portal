# Medical Lab Portal

## 1. Project Overview

Medical Lab Portal is a web-based application for managing medical laboratory test bookings.

Users can register, log in, and book laboratory tests. The system provides role-based access for Users and Administrators and stores application data using MySQL.

## 2. Problem Statement

Patients need a simple way to manage medical laboratory test bookings.

The Medical Lab Portal provides an online system where users can register, log in, and book laboratory tests. Administrators can manage and view registered users.

The application also provides validation, password encryption, role-based authorization, testing, and health monitoring.

## 3. Features

### User Features

- User Registration
- User Login
- Password Encryption using BCrypt
- Lab Test Booking
- View Lab Bookings
- Booking Validation

### Admin Features

- Admin Login
- View All Registered Users
- Role-Based Access Control
- Admin APIs protected from normal Users

### System Features

- MySQL Database
- REST APIs
- Server-Side Validation
- CORS Configuration
- Health Check Endpoint
- Unit Testing
- H2 Test Database
- JaCoCo Code Coverage
- GitHub Actions CI

## 4. Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- Spring Validation
- MySQL
- H2 Database
- Maven
- JaCoCo
- GitHub Actions
- Visual Studio Code
- draw.io

## 5. User Roles

The system contains two roles:

| Role | Access |
|------|--------|
| USER | Login, create bookings, view bookings |
| ADMIN | Admin APIs and user management |

Public signup always creates a USER account.

## 6. Security

The application uses Spring Security for authorization.

Passwords are stored using BCrypt hashing.

Admin APIs require the ADMIN role.

Booking APIs require either USER or ADMIN access.

Sensitive password information is not returned in the user response.

## 7. Database

Database Name:

`medical_lab_portal`

Main tables:

- `user`
- `lab_booking`

The application uses Spring Data JPA for database operations.

## 8. Project Structure

```text
medical-lab-portal
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.karunya.medicallabportal
│   │   │       ├── config
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       └── service
│   │   │
│   │   └── resources
│   │       ├── static
│   │       └── application.properties
│   │
│   └── test
│       └── java
│
├── docs
│   └── diagrams
│
├── .github
│   └── workflows
│       └── maven.yml
│
├── pom.xml
├── CHANGELOG.md
└── README.md