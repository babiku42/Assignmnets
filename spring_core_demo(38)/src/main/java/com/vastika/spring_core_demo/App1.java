package com.vastika.spring_core_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config1.xml");
	
	User1 user= (User1)context.getBean("p");
	user.displayUserInfo();
	
	}

}
