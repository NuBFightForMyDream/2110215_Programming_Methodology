# 2110215 Programming Methodology (2025 T2)

### My Related Repositories
- [Project](https://github.com/NuBFightForMyDream/2110215_ProgMeth_FinalProject_PotionMixie)

- [Javadoc](https://github.com/NuBFightForMyDream/2110215_FinalProject_PotionMixie_JavaDoc)

- [Some of My Lab & Exam Preparation](https://github.com/fightformygoal?tab=repositories)


Coursework for **2110215 Programming Methodology** (Computer Engineering, Chulalongkorn University), semester 2/2025.
The course covers object-oriented programming in Java: classes and objects, exceptions, inheritance, abstract classes, interfaces, JavaFX GUIs and threads.

## Tech Stack

- **Language:** Java
- **Build tool:** Gradle (each project ships with a Gradle wrapper)
- **GUI:** JavaFX 24 (via `org.openjfx.javafxplugin`)
- **Testing:** JUnit 5, TestFX

## Repository Structure

### Lectures

| Folder | Topic | Contents |
| --- | --- | --- |
| [Lecture0_215_IntroOOP](Lecture0_215_IntroOOP) | Java basics & intro to OOP | 40+ numbered examples (variables, type conversion, if/switch, loops, methods, arrays, searching/sorting), `IntroClassObjects/` (first classes: `StudentScore`, `ComplexNumber`, `Employee`), `ExerciseAndPastPapers/` |
| [Lecture1_215_OOP_Exception](Lecture1_215_OOP_Exception) | OOP & exceptions | Transport simulation, simple dice, try/catch/finally, `throw` and caller chains |
| [Lecture2_215_Inheritance](Lecture2_215_Inheritance) | Inheritance | Student hierarchy (`Student`, `UndergraduateStudent`, `GraduateStudent`, `CPStudent`) with a UML diagram |
| [Lecture3_215_AbstractClass](Lecture3_215_AbstractClass) | Abstract classes & `Object` methods | `Shape` example, `equals`/`hashCode`, `clone`, `finalize` |
| [Lecture4_215_Interface](Lecture4_215_Interface) | Interfaces | `Shapeable` interface with `Circle` and `Rectangle` |
| [CP215_Lec_04_Exercise_Factory](CP215_Lec_04_Exercise_Factory) | Lecture 4 exercise | Factory simulation (`Worker`, `Bot`, `QualityChecker`, ...) with JUnit tests |
| [CP215_Lecture05_JavaFX](CP215_Lecture05_JavaFX) | JavaFX | Hello World, windows, event handlers, property binding, styling, charts, FXML controller |
| [CP215_Lecture_06_Thread](CP215_Lecture_06_Thread) | Threads | Thread basics (sleep, interrupt, priority, yield, `Runnable`), background tasks with `Platform.runLater`, `AnimationTimer`, key/mouse/drag-and-drop events |
| [CP215_Lecture_06_ThreadAndMoreGUI](CP215_Lecture_06_ThreadAndMoreGUI) | Threads & more GUI | Same material as above, alternate copy |

### Labs

| Folder | Lab |
| --- | --- |
| [CP215_Problems/CP215_Lab_01_CardCollector_6730084521](CP215_Problems/CP215_Lab_01_CardCollector_6730084521) | Lab 01 – Card Collector |
| [CP215_Problems/CP215_Lab_02_ZergChess](CP215_Problems/CP215_Lab_02_ZergChess) | Lab 02 – Zerg Chess |
| [CP215_Problems/CP215_Lab_03_CardGameMechanic_6730084521](CP215_Problems/CP215_Lab_03_CardGameMechanic_6730084521) | Lab 03 – Card Game Mechanic |
| [CP215_Problems/CP215_Lab_04_OverdueAllYouCanRush](CP215_Problems/CP215_Lab_04_OverdueAllYouCanRush) | Lab 04 – Overdue All You Can Rush |
| [CP215_Lab_05_MineSweeper](CP215_Lab_05_MineSweeper) | Lab 05 – MineSweeper (JavaFX) |
| [CP215_Lab_06_WordRoyale](CP215_Lab_06_WordRoyale) | Lab 06 – Word Royale (JavaFX + threads) |
| [CP215_Exercise_05/CP215_Exercise_05_NoteApplication](CP215_Exercise_05/CP215_Exercise_05_NoteApplication) | Exercise 05 – Note Application |

### Mock Exercises

| Folder | Problems |
| --- | --- |
| [CP215_Lec01_Mock](CP215_Lec01_Mock) | OOP: CPTS Ticket Machine, Misa Shop, Quest System, Simple Discord |
| [CP215_Lec02_Mock](CP215_Lec02_Mock) | Inheritance: ONU, Stand User Bizarre Fighter |
| [CP215_Problems](CP215_Problems) | Mock 01–06: Image Recognition, Mining Simulator, Chess Prototype, Task Time Estimator, Nokotan Path Finder, The Cat and Dog |

### Past Labs & Exams (Practice)

| Folder | Contents |
| --- | --- |
| [CP215_2023_Labs](CP215_2023_Labs) | 2023 Lab 01 – Item Inventory |
| [CP215_2024_Labs](CP215_2024_Labs) | 2024 Lab 01 – Dungeon Game, Lab 02 – Lopburi Monkey War, Lab 03 – Lanna Ghost War |
| [CP215_Midterm_Example](CP215_Midterm_Example) | Midterm 2019 (CP Shop, Terry vs Zombies, MacroCosmos), 2020 (CV Checker, Creatures of ProgMeth, Space Chess), 2021 (COVID-19 Pandemic, Card Duelist) |
| [CP215 Final Exam Practices](<CP215 Final Exam Practices>) | Final 2019 (Guild Master Revenge, Bingo), 2020 (Smoke Sales, Tic-Tac-Toe, Space Chess) |

### Other

| Folder | Contents |
| --- | --- |
| [CP215_ProgMeth_TestProject](CP215_ProgMeth_TestProject) | Test project for checking the JavaFX + TestFX environment setup |

## How to Run

**Gradle projects** (most folders) – run from inside the project folder:

```bash
./gradlew run     # run the application
./gradlew test    # run JUnit / TestFX tests
```

On Windows use `gradlew.bat` instead of `./gradlew`.

**Plain `.java` files** (`Lecture0`–`Lecture4`) – compile and run directly:

```bash
javac Lecture00_215_01_PrintCommand.java
java Lecture00_215_01_PrintCommand
```

Opening a project folder in IntelliJ IDEA or VS Code (with the Java and Gradle extensions) also works.
