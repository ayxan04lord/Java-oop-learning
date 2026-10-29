# Java OOP Learning Project

A hands-on Java project covering core Object-Oriented Programming concepts through practical examples and mini-projects.

## 📚 Topics Covered

- **Classes & Objects** — constructors, fields, methods
- **Encapsulation** — private fields, getters/setters, data validation
- **Static members** — static fields and methods
- **Inheritance** — extending classes, method overriding
- **Interfaces** — defining contracts, default methods
- **Access control** — simulating real-world security logic

## 📁 Project Structure

```
src/
├── Practice/               # Core OOP practice exercises
│   ├── SecureBankCard.java     # Bank card with PIN validation & daily limit
│   ├── Student.java            # Static field tracking total students
│   ├── Player.java             # Game player logic
│   ├── Calculator.java         # Static utility methods
│   ├── Car.java                # Vehicle modeling
│   ├── Human.java              # Base human class
│   ├── SmartThermostat.java    # IoT device simulation
│   ├── CinemaTicket.java       # Ticket pricing logic
│   └── ...
│
├── Encapsulation/          # Dedicated encapsulation examples
│   ├── Hero.java               # RPG hero with XP, HP, level-up system
│   ├── SecureAccount.java      # Account with password change logic
│   └── Product.java            # Product with price validation
│
├── Practice_2/             # Interfaces & polymorphism
│   ├── Vehicle.java            # Interface with default method
│   ├── Car.java                # Implements Vehicle
│   └── Motorbike.java          # Implements Vehicle
│
└── RPG_Game/               # Mini RPG game prototype
    ├── Hero.java               # Base hero class
    ├── Warrior.java            # Warrior subclass
    └── Mage.java               # Mage subclass
```

## 🔍 Highlights

### SecureBankCard
Simulates a real bank card with:
- PIN code verification
- Account locking after 3 failed attempts
- Daily withdrawal limit enforcement

### Encapsulation Hero
An RPG hero with full encapsulation:
- Takes damage, heals, and stays within HP bounds
- Gains XP and automatically levels up at 100 XP
- Each level increases max HP

### Vehicle Interface
Demonstrates Java interfaces with a `default` method:
- `start()` — must be implemented by each vehicle type
- `stop()` — shared default behavior

## 🛠️ Requirements

- Java 17+
- IntelliJ IDEA (recommended) or any Java IDE

## 🚀 Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/Ayxan/java-oop-learning.git
   ```
2. Open in IntelliJ IDEA
3. Navigate to any `Main.java` file and run it

## 👤 Author

**Ayxan** — learning Java OOP fundamentals

---

> This is a learning project. Code evolves as new concepts are explored.
