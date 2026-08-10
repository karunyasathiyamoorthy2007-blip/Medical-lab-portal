# Medical Lab Test Booking & Report Portal

## 1. Project Title

**Medical Lab Test Booking & Report Portal**

## 2. Problem Statement

In many medical laboratories, patients need to contact the laboratory or visit the lab directly to book diagnostic tests. Managing bookings manually can be time-consuming and may lead to errors in patient details, test information, and booking dates.

The proposed **Medical Lab Test Booking & Report Portal** is a web-based application that allows users to register, log in, and book medical laboratory tests online. The system stores user and booking information securely in a MySQL database.

The project aims to provide a simple and organized platform for managing laboratory test bookings and, in future stages, viewing laboratory test reports.

## 3. Objectives

* To provide user registration and login functionality.
* To allow users to book laboratory tests online.
* To store user and booking information in a MySQL database.
* To allow the system to retrieve and display booking details.
* To reduce manual work involved in laboratory test booking.
* To provide a foundation for adding online medical report management in future development.

## 4. Proposed Solution

The system will provide a web-based platform with a backend developed using Spring Boot. Users can create an account and log in using their email and password.

After logging in, users can enter their patient details, select a laboratory test, and provide a booking date. The booking information is processed by the backend and stored in the MySQL database.

The system can also retrieve stored booking information for viewing and management.

## 5. Main Modules

### Module 1 – User Management

* User Registration
* User Login
* Basic Authentication
* User information storage

### Module 2 – Lab Test Booking

* Enter patient name
* Select test name
* Select booking date
* Save booking details
* View booking details

### Future Module – Medical Report Management

* Upload laboratory reports
* View reports
* Download reports
* Report status management

## 6. Technology Used

* **Frontend:** HTML, CSS, JavaScript *(to be developed)*
* **Backend:** Java, Spring Boot
* **Database:** MySQL
* **API:** REST API
* **Build Tool:** Maven
* **IDE:** Visual Studio Code
* **Version Control:** Git and GitHub

## 7. Expected Outcome

The completed system will provide a simple online platform for patients to register, log in, and book laboratory tests. The system will store and retrieve information from the MySQL database.

The project will later be extended with additional features such as medical report upload and viewing, laboratory test management, and an improved user interface.

## 8. Current Implementation for Review 1

The following features are currently implemented and working:

* User Signup
* User Login
* MySQL Database Connection
* Lab Test Booking
* Saving booking details to MySQL
* Retrieving booking details through REST API

## 9. Conclusion

The Medical Lab Test Booking & Report Portal provides a basic digital solution for laboratory test booking. The current implementation establishes the core backend, database, authentication, and booking functionality required for the first project review. Further modules and frontend functionality will be developed in the upcoming stages.
