package io.javatab.microservices.core.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.javatab") // To enable Spring Boot's autoconfiguration feature to detect Spring Beans in the api and util projects, we also need to add a @ComponentScan annotation to the main application class, which includes the packages of the api and util projects:
public class CourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

}
