package com.paras.Chatroom.controller;


import com.paras.Chatroom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
//    Method to send message to everyone everytime if a message is received
@MessageMapping("/sendMessage") // this is the url through which the message will be sent
@SendTo("/topic/sendTo") // this is the PUB-SUB models publisher to which various subscribers will sub
//                    to get the message
    public Message sendMessage(@RequestBody Message message){
//        here we will put our thread to sleep for some time
//        i.e for that time the method will wait and then it will
//        send the message to everyone after receiving it.

        try {
//            extra processing i.e saving messages to database can be done here
            Thread.sleep(1000);
        }
        catch (InterruptedException ignored){

        }
        return message;
    }

}
