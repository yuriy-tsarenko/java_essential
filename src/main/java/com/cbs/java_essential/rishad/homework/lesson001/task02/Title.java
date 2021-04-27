package com.cbs.java_essential.rishad.homework.lesson001.task02;

public class Title {
    String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show() {
        System.out.println("Имя книги: " + getTitle());
    }
}
