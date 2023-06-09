# Software-Design-Patterns

## What is a Design Pattern?

A Design pattern is a solution to a problem in a context.

That’s not the most revealing definition, is it? But don’t worry, I am going to step through each of these parts, context, problem, and solution.

## Context
The context is the situation in which the pattern applies. This should be a recurring situation.

**Example:** You have a collection of objects.

## Problem
The problem refers to the goal you are trying to achieve in this context, but it also refers to any constraints that occur in the context.

**Example:** You need to step through the objects without exposing the collection’s implementation.

## Solution
The solution is what you’re after: a general design that anyone can apply which resolves the goal and set of constraints.

**Example:** Encapsulate the iteration into a separate class.

___

*Design Patterns are further classified into 3 categories, which are as follows:*

## Creational Patterns
Creational patterns involve object instantiation and all provide a way to decouple a client from the objects it needs to instantiate.

Creational class patterns defer some part of object creation to subclasses, while Creational object patterns defer it to another object.

## Structural Patterns
Structural patterns let you compose classes or objects into larger structures.

The Structural class patterns use inheritance to compose classes, while the Structural object patterns describe ways to assemble objects.

## Behavioral Patterns
Any pattern is a Behavioral Pattern that is concerned with how classes and objects interact and distribute responsibility.

The Behavioral class patterns use inheritance to describe algorithms and flow of control, whereas the Behavioral object patterns describe how a group of objects cooperate to perform a task that no single object can carry out alone.

___

*Patterns are often classified by a second attribute: whether or not the pattern deals with classes or objects:*

## Class patterns
Class patterns describe how relationships between classes are defined via inheritance. Relationships in class patterns are established at compile time.

## Object patterns
Object patterns describe relationships between objects and are primarily defined by composition. Relationships in object patterns are typically created at runtime and
are more dynamic and flexible.