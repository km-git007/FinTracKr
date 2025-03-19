# 📈 FinTrackr - AI-powered Personal Finance App

## 🚀 Overview  

**FinTrackr** is an AI-powered personal finance platform designed to help users **automate expense tracking, budgeting, and financial insights** through real-time analytics and interactive dashboards. With **Google Gemini AI-powered receipt scanning**, **AI-driven budget recommendations**, and **automated financial reports**, FinTrackr empowers users to manage their finances effortlessly.

Whether you need to scan receipts, set budget goals, analyze spending patterns, or receive AI-driven financial advice, FinTrackr simplifies **personal finance management** with **real-time insights and automation**.

## ✨ Core Features  

✔ **AI-Powered Expense Tracking** – Automatically extract and log expenses from receipts using Google Gemini AI.  
✔ **Personalized Budgeting System** – Get AI-driven financial insights and spending recommendations.  
✔ **Real-Time Analytics & Dashboards** – Interactive charts displaying income, expenses, and budgeting trends.  
✔ **Automated Reports & Reminders** – Schedule monthly financial reports and receive alerts using Spring Scheduler.  
✔ **Secure Authentication** – Protect accounts using Clerk authentication and JWT-based authorization with Spring Security.  
✔ **Rate Limiting for API Stability** – Prevent abuse with **Bucket4j** rate limiting.  
✔ **Seamless UI & Navigation** – Built with **React, Redux, React Router, and Material UI** for a modern experience.  
✔ **Cloud-Ready & Scalable** – Dockerized deployment for seamless scalability and high availability.  

---

## 🔥 Key Functionalities  

### 1️⃣ AI-Powered Expense Tracking  
One of the core features of **FinTrackr** is the **receipt scanning system**, which eliminates manual data entry by automatically extracting information from receipts.  

💡 **How It Works:**  
- Users upload an image or PDF of their receipt.  
- The **Google Gemini AI** extracts key details like date, total amount, and category.  
- Expenses are categorized automatically and logged in the dashboard.  
- Users receive real-time spending insights based on their transactions.  

### 2️⃣ AI-Driven Budgeting & Financial Advice  
FinTrackr helps users optimize spending with personalized budget recommendations.  

💡 **Key Features:**  
- AI analyzes user spending habits and suggests optimal budgets.  
- Alerts notify users when they exceed budget limits.  
- Monthly reports summarize financial performance and trends.  

### 3️⃣ Automated Reports & Notifications  
Using **Spring Scheduler**, FinTrackr automates recurring financial reports and sends spending alerts.  

💡 **Examples:**  
- **Monthly Spending Report:** Users receive a breakdown of income, expenses, and savings.  
- **Expense Reminders:** Alerts notify users of upcoming bills and subscriptions.  
- **Budget Warnings:** Users are alerted if they exceed spending limits.  

---

## 🛠️ Tech Stack  

### 📉 **Backend (Spring Boot)**  
- **Spring Boot** – High-performance backend framework for scalable API development.  
- **Spring AI** – Integrates Google Gemini AI for intelligent receipt scanning and financial insights.  
- **Spring Security** – Implements authentication and authorization using **JWT and Clerk**.  
- **Spring Scheduler** – Automates recurring tasks like budget reminders and report generation.  
- **Bucket4j** – Implements rate limiting to ensure API stability and prevent overuse.  
- **Redis** – Used for caching financial data, improving response times and reducing database load.  
- **Docker** – Enables containerized deployment for seamless cloud scalability.  

### 📈 **Frontend (React)**  
- **React 18** – Component-driven UI architecture for a seamless user experience.  
- **Redux Toolkit** – Centralized state management for user financial data.  
- **React Router** – Enables smooth navigation between different sections.  
- **Material UI (MUI)** – Provides a modern and accessible UI design.  
- **Chart.js & React-ChartJS-2** – Creates interactive financial analytics dashboards.  
- **Zod** – Validates user inputs to ensure data integrity.  
- **Axios** – Handles secure API communication between frontend and backend.  
- **Tailwind CSS** – Ensures a sleek and responsive design.  

---

## 🛠️ Installation & Setup  

### 🔹 1️⃣ Clone the Repository  
```sh
 git clone https://github.com/your-username/fintrackr.git
 cd fintrackr
```

### 🔹 2️⃣ Backend Setup (Spring Boot)  
Ensure you have **Java 17+** and **Maven** installed.  
```sh
 cd backend
 mvn clean install
 mvn spring-boot:run
```

### 🔹 3️⃣ Frontend Setup (React)  
Ensure you have **Node.js (v18+)** installed.  
```sh
 cd frontend
 npm install
 npm run dev
```

### 🔹 4️⃣ Environment Variables  
Create a `.env` file in both **backend** and **frontend** folders with the required API keys and configuration settings.

---

## 🚀 Deployment  
- **Frontend**: Deployed on **Vercel**.  
- **Backend**: Deployed on **Render** with **Docker** support for scalability.  

---

## 🤝 Contributing  
We welcome contributions! If you’d like to contribute:  
1. Fork the repository.  
2. Create a feature branch (`git checkout -b feature-branch`).  
3. Commit your changes (`git commit -m "Add new feature"`).  
4. Push to the branch (`git push origin feature-branch`).  
5. Open a pull request.  

---

## 📩 Contact  
- 🔗 [LinkedIn](https://www.linkedin.com/in/kaustavmishra)  
- 📧 Email: mishrakaustav10@gmail.com  

**FinTrackr – Track Smart Spend Smarter!**  

