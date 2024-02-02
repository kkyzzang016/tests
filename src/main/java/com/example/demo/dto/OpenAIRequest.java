package com.example.demo.dto;

import java.util.List;

public class OpenAIRequest {
    private List<Message> messages;
    private int max_tokens;
    private String model;

    // 생성자, Getter 및 Setter 메서드

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}