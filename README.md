# 🏆 Auction Management System

## 🚀 Overview  
The **Auction Management System** is a **Spring Boot-based RESTful API** that allows users to create, view, search, and manage auctions. The project demonstrates **Spring Boot, Spring Security, PostgreSQL integration, and role-based authentication**.  

👉 **This is an exercise project** showcasing how to build a secure API that connects to a PostgreSQL database.  

## 🔧 Prerequisites  
Before running the project, ensure you have:  
✔ **Java 17+** (or Java 21) installed  
✔ **PostgreSQL** installed and running  
✔ **Maven** installed  

---

## 🗄️ **Database Setup**  
Before running the application, you need to **create the PostgreSQL database**.  

✅ If you are using **Linux/macOS**, run:  
```sh
createdb -U postgres auction_db
```
✅ If you are using **Windows (or manually running queries in `psql`)**, use:  
```sh
psql -U postgres
CREATE DATABASE auction_db;
```
⚠️ **Ensure PostgreSQL is running before starting the application.**

---

## 🔑 Authentication & User Roles  
This project uses **Basic Authentication** for security.

| **Role** | **Username** | **Password** |
|----------|-------------|-------------|
| **Admin** | `admin` | `admin123` |
| **User** | `user` | `user123` |

- `USER` can **view and search auctions**.  
- `ADMIN` can **create, delete, and manage auctions**.  

### **Using Authentication in Postman**
1. Open **Postman**.  
2. Set **Auth Type** to **Basic Auth**.  
3. Enter **username & password** (from the table above).  
4. Send API requests!  

---

## 📌 API Endpoints  

| Method | Endpoint | Role | Description |
|--------|---------|------|-------------|
| **GET** | `/auctions` | USER/ADMIN | Get all auctions |
| **GET** | `/auctions/{id}` | USER/ADMIN | Get auction by ID |
| **GET** | `/auctions/search?title={keyword}` | USER/ADMIN | Search auctions by title |
| **POST** | `/auctions` | ADMIN | Create new auction |
| **DELETE** | `/auctions/{id}` | ADMIN | Delete an auction |

📌 **Swagger API Documentation**  
You can test these endpoints using **Swagger UI** at:  
```sh
http://localhost:8080/swagger-ui/index.html
```

---

## 🚀 **Setup Instructions**  
### 1️⃣ Clone the Repository  
```sh
git clone https://github.com/KamranMakarian/auction-system.git
cd auction-system
```

### 2️⃣ **Run the Application**
Using **Maven**, compile and start the Spring Boot application:
```sh
mvn spring-boot:run
```

#### **👤 Enter Database Credentials**
When you run the application, **you will be prompted to enter your PostgreSQL credentials**:
```sh
Enter database username: your_postgres_username
Enter database password: your_postgres_password
```
✅ These credentials will be used to connect to **auction_db**.

📌 **After starting**, open your browser or Postman to access the API.

---

## ✨ Features  
✅ **CRUD operations** for auctions  
✅ **Role-based authentication** (`ADMIN`, `USER`)  
✅ **Spring Security authentication with Basic Auth**  
✅ **Swagger UI documentation for API testing**  
✅ **Search auctions by title**  
✅ **PostgreSQL integration with Spring Data JPA**  

---

## 🛠️ Technologies Used  
- 🏗 **Spring Boot** - Core framework  
- 🔐 **Spring Security** - Role-based authentication  
- 🗄 **Spring Data JPA** - Database access  
- 🐘 **PostgreSQL** - Relational database  
- 📝 **Swagger UI** - API documentation  
- 🛠 **Maven** - Build tool  

---

## 📜 License  
This project is **open-source** under the **MIT License**.  
Feel free to **modify, enhance, and contribute**!  

---

## 💡 Suggested Improvements  
✅ **Improve UI using React.js or Angular** for auction listings  
✅ **Add JWT authentication instead of Basic Auth**  
✅ **Integrate email notifications for new auctions**  

---

## 📢 Contributing  
We welcome contributions! If you’d like to contribute:  
1️⃣ **Fork** the repository.  
2️⃣ Create a **feature branch** (`feature-newAuctionFeature`).  
3️⃣ **Commit changes** (`git commit -m "Added new auction feature"`).  
4️⃣ **Push** to your fork and create a **Pull Request**.  

---

## **🔗 Contact & Credits**
Created by **Kamran Makarian** – feel free to **connect & contribute**!  
🔗 **GitHub:** [KamranMakarian](https://github.com/KamranMakarian)  

---
