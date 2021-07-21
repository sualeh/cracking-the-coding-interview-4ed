# Java Solutions to Problems from Cracking the Coding Interview, Fourth Edition

Problems and solutions from [_Cracking the Coding Interview, Fourth Edition: 150 Programming Interview Questions and Solutions_](http://www.amazon.com/Cracking-Coding-Interview-Fourth-Edition/dp/145157827X) by [Gayle Laakmann McDowell](http://www.technologywoman.com). The questions are solved in Java 7, and enforced with JUnit tests. This is a Maven project, and can be opened in IntelliJ, Eclipse, or any other Java IDE.

## Features
* The questions are solved in Java 7, and enforced with JUnit tests
* Includes a Java class called [`CStyleString`](https://github.com/sualeh/cracking-the-coding-interview-4ed/blob/master/src/main/java/us/fatehi/crack4/util/CStyleString.java), which allows some of the C string algorithms to be solved in Java.
* Includes code to print binary trees in graphical form. 
* Includes code for a rudimentary directed graph, to allow graph problems to be solved.

## How to Use
You can build and run the tests using `mvn test` of course, but that is not the intent of the project. The idea is to learn how to solve common interview problems. I chose the 4th edition of the iconic book "Cracking the Coding Interview" since it is available online. (Don't tell anyone I told you.) Pick one Java class up at a time, understand the problem, and go over the solution. Then run the corresponding JUnit test from your IDE. The test will show you how the code works, and print helpful information. The test will show you how boundary conditions will work too.
