# 🏨 Hotel Reservation System

## 📌 Description

The Hotel Reservation System is a Java-based application designed to manage hotel room bookings efficiently. It allows users to view available rooms, make reservations, cancel bookings, and display customer and reservation details.

## ✨ Features

* View available rooms
* Add customer details
* Book a hotel room
* Cancel a reservation
* Display reservation details
* Calculate room charges
* Manage room availability

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* JUnit
* Java Collections

## 📂 Project Structure

```text
Hotel-Reservation-System/
├── README.md
├── src/
│   ├── Main.java
│   ├── Hotel.java
│   ├── Room.java
│   ├── Customer.java
│   └── Reservation.java
├── test/
│   └── HotelReservationTest.java
└── simulation/
    └── simulation-output.txt
```

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA, Eclipse, or VS Code.
3. Compile the Java files.
4. Run `Main.java`.
5. Follow the options displayed in the console.

## 🧪 Testing

JUnit test cases are included to verify:

* Room availability
* Room booking
* Reservation cancellation
* Invalid room booking
* Total bill calculation

## 💻 Sample Output

```text
===== HOTEL RESERVATION SYSTEM =====

1. View Available Rooms
2. Book Room
3. Cancel Reservation
4. View Reservation
5. Exit

Enter your choice: 2

Enter Customer Name: Rahul
Enter Room Number: 101
Enter Number of Days: 3

Room booked successfully!

===== RESERVATION DETAILS =====
Customer Name : Rahul
Room Number   : 101
Days          : 3
Total Amount  : ₹6000

Thank you for using Hotel Reservation System!
```

## 🎯 Future Enhancements

* MySQL database integration
* GUI using Java Swing or JavaFX
* Online payment integration
* User login and authentication
* Email booking confirmation

## 👩‍💻 Author

Developed as a Java academic/GitHub project.
