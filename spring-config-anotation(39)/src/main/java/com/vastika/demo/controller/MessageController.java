 package com.vastika.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vastika.demo.service.MessageService;
@Component
public class MessageController {
	@Autowired
	@Qualifier("letter")
private MessageService messageService;
	@Value("${name}")
	private String name;

//public void setMessageService(MessageService messageService) {
//	this.messageService=messageService;
//}
public void sendMessage(String message) {
	System.out.println(name);
	messageService.sendMessage(message);
	
}
}
