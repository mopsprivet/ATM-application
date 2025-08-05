# ATM Interface Project

A simple ATM simulation desktop application built with Java and Java Swing.  
This project includes user registration, login using IIN and PIN code, money replenishment, and operation confirmation screens.  
It is designed to demonstrate frontend interface development and validation logic in a desktop environment.

## Features

- Registration of new users (IIN, name, last name, phone number)
- PIN-code setup with input validation
- Login system using IIN and PIN
- Replenishment of user account balance
- Confirmation screen displaying entered data
- Navigation between screens (Back, Next, Home)
- Input validation with meaningful error messages

## Technologies Used

- Java  
- Java Swing (GUI)  
- Object-Oriented Programming (OOP)  
- Exception handling (`try-catch`)  
- Input validation using regular expressions and InputVerifier

## How to Run

1. Clone or download this repository.
2. Open the project in **IntelliJ IDEA** or any other Java-supporting IDE.
3. Compile and run the main file (usually a `Main.java` or any class that starts the interface).
4. Interact with the GUI to navigate through the ATM simulation.

## Screens Overview

- **WelcomePage**: Initial window with navigation to Log In or Sign Up
- **SignUpFrame**: Collects user data with validation
- **NewPINCodeFrame**: User sets their PIN code
- **LogInFrame**: User enters their IIN to log in
- **PINCodeFrame**: User enters PIN
- **ChooseOperationFrame**: Menu for available operations (e.g., Replenishment)
- **ReplenishmentFrame**: Enter amount to deposit
- **ConfirmRFrame**: Confirmation of entered amount

## Input Validation

Each user input field is validated:

- **IIN**: Must be exactly 12 digits.
- **Phone Number**: Must be exactly 11 digits starting with 8.
- **Name / Last Name**: Only alphabetic characters.
- **PIN Code**: Must be exactly 4 digits.
- **Money Amount**: Digits only.

## Author
Anastasiya Sitchenko  
International IT University (IITU)

## Purpose
This project was created as a project for development practice.  
