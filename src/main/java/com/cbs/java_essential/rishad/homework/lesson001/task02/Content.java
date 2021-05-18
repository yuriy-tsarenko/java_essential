package com.cbs.java_essential.rishad.homework.lesson001.task02;

public class Content {

    String content;

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    void show() {
        System.out.println("Содержание: " + getContent());
    }

}
