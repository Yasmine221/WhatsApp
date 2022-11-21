package com.example.whatsapp;

public class ChatModel {
    private String Message;
    private String SenderID;

    public ChatModel(String message, String senderID) {
        Message = message;
        SenderID = senderID;

    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getSenderID() {
        return SenderID;
    }

    public void setSenderID(String senderID) {
        SenderID = senderID;
    }
}
