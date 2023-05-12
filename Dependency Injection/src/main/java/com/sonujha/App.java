package com.sonujha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sonujha.car.Toyota;
import com.sonujha.interfac.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car swift = new Toyota();
		System.out.println(swift.display());
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean("swift",Car.class);
		System.out.println(car.display());
		context.close();
	}
}
