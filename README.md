## 📘 Java Inheritance Programs

This repository contains various Java programs that demonstrate the concept of **Inheritance** in Object-Oriented Programming (OOP).

### 🚀 About Inheritance

Inheritance is one of the core principles of OOP that allows one class to acquire the properties and behaviors (methods) of another class. It helps in **code reusability**, **extensibility**, and **hierarchical classification**.

---

### 📂 Programs Included

* Single Inheritance Example
* Multilevel Inheritance Example
* Hierarchical Inheritance Example
* Hybrid Inheritance (using interfaces)
* Method Overriding Example
* Use of `super` keyword
* Constructor in Inheritance

---

### 🛠️ Technologies Used

* Java
* JDK 8 or above
* Any IDE (Eclipse / IntelliJ IDEA / VS Code)

---

### ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```

2. Open the project in your IDE

3. Compile and run any `.java` file:

   ```bash
   javac FileName.java
   java FileName
   ```

---

### 📌 Key Concepts Covered

* Code Reusability
* IS-A Relationship
* Method Overriding
* Use of `super` and `this`
* Constructor Chaining

---

### 📖 Example

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
```

---

### 🎯 Purpose

This repository is created for:

* Learning Java OOP concepts
* Practicing inheritance programs
* Helping students understand real-world examples

---

### 🤝 Contribution

Feel free to fork this repository and add more examples of inheritance.

---

### 📄 License

This project is open-source and available under the MIT License.

---

