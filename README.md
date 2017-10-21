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

Getting Spring:
- No direct download
- Download through Maven which takes care of transitive dependencies
- Maven central hosts source, Javadocs and binaries
- Alternative: Use Spring boot to setup a Spring application. But it is more of a black box
- URL: https://spring.io/
- Get the Maven Dependency xml config and paste it into your Eclipse pom.xml
- Update Maven Project will add all the Spring dependencies under 'Maven Dependencies' folder
-----------

## Spring XML Configuration
- Spring XML Configuration is simpler and follows separation of concerns
- applicationContext.xml
  - Name doesn't matter
  - XML configuration begins with this file
- Add `applicationContext.xml` under `src/main/resources` using STS
  - Add New -> Spring -> Spring Bean Configuration File
  - Automatically adds namespace which allows to add valid elements
  ```
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans
  	http://www.springframework.org/schema/beans/spring-beans.xsd">

  </beans>
  ```
- Beans are essentially classes which replaces keyword `new`
- Adding beans involves a `name` which is an interface and `class` which is the actual implementation
```
<bean name="customerRepository"
		  class="com.andrewgurung.repository.HibernateCustomerRepositoryImpl"></bean>
```

### Injecting bean
- Getting bean inside Application main method()
```
public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());
	}
```

1. Setter injection
- Inside of applicationContext.xml:
  - Add property tag to inject
- Inside of implementation class:
  - Replace new ...() method with setter method
```
<bean name="customerService"
      class="com.andrewgurung.service.CustomerServiceImpl">
      <property name="customerRepository" ref="customerRepository"/>
</bean>
```


2. Constructor injection
- Can be used together with Setter injection
- Index based instead of name based
- Inside of applicationContext.xml:
  - Add constructor-arg tag to inject
- Inside of implementation class:
  - Add constructor method
```
<bean name="customerService"
      class="com.andrewgurung.service.CustomerServiceImpl">
      <constructor-arg index="0" ref="customerRepository"/>
</bean>
```

-----------

## Spring Annotation Configuration Using XML

-----------

## Spring Configuration Using Java

-----------

## Bean Scopes

-----------

## Properties
