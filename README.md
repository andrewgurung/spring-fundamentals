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
Pre-requisites:
- Spring 4
- Java 8
- STS: Either use stand-alone or Eclipse plugin
- Maven

Steps:
1. Create a new Maven Project
  - groupId: com.andrewgurung
  - artifactId: spring_sample (Name of eclipse project folder)
  - Select 'Create a simple project (to skip archetype selection)'
2. Set POM.xml to use Java 8 compiler instead of default Java 1.5
  - Add the following config to pom.xml file
  - Right click and update maven project
3. Add data model or POJO class
4. Add repository layer
  - Create a repository implementation class
  - Extract an interface from the implementation class
5. Add service layer
  - Create a service layer which invokes repository layer to retrieve data
6. Add application class with main method

Pain points:
- Configuration code makes the software brittle and hard to unit test
- Remove any code where concrete implementation is instantiated
```
private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
```

### Getting Spring
- No direct download
- Download through Maven which takes care of transitive dependencies
- Maven central hosts source, Javadocs and binaries
- Alternative: Use Spring boot to setup a Spring application. But it is more of a black box

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
