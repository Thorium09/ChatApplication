package com.paras.Chatroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomApplication.class, args);
	}


	/*
	   different urls
	*  to connect with server :  /server
	   to send message : /app/sendMessage
	                     {}

	   to receive/subscribe to get messages: /topic/sendTo
	* */
}
