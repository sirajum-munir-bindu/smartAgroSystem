# smartAgroSystem

Smart Agro System

Smart Agro System is a Java Spring Boot web application designed to modernize agriculture by supporting farmers with technology. This platform integrates tools for monitoring labor, selling agricultural inputs, and managing farm activities—all from one clean interface.
📸 Project Screenshots
🔐 Login Page

👨‍🌾 Labor Management

🛍️ Product Shop (Seeds, Fertilizers, Medicines)

📦 Features

    🧑‍🌾 Farmer & Labor Management System

    🛒 Online Shop (Seeds, Fertilizer, Medicine)

    🔐 User Authentication (Login/Register)

    📊 Admin Dashboard

    🌍 Clean UI built with Thymeleaf & Bootstrap

    ⚙️ Backend in Java Spring Boot

    💾 MySQL Database via XAMPP

💡 Project Discussion

The goal of this project is to improve the agricultural sector by combining traditional farming techniques with modern IT. Smart Agro System provides digital tools to farmers to manage their resources, labor, and agricultural inputs more efficiently.
🎯 Objectives

    Help farmers access products like seeds and fertilizers

    Create a dashboard to manage laborers and tasks

    Secure login & session management

    Offer a user-friendly interface with responsive design

🛠 Technologies Used
Layer	Technologies
Backend	Java Spring Boot, Spring MVC
Frontend	Thymeleaf, HTML, CSS, Bootstrap
Database	MySQL (via XAMPP)
IDE/Tools	VS Code, IntelliJ IDEA, Postman, XAMPP
Web Server	Apache Tomcat (embedded in Spring Boot)
🚀 How to Run the Project
🔧 Prerequisites

    Java JDK 8 or later

    Maven

    XAMPP (MySQL running)

    Git

📥 Steps

    Clone the Repository

git clone https://github.com/your-username/smart-agro-system.git
cd smart-agro-system

Start XAMPP

    Launch XAMPP and start Apache and MySQL

    Open phpMyAdmin and create a database named:

    smart_agro_db

Configure application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/smart_agro_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update

Run the Application

    mvn spring-boot:run

    Access the App

        Visit: http://localhost:8080

📁 Folder Structure

smart-agro-system/
├── src/
│   ├── main/
│   │   ├── java/com/bindu/agro/
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   ├── static/
│   │   │   └── application.properties
├── pom.xml
└── README.md

🔮 Future Enhancements

    📶 IoT integration for irrigation and sensors

    📱 Mobile version (Android app)

    🧠 Crop prediction using AI

    🌐 Multi-language support

    🔔 SMS alert system for updates

👩‍💻 Author

Bindu
🔗 GitHub
🤝 Contributing

Feel free to fork this repository and contribute via pull requests! Let's improve agriculture together.
📄 License

This project is licensed under the MIT License. See the LICENSE file for details.
