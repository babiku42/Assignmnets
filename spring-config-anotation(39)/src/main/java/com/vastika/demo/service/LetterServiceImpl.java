package com.vastika.demo.service;

import org.springframework.stereotype.Component;

@Component("letter")
public class LetterServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message+ "message send via Letter ");
	}

}
