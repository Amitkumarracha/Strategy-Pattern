---

## 🦆 **Strategy Pattern - Duck Behavior Simulation**

### 📌 **Project Overview**
This project demonstrates the **Strategy Pattern** in Java by simulating different duck behaviors. Instead of hardcoding behavior into the `Duck` class, **behavior is encapsulated into separate interfaces** (`FlyBehavior`, `SwimBehavior`, and `QuackBehavior`). This allows ducks to **change behaviors dynamically at runtime** without modifying existing classes.

---

### 📂 **Directory Structure**
```
📦 Strategy-Pattern
 ┣ 📂 src
 ┃ ┣ 📂 behaviors
 ┃ ┃ ┣ 📜 FlyBehavior.java         # Interface for fly behavior
 ┃ ┃ ┣ 📜 SwimBehavior.java        # Interface for swim behavior
 ┃ ┃ ┣ 📜 QuackBehavior.java       # Interface for quack behavior
 ┃ ┃ ┣ 📜 FlyWithWings.java        # Implements flying with wings
 ┃ ┃ ┣ 📜 NotFly.java              # Implements no flying behavior
 ┃ ┃ ┣ 📜 Swim.java                # Implements swimming behavior
 ┃ ┃ ┣ 📜 Float.java               # Implements floating behavior
 ┃ ┃ ┣ 📜 Drown.java               # Implements drowning behavior
 ┃ ┃ ┣ 📜 Quack.java               # Implements quacking behavior
 ┃ ┃ ┣ 📜 Squeak.java              # Implements squeaking behavior
 ┃ ┃ ┣ 📜 MuteQuack.java           # Implements silent behavior
 ┃ ┣ 📂 ducks
 ┃ ┃ ┣ 📜 Duck.java                # Abstract class defining a duck
 ┃ ┃ ┣ 📜 MallardDuck.java         # Mallard Duck implementation
 ┃ ┃ ┣ 📜 RedHeadDuck.java         # RedHead Duck implementation
 ┃ ┃ ┣ 📜 RubberDuck.java          # Rubber Duck implementation
 ┃ ┃ ┣ 📜 DecoyDuck.java           # Decoy Duck implementation
 ┃ ┣ 📜 Main.java                  # Main class to test the application
 ┣ 📜 UML-Diagram.png                # UML Class Diagram (Generated)
 ┣ 📜 README.md                     # Project Documentation

               
```

---

### 🎯 **Design Principles Used**
✅ **Strategy Pattern** - Defines a family of algorithms (fly, swim, quack behaviors), encapsulates them, and makes them interchangeable.  
✅ **Encapsulation** - Behavior-specific logic is encapsulated in separate classes instead of being hardcoded into the `Duck` class.  
✅ **Open-Closed Principle** - New behaviors can be added without modifying existing code.  
✅ **Dependency Injection** - Duck behaviors are **set dynamically** via setter methods.

---

### 🏗 **How It Works**
1. **Three Interfaces Define Behavior**
    - `FlyBehavior` → Defines how a duck flies (`FlyWithWings`, `NotFly`).
    - `SwimBehavior` → Defines how a duck swims (`Swim`, `Float`, `Drown`).
    - `QuackBehavior` → Defines how a duck quacks (`Quack`, `Squeak`, `MuteQuack`).

2. **Duck Behaviors Are Implemented Separately**
    - Each behavior has its **own concrete class** implementing the respective interface.

3. **Ducks Are Defined Using Composition**
    - `MallardDuck`, `RedHeadDuck`, `RubberDuck`, and `DecoyDuck` **inherit** from `Duck`.
    - Each duck is **assigned behaviors dynamically** in the constructor.

4. **Main Class Executes Duck Actions**
    - Calls `performFly()`, `performSwim()`, and `performQuack()` to execute behaviors dynamically.

---

### 🛠 **Setup & Installation**
#### **Prerequisites**
- Java 8 or later
- IntelliJ IDEA (Ultimate recommended for UML)

#### **Steps to Run the Project**
1️⃣ Clone the repository:
```bash
git clone https://github.com/yourusername/DuckStrategyPattern.git
cd DuckStrategyPattern
```
2️⃣ Compile and Run:
```bash
javac src/**/*.java
java src.Main
```
3️⃣ **Output**
```bash
----- Mallard Duck -----
I am a Mallard Duck!
Quack Quack!
I can fly with wings!
I can swim!

----- RedHead Duck -----
I am a RedHead Duck!
Quack Quack!
I can fly with wings!
I can swim!

----- Rubber Duck -----
I am a Rubber Duck!
Squeak Squeak!
I cannot fly!
I am floating!

----- Decoy Duck -----
I am a Decoy Duck!
I am silent!
I cannot fly!
I am drowning!
```

---

### 🖥 **Class Diagram**
📌 **[UML Diagram](UML-Diagram.png) - Click to View**  
(Generated using IntelliJ IDEA Ultimate)  
![UML Diagram](UML-Diagram.png)

---

### 🔄 **Modifying Duck Behavior at Runtime**
Ducks can change their behaviors dynamically!  
Example: Making a RubberDuck fly:
```java
Duck rubberDuck = new RubberDuck();
rubberDuck.setFlyBehavior(new FlyWithWings());  // Change behavior at runtime
rubberDuck.performFly();
```
📝 **Output:**
```
I can fly with wings!
```

---

### 📚 **Key Learnings**
✅ **Strategy Pattern** makes the code flexible and scalable.  
✅ **Encapsulation & Composition** over inheritance improves maintainability.  
✅ **Behavioral Changes at Runtime** allow ducks to change behaviors dynamically.

---

### 📜 **License**
MIT License. Free to use and modify.

------

This `README.md` is **well-structured, professional, and detailed**! 🚀  
Let me know if you need any modifications. 👍
