# Spring Fundamentals
The fundamentals of using Spring for building Java applications

Author Info
-----------
Author: Andrew Gurung <br>
URL: http://www.andrewgurung.com/ <br>
Reference: https://app.pluralsight.com/library/courses/spring-fundamentals/table-of-contents

-----------

## Introduction
- Spring framework started out with Inversion of Control container
- Spring is a framework build to reduce complexity in developing JEE application
  - Develop enterprise software without application server
  - Note: Tomcat is a lightweight web server (NOT an application server)
- POJO based: Any code written in Spring can be written without Spring
- AOP/Proxies: Extract cross cutting concerns outside of your code
- Best practices: Singleton, abstract factory etc are built in

### Benefits
- Let us focus on business logic to solve complex problems
- Solves these problems: Testability, Maintainability, Complexity, Scalability

### Business Problem + Solution
Problem:
- It takes a huge line of code to achieve a simple JDBC query
 - Connection, PreparedStatement, Resultset, try/catch, close connection etc
 - The actual business in this example is to retrieve records from Car table where ID matches

Solution:
- Remove configuration code and lets us focus on business
- Annotation or XML based
```
// No need of Connection, Statement, try/catch blocks
getEntityManager().find(Car.class, id);
```
-----------

## Architecture and Project Setup

-----------

## Spring XML Configuration

-----------

## Spring Annotation Configuration Using XML

-----------

## Spring Configuration Using Java

-----------

## Bean Scopes

-----------

## Properties
