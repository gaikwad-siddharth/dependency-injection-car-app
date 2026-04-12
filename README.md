# 🚗 Dependency Injection - Car App

A simple Java project demonstrating the concept of **Dependency Injection (DI)** using a Car and Engine example.

---

## 📌 Project Overview

This project shows how to achieve **loose coupling** using Dependency Injection.

Instead of the `Car` class directly creating engine objects, it depends on an interface (`IEngine`).  
Different engine implementations (Petrol, Diesel) are injected into the Car.

---

## 🧠 Concepts Covered

- Dependency Injection (DI)
- Loose Coupling
- Interface-based design
- Polymorphism in Java

---

## 🏗️ Project Structure
src/
├── App.java
├── Car.java
├── IEngine.java
├── PetrolEngine.java
└── DiselEngine.java
---

## ⚙️ How It Works

1. `IEngine` is an interface defining engine behavior.
2. `PetrolEngine` and `DiselEngine` implement `IEngine`.
3. `Car` class depends on `IEngine` instead of concrete classes.
4. Engine implementation is injected into `Car`.

---

## ▶️ Example Flow

### Constructor Injection

```java
Car car = new Car(new PetrolEngine());
car.drive();

### Setter Injection

'''java
c.setterEngine(new DiselEngine());
car.drive();
