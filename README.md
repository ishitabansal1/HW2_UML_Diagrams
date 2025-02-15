# HW2 UML Diagrams - Question-Answer System

## Repository Access
- **GitHub Repository URL**: https://github.com/ishitabansal1/HW2_UML_Diagrams.git
- **Access Credentials**: (Public)
- **Alternative Access**: (None)

---

## Project Overview
This repository contains a **Question-Answer System**, implementing **CRUD (Create, Read, Update, Delete) operations** and **input validation** for:
- **A `Question` class** for creating and managing questions.
- **An `Answer` class** for creating and managing answers.
- **A `Questions` class** to store, retrieve, and manage multiple questions.
- **An `Answers` class** to store, retrieve, and manage multiple answers linked to questions.

The project aligns with **UML Class and Sequence Diagrams** and covers all required **Student User Stories** and **Test Cases**.

---

## UML Diagrams
The following diagrams are included to maintain consistency between **design and implementation**:
- **UML Class Diagram** (`UML_Class_Diagram.png`) – Represents the system’s structure.
- **UML Sequence Diagram** (`UML_Sequence_Diagram.drawio`) – Shows the interaction between system components.

---

## Source Code Location
The **Java source code** is located in:
### **Files in `qa_system/` Package:**
| File | Description |
|------|------------|
| [`Main.java`](HW2_java/src/qa_system/Main.java) | Entry point of the program, runs test cases |
| [`Question.java`](HW2_java/src/qa_system/Question.java) | Defines attributes and behaviors of a question |
| [`Answer.java`](HW2_java/src/qa_system/Answer.java) | Defines attributes and behaviors of an answer |
| [`Questions.java`](HW2_java/src/qa_system/Questions.java) | Handles storage and retrieval of questions |
| [`Answers.java`](HW2_java/src/qa_system/Answers.java) | Manages CRUD operations for answers |

---

### How to Run the Code

To run the **Question-Answer System**, follow these steps:

| Command | Description |
|---------|------------|
| `cd HW2_java/src/` | Navigating to the directory |
| `javac qa_system/*.java` | Compile all Java files |
| `java qa_system.Main` | Run the application |


### ** Clone the repository**
```bash
git clone https://github.com/your-username/HW2_UML_Diagrams.git
