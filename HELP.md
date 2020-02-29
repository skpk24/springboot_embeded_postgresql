# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.3.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.3.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


### PostgreSQL integration guide.

https://dzone.com/articles/spring-boot-with-embedded-postgresql-for-dao-integ

in DbConfig 

	Instead of using
	private static final List<String> DEFAULT_ADDITIONAL_INIT_DB_PARAMS = Arrays
  .asList("--nosync", "--locale=en_US.UTF-8");
  
  Use : private static final List<String> DEFAULT_ADDITIONAL_INIT_DB_PARAMS = Arrays
  .asList("--nosync", "--locale=en_US"); 
  
  
### Instruction to run the application.

* Download and unzip the file (make sure java 8+ and maven installed in system)

* Open Command prompt and Run $ mvn clean install && mvn spring-boot:run

* Access the urls

* To run the Problem3, you can use the IDE or I have created one more file Problem4.java, just compile and run.

* **$javac Problem4.java && java Problem4**

Note : $ is to indicate the command prompt.
