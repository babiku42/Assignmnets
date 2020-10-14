package com.vastika.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("text")
@Primary
public class TextServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message) {
System.out.println(message+ "is sent to mobile ");
	}

}
