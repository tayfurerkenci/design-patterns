# Design Patterns in Kotlin - Head First Design Patterns

This repository contains Kotlin implementations of the design patterns described in the "Head First Design Patterns" book by O'Reilly. Each pattern is implemented as a separate module within this project.

## Design Pattern
A pattern is a solution to a problem in a context.
- The **context** is the situation in which the pattern applies. This should be  a recurring situation.
- The **problem** refers to the goal you are trying to achieve in this context, but it also refers to any constraints that occur in the context.
- The **solution** is what you're after: a general design that everyone can apply that resolves the goal and set of constraints.

> If you find yourself in a *context* with a *problem* that has a goal that is affected by a set of constraints, then you can apply a design that resolves the goal and constaints and leads to a *solution*.


1. ### Strategy Pattern
   The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

   #### Example:  
   - `QuackBehavior` interface defines a `quack` method.
   - `Squeak` class implements `QuackBehavior` and provides a specific implementation of `quack`.

2. ### Observer Pattern
   The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

   #### Example:  
   - `CurrentConditionsDisplay` class implements `Observer` and `DisplayElement` interfaces.
   - It registers itself with `WeatherData` and updates its display whenever the weather data changes
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

7. ### Adapter and Facade Pattern
   The Adapter Pattern allows objects with incompatible interfaces to collaborate. It wraps itself around an object and presents a different interface to the client. The Facade Pattern provides a simplified interface to a complex subsystem, making it easier for the client to interact with the subsystem.

8. ### Template Method Pattern
   The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
9. ### Iterator and Composite Pattern
   - #### The Iterator Pattern
     Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. 
   - #### The Composite Pattern 
     Allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

10. ### State Pattern
    The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

11. ### Proxy Pattern
    The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. It can be used for lazy initialization, access control, logging, etc.

12. ### Compound Pattern
    The Compound Pattern combines multiple design patterns to solve a complex problem. It often involves using patterns like Composite, Decorator, and Strategy together to create a more flexible and reusable design.
13. ### Bridge Pattern
    The Bridge Pattern decouples an abstraction from its implementation so that the two can vary independently. It is used to separate the interface from the implementation, allowing both to evolve separately.
14. ### Builder Pattern
    The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It is useful for creating objects with many optional parameters or when the construction process is complex.
15. ### Chain of Responsibility Pattern
    The Chain of Responsibility Pattern allows multiple objects to handle a request without the sender needing to know which object will handle it. The request is passed along a chain of potential handlers until one of them handles it.
16. ### Flyweight Pattern
    The Flyweight Pattern is a structural design pattern that allows programs to support vast quantities of objects by keeping their memory consumption low. It achieves this by sharing as much data as possible with similar objects.
17. ### Interpreter Pattern
    The Interpreter Pattern is a behavioral design pattern that defines a grammatical representation for a language and provides an interpreter to deal with this grammar. It is used to evaluate sentences in a language.
18. ### Mediator Pattern
    The Mediator Pattern is a behavioral design pattern that defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
19. ### Memento Pattern
    The Memento Pattern is a behavioral design pattern that provides the ability to restore an object to its previous state (undo via rollback). The memento pattern is implemented with three objects: the originator, a caretaker, and a memento.
20. ### Prototype Pattern
    The Prototype Pattern is a creational design pattern that allows cloning objects, even complex ones, without coupling to their specific classes. It is used when the cost of creating a new object is expensive or complicated.
21. ### Visitor Pattern
    The Visitor Pattern is a behavioral design pattern that separates an algorithm from the object structure on which it operates. It allows you to add new operations to existing object structures without modifying those structures.

<em>Each pattern is implemented with Kotlin, showcasing how these patterns can be applied in a modern programming language. The examples are designed to be as idiomatic and clear as possible, demonstrating the power and simplicity of Kotlin in implementing classic design patterns.</em>