package com.vickee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		Student stud = context.getBean(Student.class);
		System.out.println(stud);
		stud.display();
	}

}
