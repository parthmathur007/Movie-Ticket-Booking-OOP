# Movie Ticket Booking System

## About the Project

The Movie Ticket Booking System is a Java-based console application developed as an Object Oriented Programming mini project.

The system allows customers to view movies and shows, check seat availability, book tickets, view previous bookings, and cancel tickets. An admin panel is also provided for viewing admin details and booking records.

## Features

- View available movies
- View available shows
- View seat availability
- Book movie tickets
- Prevent booking of an already booked seat
- View previous bookings
- Cancel booked seats
- Admin login
- Admin panel
- Store booking information in a text file
- Input validation for menu choices

## OOP Concepts Used

### 1. Classes and Objects
The project uses classes such as:

- Movie
- User
- Customer
- Admin
- Theatre
- Show
- Seat
- Booking

### 2. Encapsulation
Class data members are declared private and accessed through methods such as getters.

### 3. Constructors
Constructors are used to initialize objects.

### 4. Constructor Overloading
The `Movie` class contains overloaded constructors.

### 5. Inheritance
`Customer` and `Admin` inherit from the `User` class.

```text
          User
         /    \
   Customer   Admin

   6. Method Overriding

Customer and Admin override the displayUser() method of the User class.

7. Runtime Polymorphism

A parent class reference can refer to objects of child classes.

8. Composition

The project uses HAS-A relationships:

Theatre has Shows
Show has Seats
Show has a Movie
Booking has a Customer, Show and Seat
9. Exception Handling

A custom exception called SeatAlreadyBookedException is used when a customer attempts to book an already booked seat.

10. File Handling

Booking details are stored in bookings.txt using Java file handling classes.

11. Arrays

Arrays are used to store shows and seats.

## Project Structure

Movie-Ticket-Booking-OOP
│
├── src
│   ├── Admin.java
│   ├── Booking.java
│   ├── Customer.java
│   ├── Main.java
│   ├── Movie.java
│   ├── Seat.java
│   ├── SeatAlreadyBookedException.java
│   ├── Show.java
│   ├── Theatre.java
│   └── User.java
│
├── bookings.txt
└── README.md

## Technologies Used


Java
Object Oriented Programming
File Handling
Exception Handling
VS Code
GitHub

## How to Run


Open the project in VS Code.
Open Main.java.
Run the program using the Run button.
Enter the customer name and email.
Use the menu to access the available features.

## Admin Login


For demonstration purposes:

Admin ID: A001
Password: admin123

## Authors


Developed as an OOP mini project for CSC2104.