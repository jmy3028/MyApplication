package com.example.student.myapplication.models;

/**
 * Created by Student on 2017-02-09.
 */

public class Chatting {
    private String chatting;

    public Chatting(String chatting) {
        this.chatting = chatting;
    }

    public String getChatting() {
        return chatting;
    }

    public void setChatting(String chatting) {
        this.chatting = chatting;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chatting{");
        sb.append("chatting='").append(chatting).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
