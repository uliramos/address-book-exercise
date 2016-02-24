package com.carlosr.exercises.gumtree;

import com.carlosr.exercises.gumtree.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AddressBookExerciseApplication {

	@Autowired
	private AddressBookService serviceExceptionHandler;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AddressBookExerciseApplication.class, args);

		AddressBookService serviceExceptionHandler = (AddressBookService) applicationContext.getBean("serviceExceptionHandler");

		System.out.println("Answer to question 1 " + serviceExceptionHandler.findNumberOfMales());
		System.out.println("Answer to question 2 " + serviceExceptionHandler.findOldestPerson());
		System.out.println("Answer to question 3 " + serviceExceptionHandler.calculateDaysBetweenDOBs("Bill McKnight", "Paul Robinson"));
	}
}
