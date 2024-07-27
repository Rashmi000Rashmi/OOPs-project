# Library Management System

## Overview
The Library Management System is a Java-based application designed to manage a library's book inventory and member information. This project showcases the application of core Object-Oriented Programming (OOP) principles, including inheritance, encapsulation, polymorphism, and abstraction.

## Features
- **Book Management**: Add, issue, and return books.
- **Member Management**: Register and manage members, including borrowing and returning books.
- **Librarian Management**: Manage book inventory and assist members.
- **Library Management**: Central control of books, members, and librarians.

## Technologies Used
- Java

## OOP Concepts Applied
- **Classes and Objects**: Used to create the main entities such as `Book`, `Member`, `Librarian`, and `Library`.
- **Inheritance**: `Librarian` class inherits from the `Member` class.
- **Polymorphism**: Methods in child classes override methods in parent classes.
- **Encapsulation**: Private attributes with public getter and setter methods.
- **Abstraction**: Simplified interfaces for interacting with complex systems.

## Classes and Their Responsibilities
### Book
- Attributes: `bookId`, `title`, `author`, `publisher`, `year`, `isAvailable`
- Methods: `getDetails()`, `issueBook()`, `returnBook()`

### Member
- Attributes: `memberId`, `name`, `address`, `phone`, `email`, `borrowedBooks`
- Methods: `borrowBook(Book book)`, `returnBook(Book book)`, `getDetails()`

### Librarian (inherits from Member)
- Attributes: `employeeId`
- Methods: `addBook(Book book)`, `removeBook(Book book)`, `viewAllBooks()`

### Library
- Attributes: `books`, `members`, `librarians`
- Methods: `addMember(Member member)`, `removeMember(Member member)`, `findBookById(int bookId)`, `findMemberById(int memberId)`

## Getting Started
### Prerequisites
- Java Development Kit (JDK) installed

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Rashmi000Rashmi/OOPs-project.git
   ```
2. Navigate to the project directory:
   ```bash
   cd library-management-system
   ```

### Running the Application
1. Compile the Java files:
   ```bash
   javac src/*.java
   ```
2. Run the main application:
   ```bash
   java src.Main
   ```

## Usage
1. Add books to the library.
2. Register members.
3. Borrow and return books.
4. Manage book inventory and member information.

## Future Enhancements
- Implement a user-friendly GUI.
- Add search functionality for books and members.
- Implement fine calculation for late book returns.
- Add book reservation feature.

## Contributing
Contributions are welcome! Please fork this repository and submit pull requests.

## Contact
For any questions or suggestions, feel free to contact me at [ankeykumari000@gmail.com].
