<h1>🚗 Ride Booking Application – Backend</h1>
📌 Project Overview

This is a Backend Ride Booking Application built using Spring Boot with a Microservices Architecture.

Currently, the main focus is on developing and improving the Review Microservice, which handles ride-related feedback and ratings.

🏗️ Architecture

The system follows a Microservices Architecture, where each service is independent and communicates via REST APIs.

Current Microservices:

🚘 Ride Service

👤 User Service

⭐ Review Service (Currently Working On)

⭐ Review Microservice
🔹 Purpose

The Review Service allows users to:

Add reviews for rides

Rate drivers

Fetch ride reviews

Manage feedback data

🔹 Responsibilities

Store review data in database

Maintain rating information

Handle CRUD operations

Expose REST APIs for review management

🛠️ Tech Stack

Java

Spring Boot

Spring Data JPA

Hibernate

MySQL

REST APIs

Lombok

Microservices Architecture

📂 Project Structure
review-service
 ┣ 📂 controller
 ┣ 📂 service
 ┣ 📂 repository
 ┣ 📂 entity
 ┣ 📂 dto
 ┗ 📜 application.yml
🔌 API Endpoints (Sample)
Method	Endpoint	Description
POST	/reviews	Create review
GET	/reviews/{id}	Get review by ID
GET	/reviews/ride/{rideId}	Get reviews by Ride
PUT	/reviews/{id}	Update review
DELETE	/reviews/{id}	Delete review
🗄️ Database Configuration

Configured in application.yml:

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ride_db
    username: root
    password: password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
🚀 How to Run

Clone the repository

Configure MySQL database

Update application.yml

Run the application

./mvnw spring-boot:run
📈 Future Improvements

API Gateway integration

Service discovery (Eureka)

Distributed logging

Authentication & Authorization (JWT)

Docker deployment

Rating aggregation logic
