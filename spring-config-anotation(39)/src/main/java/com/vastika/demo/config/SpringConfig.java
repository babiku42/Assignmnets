package com.vastika.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import com.vastika.demo.controller.MessageController;
//import com.vastika.demo.service.EmailServiceImpl;
//import com.vastika.demo.service.MessageService;

@Configuration
@ComponentScan(basePackages = {"com.vastika.demo.service","com.vastika.demo.controller"})
@PropertySource(value="classpath:message.properties")
public class SpringConfig {
//	@Bean
//public  MessageService getMessageService() {
//	return new EmailServiceImpl();
//}
//@Bean
//public MessageController getMessageController() {
//	return new MessageController();
//	
//}

}
  