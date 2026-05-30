# 💰 Expense Tracker Pro

A modern Expense Tracker application built using Java Spring Boot, Thymeleaf, PostgreSQL, JPA, Hibernate, Docker, and Render Deployment.

## 🚀 Live Demo

https://expense-tracker-pro-4dmn.onrender.com

---

# 📌 Project Overview

Expense Tracker Pro is a web application that helps users manage daily expenses efficiently.

Users can:

- Add expenses
- Edit expenses
- Delete expenses
- Search expenses by category
- Track total expenses
- View total transactions
- Store data permanently using PostgreSQL

The application follows the MVC architecture using Spring Boot.

---

# 🛠️ Technologies Used

## Backend

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Maven

## Database

- PostgreSQL

## Frontend

- HTML
- CSS
- Thymeleaf

## Deployment

- Docker
- Render

---

# 📂 Project Structure

```
src
│
├── controller
│   └── ExpenseController.java
│
├── model
│   └── Expense.java
│
├── repository
│   └── ExpenseRepository.java
│
├── service
│   └── ExpenseService.java
│
├── templates
│   ├── index.html
│   └── edit.html
│
└── resources
    └── application.properties
```

---

# ⚙️ Features

## 1. Add Expense

Users can add:

- Expense Name
- Category
- Amount
- Date

Example:

| Name | Category | Amount |
|--------|-----------|---------|
| Pizza | Food | ₹500 |

---

## 2. View Expenses

All expenses are displayed in a table.

Columns:

- Name
- Category
- Amount
- Date
- Actions

---

## 3. Edit Expense

Users can update:

- Expense Name
- Category
- Amount
- Date

without deleting existing records.

---

## 4. Delete Expense

Users can remove unwanted expenses from the system.

---

## 5. Category Search

Filter expenses by:

- Food
- Travel
- Shopping
- Bills

---

## 6. Total Expense Calculation

Automatically calculates:

```
Total Expense = Sum of all expense amounts
```

Example:

```
₹500 + ₹200 + ₹1000 = ₹1700
```

---

## 7. Total Transactions

Displays total number of expense records stored in the database.

Example:

```
3 Expenses Added

Total Transactions = 3
```

---

# 🗄️ Database Design

## Expense Table

| Column | Type |
|----------|--------|
| id | BIGINT |
| name | VARCHAR |
| category | VARCHAR |
| amount | DOUBLE |
| date | DATE |

---

# 🔄 Application Flow

### Add Expense

User Input

↓

Controller

↓

Service Layer

↓

Repository

↓

PostgreSQL Database

↓

Response Back To UI

---

# 🐳 Docker Support

Application is containerized using Docker.

Build Image:

```bash
docker build -t expense-tracker .
```

Run Container:

```bash
docker run -p 8080:8080 expense-tracker
```

---

# ☁️ Deployment

The application is deployed on Render using:

- Docker
- PostgreSQL Database
- Environment Variables

---

# 🔐 Environment Variables

```properties
SPRING_DATASOURCE_URL

SPRING_DATASOURCE_USERNAME

SPRING_DATASOURCE_PASSWORD

SPRING_JPA_HIBERNATE_DDL_AUTO
```

---

# 📸 Screenshots

Add screenshots here after deployment.

Example:

- Dashboard
- Add Expense
- Edit Expense
- Search Expense

---

# 🎯 Learning Outcomes

This project helped in understanding:

- Spring Boot MVC
- CRUD Operations
- Spring Data JPA
- Hibernate ORM
- PostgreSQL Integration
- Thymeleaf Templates
- Docker Containerization
- Cloud Deployment using Render
- Production Configuration using Environment Variables

---

# 👩‍💻 Author

Nikita Dablani

GitHub:
https://github.com/nikita16dablani

LinkedIn:
https://www.linkedin.com/in/nikitadablani/

---
⭐ If you like this project, don't forget to star the repository.
