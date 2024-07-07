# Design Patterns in Kotlin - Head First Design Patterns

This repository contains Kotlin implementations of the design patterns described in the "Head First Design Patterns" book by O'Reilly. Each pattern is implemented as a separate module within this project.

1. ### Strategy Pattern
   The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

2. ### Observer Pattern
   The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

3. ### Decorator Pattern
   The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

4. ### Factory Pattern
   The Factory Pattern defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. It includes Factory Method and Abstract Factory sub-patterns.

    - #### Factory Method
      Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

    - #### Abstract Factory
      Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

5. ### Singleton Pattern
   The Singleton Pattern ensures a class has only one instance and provides a global point of access to it.

6. ### Command Pattern
   The Command Pattern encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. It also allows for the support of undoable operations.

Each pattern is implemented with Kotlin, showcasing how these patterns can be applied in a modern programming language. The examples are designed to be as idiomatic and clear as possible, demonstrating the power and simplicity of Kotlin in implementing classic design patterns.