package com.cbs.java_essential.rishad.homework.lesson001.task02;

public class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Автор книги: " + getName());
    }
}
