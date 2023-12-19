package com.paras.Chatroom.models;

public class Message {
    private String Sender;
    private String content;

    public Message(String sender, String content) {
        Sender = sender;
        this.content = content;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
