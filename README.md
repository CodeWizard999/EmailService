# EmailService

This is a Spring Boot application that demonstrates how to send email using the JavaMailSender interface in Spring Framework.

# Getting Started
To run this application, you need to have Java and Maven installed on your machine. You can download them from the following links:

# Java SE Development Kit
Apache Maven
Running the Application
To run the application, navigate to the root directory of the project and run the following command:

mvn spring-boot:run

Once the application starts, you can access it at http://localhost:8080.

# Sending Emails

To send an email using this application, you can use the following endpoint:

POST /sendMail

You need to provide the following parameters in the request body:

to: The email address of the recipient.
subject: The subject of the email.
text: The content of the email.

# Example Request

POST /sendMail

Content-Type: application/json

{
  "to": "recipient@example.com",
  "subject": "Hello World",
  "text": "This is a test email from Week12Email Application."
}

# Dependencies
This application has the following dependencies:

Spring Boot Starter Web
Spring Boot Starter Thymeleaf
Spring Boot Starter Mail
Jakarta Mail

# Configuration
This application uses the following configuration:

spring.mail.host: The SMTP host to use for sending email.
spring.mail.port: The SMTP port to use for sending email.
spring.mail.username: The username to use for authentication.
spring.mail.password: The password to use for authentication.

You can configure these settings in the application.properties file located in the src/main/resources directory.
