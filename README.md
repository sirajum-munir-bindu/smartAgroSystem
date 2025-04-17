
# Smart Agro System

Smart Agro System is a Java Spring Boot web application designed to modernize agriculture by supporting farmers with technology. This platform integrates tools for monitoring labor, selling agricultural inputs, and managing farm activities—all from one clean interface.


<b>Features</b>

* Farmer & Labor Management System
* Online Shop (Seeds, Fertilizer, Medicine)
* User Authentication (Login/Register)
* Admin Dashboard
* Clean UI built with Thymeleaf & Bootstrap
* Backend in Java Spring Boot
* MySQL Database via XAMPP


<b>Project Discussion</b>

The goal of this project is to improve the agricultural sector by combining traditional farming techniques with modern IT. Smart Agro System provides digital tools to farmers to manage their resources, labor, and agricultural inputs more efficiently.


<b>Objectives</b>

* Help farmers access products like seeds and fertilizers
* Create a dashboard to manage laborers and tasks
* Secure login & session management
* Offer a user-friendly interface with responsive design


# Technologies Used

Backend	------------------>  Java Spring Boot, Spring MVC<br>
Frontend------------------>Thymeleaf, HTML, CSS, Bootstrap<br>
Database------------------>MySQL (via XAMPP)<br>
IDE/Tools----------------->VS Code, XAMPP<br>
Web Server---------------->Apache Tomcat (embedded in Spring Boot)<br>


# How to Run the Project

<b>Prerequisites:</b>

    * Java JDK 8 or later
    * Maven
    * XAMPP (MySQL running)
    * Git

<b>Setup:</b>

Clone the Repository<br>

git clone https://github.com/your-username/smart-agro-system.git<br>
cd smart-agro-system

<b>Start XAMPP</b>

    * Launch XAMPP and start Apache and MySQL
    * Open phpMyAdmin and create a database named:  sas

<b>Configure application.properties</b>

spring.datasource.url=jdbc:mysql://localhost:3306/sas
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update

<b>Run the Application</b>
     mvn spring-boot:run

<b>Access the App</b>

    Visit: http://localhost:8080


<b>Future Enhancements</b>

    * IoT integration for irrigation and sensors
    * Mobile version (Android app)
    * Crop prediction using AI
    * Multi-language support
    * SMS alert system for updates


# Author

Sirajum Munir<br>
https://github.com/sirajum-munir-bindu


# License

This project is licensed under the MIT License. 


