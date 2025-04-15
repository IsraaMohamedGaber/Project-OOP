# 🎓 Project-OOP (Object-Oriented Programming in Java)

This project is a Java-based application demonstrating core OOP principles including inheritance, polymorphism, encapsulation, and abstraction. It models a basic school or institution system with students, teachers, employees, and various resources.

## 📁 Project Structure

| File/Class Name         | Description |
|------------------------|-------------|
| `ProjectOop.java`      | Main class to execute and test the application |
| `person.java`          | Base class representing a person (inherited by others) |
| `student.java`         | Inherits from `person`, represents a student |
| `Teachers.java`        | Inherits from `person`, represents a teacher |
| `Employee.java`        | Base class for employees (salaried or hourly) |
| `HourlyEmpolyee.java`  | Inherits from `Employee`, represents hourly-paid workers |
| `salariedEmployee.java`| Inherits from `Employee`, represents salaried employees |
| `Books.java`           | Represents books available in the institution |
| `courses.java`         | Represents courses offered |
| `furniture.java`       | Represents classroom or office furniture |
| `grade.java`           | Holds student grades or academic performance |

## 🚀 Features

- Demonstrates Java OOP concepts
- Models real-world school or university system components
- Separates concerns using inheritance hierarchies
- Allows creation and interaction between students, teachers, courses, and resources

## 💡 OOP Concepts Used

- **Inheritance**: `student`, `Teachers`, `HourlyEmployee`, etc., inherit from `person` or `Employee`
- **Polymorphism**: Unified interfaces to manage different types of employees
- **Encapsulation**: All data members are accessed via getters/setters
- **Abstraction**: Cleanly separated functionalities for each class

## 🧰 Technologies

- Java
- OOP (Object-Oriented Programming)


