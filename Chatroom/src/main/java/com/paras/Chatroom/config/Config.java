package com.paras.Chatroom.config;

//this is class where will config the behaviour of WebSocketMessageBroker
//to tell that through which url the connection will setup with server
// and from where the messages arrived

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
//        here we will define the prefix which will connect the client to the server

        registry.addEndpoint("/server").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        this is the configure method where we will configure the sender and Receiver broker

        WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);

        registry.enableSimpleBroker("/topic");
//        means that the simple broker will get activated when an url with "topic "
//        prefix  get executed

        registry.setApplicationDestinationPrefixes("/app");
//        when someone wants to send a message they will have to use this
//        prefix and then the next url to send a message
    }
}
