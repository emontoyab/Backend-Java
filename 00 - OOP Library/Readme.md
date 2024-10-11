# Library Loans 📚📕📖
## by: Esteban Montoya 🦊
---

This excercise is a practice of Object-Oriented Programming (OOP) in Java. This first stage consists of a package containing different classes in order to relate them with the 4 fundamental principles of OOP. These are based on the attached [UML diagram](/UML-Library.drawio.png) created before the excercise.

The 'library' package groups some classes and its related sub-classes that are called later in the 'main' entry-point. The classes are:
  * 📕**Loan**: Consists of some attributes and methods related with a Loan of certain material. It receives arguments like Client and Material classes and basic info like checkIn, used to calculate a due date.
  * 🙍‍♀️🙍‍♂️**Client**: Contains the basic information about any client and is used as input in Loan class.
  * 📚**Material**: This is a class extended into three different materials as is shown below.
      * 📒 Book
      * 📰 Newspaper
      * 🎞 Multimedia

## How to run

To run this code, a git clone should be made into a local copy and after this run the follow:

<div align="center">

```
javac main.java
```

```
java Main
```
</div>

