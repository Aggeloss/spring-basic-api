<p align="center"><img src="https://i.ya-webdesign.com/images/spring-logo-png-6.png" width="250" height="150"></p>

## About Spring Boot

Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

- [Quickstart Guide](https://spring.io/quickstart).
- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/).
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/).
- Or search through all our guides on the [Guides](https://spring.io/guides) homepage.

## Features

- Create stand-alone Spring applications
- Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
- Provide opinionated 'starter' dependencies to simplify your build configuration
- Automatically configure Spring and 3rd party libraries whenever possible
- Provide production-ready features such as metrics, health checks, and externalized configuration
- Absolutely no code generation and no requirement for XML configuration

## Project Dependencies

You can find more on [project dependencies](pom.xml)

## Project Structure

In order to get the application running you need to run [ApiDataApplication](src/main/java/io/javabrains/ApiDataApplication.java) file.

The main body consists of
- [io.javabrains.springbootstarter.course](src/main/java/io/javabrains/springbootstarter/course) and
- [io.javabrains.springbootstarter.topic](src/main/java/io/javabrains/springbootstarter/topic) packages.

Both packages include a java class ([Course class](src/main/java/io/javabrains/springbootstarter/course/Course.java), [Topic class](src/main/java/io/javabrains/springbootstarter/topic/Topic.java)) responsible for entity's structure, a controller class ([Course controller](src/main/java/io/javabrains/springbootstarter/course/CourseController.java), [Topic controller](src/main/java/io/javabrains/springbootstarter/topic/TopicController.java)) which administrates requests and responses, a service class ([Course service](src/main/java/io/javabrains/springbootstarter/course/CourseService.java), [Topic service](src/main/java/io/javabrains/springbootstarter/topic/TopicService.java)) communicating with our database ([JPA](https://www.oracle.com/technetwork/java/javaee/tech/persistence-jsp-140049.html) in our case) and last but not least a repository class (([Course repository](src/main/java/io/javabrains/springbootstarter/course/CourseRepository.java), [Topic repository](src/main/java/io/javabrains/springbootstarter/topic/TopicRepository.java))) which we can add or modify the default functionality comes from JPA with.

## License

The Spring Framework is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0)
