# Intro

Minimal List of Things that every software professional should be conversant with:

* Design patterns (describe all 25 patterns of the GOF book, including examples)
* Design principles (know the SOLID principles)
* Methods (understand XP, Scrum, Lean, Kanban, Waterfall, Structured Analysis)
* Disciplines (practice TDD, Pair Programming)
* Artifacts (UML, DFD, Petri Nets,..)


# GOF Design Patterns

One of my favourity overview of the most common GOF patteterns is this stackoverflow question:

http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries

its based one real world examples in java core libraries.

# Code Katas

https://github.com/emilybache/GildedRose-Refactoring-Kata


# SOLID Design principles

https://zeroturnaround.com/rebellabs/object-oriented-design-principles-and-the-5-ways-of-creating-solid-applications/

* Single Responsibility Priniciple ("just because you can, doesnt mean you should")
The Single Responsibility Principle (SRP) states that there should never be more than one reason for a class to change.

* Open Close Principle ("you dont need to rewrite your Motherboard to plug in a USB stick")
The Open-Closed Principle (OCP) states that classes should be open for extension but closed for modification.

* Liskov Substitution Principle (If it looks like a Duck, Qacks like a Duck, but needs batteries - you probably have the wrong abstraction")
The Liskov Substitution Principle (LSP) applies to inheritance hierarchies, specifying that you should design your classes so that client dependencies can be substituted with subclasses without the client knowing about the change.

* Interface Segregation Principle ("If IRequireFood, I want to Eat(Food food) not, LightCalabra() or LayoutCuterly(CuterlyLayout preferredLayout) ")
The Interface Segregation Principle (ISP) states that clients should not be forced to depend upon interface members they do not use. When we have non-cohesive interfaces, the ISP guides us to create multiple, smaller, cohesive interfaces.

* Dependency Inversion Principle (" Would you solder a lamp directly to the electrical wiring in a wall")
The Dependency Inversion Principle (DIP) states that high-level modules should not depend upon low-level modules; they should depend on abstractions.


# Algorithms


* Different search and sorting Algorithms
* Social network (eulerian path)
* Recursion
* Tree
* Graph
* Maze solving
* Monte Carlos*
* Traveling sales man


![alt tag](http://imgs.xkcd.com/comics/travelling_salesman_problem.png)


# Clean Code Rules

**Comments** 

* Inappropriate Information
* Obsolete Comment
* Redundant Comment 
* Poorly Written Comment
* Commented-Out Code 
 
**Environment**

* Build Requires More Than One Step
* Tests Require More Than One Step 
 
**Functions**

* Too Many Arguments
* Output Arguments 
* Flag Arguments
* Dead Function 
* General
* Multiple Languages in One Source File
* Obvious Behavior Is Unimplemented
* Incorrect Behavior at the Boundaries
* Overridden Safeties
* Duplication
* Code at Wrong Level of Abstraction
* Base Classes Depending on Their Derivatives 
* Too Much Information 
* Dead Code
* Vertical Separation 
* Inconsistency 
* Clutter
* Artificial Coupling
* Feature Envy
* Selector Arguments
* Obscured Intent 
* Misplaced Responsibility
* Inappropriate Static
* Use Explanatory Variables 
* Function Names Should Say What They Do 
* Understand the Algorithm 
* Make Logical Dependencies Physical
* Prefer Polymorphism to If/Else or Switch/Case 
* Follow Standard Conventions
* Replace Magic Numbers with Named Constants
* Be Precise
* Structure over Convention
* Encapsulate Conditionals 
* Avoid Negative Conditionals
* Functions Should Do One Thing 
* Hidden Temporal Couplings
* Don’t Be Arbitrary
* Encapsulate Boundary Conditions
* Functions Should Descend OnlyOne Level of Abstraction 
* Keep Configurable Data at High Levels
* Avoid Transitive Navigation
 
**Java**

* J1: Avoid Long Import Lists by Using Wildcards
* J2: Don’t Inherit Constants 
* J3: Constants versus Enums
 
**Names**

* *Choose Descriptive Names
* Choose Names at the Appropriate Level of Abstraction
* Use Standard Nomenclature Where Possible
* Unambiguous Names
* Use Long Names for Long Scopes
* Avoid Encodings
* Names Should Describe Side-Effects 
 
**Tests**

* Insufficient Tests
* Use a Coverage Tool!
* Don’t Skip Trivial Tests 
* An Ignored Test Is a Question about an Ambiguity
* Test Boundary Conditions
* Exhaustively Test Near Bugs
* Patterns of Failure Are Revealing 
* Test Coverage Patterns Can Be Revealing 
* Tests Should Be Fast
