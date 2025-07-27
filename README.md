# 🚗 QuickKeys - Car Rental Management System

QuickKeys is a car rental web application designed to streamline the process of renting vehicles, managing users, processing reservations, and calculating return fines. This repository contains the backend implementation focused on employee functionalities using Spring Boot.

---

## 📂 Project Structure

- `controller/EmployeeController.java`: Manages all employee operations
- `service/`: Business logic related to users, cars, orders, and reservations
- `model/`: Entity classes for User, Car, Reservation, Order, etc.
- `repository/`: Data access layer for persisting and retrieving records

---

## 👨‍💼 Employee Features

### 👥 User Management
- Search users by **first name** or **last name**
- View user details including:
  - Cars currently rented
  - Associated fines
- View all users with pending fines

### 🚘 Car Management
- View available cars or search by car name/owner
- Add new cars to the system
- Edit or delete car records
- Remove current users from cars (on return)
- Cancel reservations on cars

### 📝 Order Processing
- Assign cars to users
- Save and confirm car orders
- View confirmation details

### 🔁 Car Return Handling
- Calculate return fines for late returns
- Select and return rented cars
- Automatically update car availability and user record

### 📅 Reservation Handling
- View processed and unprocessed reservations
- Mark cars ready for pickup
- Notify users and set deadlines

---

## 🛠️ Technologies Used

- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **MySQL** (or any RDBMS)
- **Lombok**
- **Thymeleaf (if frontend integrated)**

---

## ⚙️ How to Run

1. Clone the repository:
   ```bash
   # 🚗 QuickKeys - Car Rental Management System

QuickKeys is a car rental web application designed to streamline the process of renting vehicles, managing users, processing reservations, and calculating return fines. This repository contains the backend implementation focused on employee functionalities using Spring Boot.

---

## 📂 Project Structure

- `controller/EmployeeController.java`: Manages all employee operations
- `service/`: Business logic related to users, cars, orders, and reservations
- `model/`: Entity classes for User, Car, Reservation, Order, etc.
- `repository/`: Data access layer for persisting and retrieving records

---

## 👨‍💼 Employee Features

### 👥 User Management
- Search users by **first name** or **last name**
- View user details including:
  - Cars currently rented
  - Associated fines
- View all users with pending fines

### 🚘 Car Management
- View available cars or search by car name/owner
- Add new cars to the system
- Edit or delete car records
- Remove current users from cars (on return)
- Cancel reservations on cars

### 📝 Order Processing
- Assign cars to users
- Save and confirm car orders
- View confirmation details

### 🔁 Car Return Handling
- Calculate return fines for late returns
- Select and return rented cars
- Automatically update car availability and user record

### 📅 Reservation Handling
- View processed and unprocessed reservations
- Mark cars ready for pickup
- Notify users and set deadlines

---

## 🛠️ Technologies Used

- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Thymeleaf**

---

## ⚙️ How to Run

1. Clone the repository:
   ```bash
   g[it clone https://github.com/yourusername/quickkeys.git](https://github.com/Yash77Ash/Quick-Keys-Application.git)
   cd quickkeys

   cd quickkeys
