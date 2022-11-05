package com.example.whatsapp;

public class ChatData {

    private  int userImage;
    private  String userName;
    private  String userMessage;

    public ChatData(int userImage, String userName, String userMessage) {
        this.userImage = userImage;
        this.userName = userName;
        this.userMessage = userMessage;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public  String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
}
