# Bridge Pattern Encryption Example

This project demonstrates the **Bridge design pattern** by implementing different encryption algorithms in Java. The client interacts with an abstraction layer (`InterfaceMensajeEncriptacion`), which delegates encryption operations to concrete implementations such as **AES**, **DES**, and **Blowfish**.


## 🔐 Encryption Algorithms Implemented

- **AES (Advanced Encryption Standard)**
- **DES (Data Encryption Standard)**
- **Blowfish** (newly added)
- **No encryption** (returns the original plain message)

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/KillerZeus666/BrigdeDesignPattern.git
   cd bridge
Compile the Java files:

javac patronbridge/*.java implementacion/*.java encriptacion/*.java
Run the main class:


java patronbridge.PatronBridgeMain
You should see output like:

Formato AES > <Encrypted AES message>
Formato DES > <Encrypted DES message>
Formato Blowfish > <Encrypted Blowfish message>
Sin Formato > <Curso><Nombre>Patrones de Diseño de Software</Nombre></Curso>
🧠 Design Pattern Used
This project implements the Bridge Pattern, a structural design pattern that decouples an abstraction from its implementation so that the two can vary independently. In this case, the message encryption logic is separated from the formatting logic, allowing new algorithms to be added without changing client code.

🛠 Requirements
Java 8 or higher

No external dependencies


