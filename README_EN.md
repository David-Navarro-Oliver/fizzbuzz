# 🧪 FizzBuzz Kata — TDD with Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk" alt="Java 25">
  <img src="https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven" alt="Maven">
  <img src="https://img.shields.io/badge/JUnit-5-green?style=for-the-badge&logo=junit5" alt="JUnit 5">
  <img src="https://img.shields.io/badge/TDD-Red%20Green%20Refactor-purple?style=for-the-badge" alt="TDD">
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" alt="Status Completed">
</p>

<p align="center">
  <a href="./README.md">Leer este README en español</a>
</p>

---

## 📘 Description

This project implements the classic **FizzBuzz** kata in Java by applying **TDD (Test-Driven Development)**.

The behavior rules are:

- multiple of 3 => Fizz
- multiple of 5 => Buzz
- multiple of 3 and 5 => FizzBuzz
- any other case => number as text

---

## 🎯 Exercise Goal

The goal of this exercise is to practice the **TDD cycle: Red → Green → Refactor**:

1. write a test
2. run it and see it fail
3. implement the minimum necessary code
4. run it again until it passes
5. refactor if needed

---

## 🛠️ Technologies Used

- Java 25
- Maven
- JUnit 5
- IntelliJ IDEA
- Git
- GitHub

---

## 🗂️ Project Structure

```text
fizzbuzz
├── img
│   ├── FizzBuzzPantalla.png
│   └── FizzBuzzTest.png
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org.example
│   │   │       └── Main.java
│   │   └── resources
│   └── test
│       └── java
│           └── fizzbuzz
│               └── FizzBuzzTest.java
├── pom.xml
└── README.md
```

---

## 📋 Behavior Rules

| Input | Output |
|---------|--------|
| 1 | `1` |
| 2 | `2` |
| 3 | `Fizz` |
| 5 | `Buzz` |
| 6 | `Fizz` |
| 10 | `Buzz` |
| 15 | `FizzBuzz` |

---

## 🧠 Implemented Logic

The function evaluates each number in this order:

1. multiple of 3 and 5 → FizzBuzz
2. multiple of 3 → Fizz
3. multiple of 5 → Buzz
4. otherwise → number as text

This order is important so that `15` does not return only `Fizz` or `Buzz`.

---

## ▶️ Program Execution

The `Main` class prints the sequence from 1 to 15 in the console:

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

![Program console output](./img/FizzBuzzPantalla.png)

---

## ✅ Tests

The project includes unit tests with **JUnit 5**.

Covered cases:

- return of the number as text
- return of Fizz for multiples of 3
- return of Buzz for multiples of 5
- return of FizzBuzz for multiples of 3 and 5

![Unit tests passing](./img/FizzBuzzTest.png)

---

## 🔁 TDD Process Followed

- `1 -> "1"`
- `2 -> "2"`
- `3 -> "Fizz"`
- `6 -> "Fizz"`
- `5 -> "Buzz"`
- `10 -> "Buzz"`
- `15 -> "FizzBuzz"`

---

## 🚀 How to Run the Project

### 🧪 Run Tests

You can run tests from **IntelliJ IDEA** or with **Maven**:

```bash
mvn test
```

### ▶️ Run the Application

Run the application by executing the `Main.java` class.

---

## 📌 Requirements Met

- Function that converts numbers to the expected string
- Output printing from main
- Tests implemented and passing
- Test evidence included in the README
- Application correctly printing the sequence

---

## 👨‍💻 Author

**David Navarro**
Project developed as a TDD testing practice in Java using the FizzBuzz kata.
