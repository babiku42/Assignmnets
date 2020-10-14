package com.vastika.spring_core_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        User u=new User();
//        u.displayUserInfo();
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
    	User user= (User)context.getBean("p");
    	user.displayUserInfo();
    	
    }
}
 