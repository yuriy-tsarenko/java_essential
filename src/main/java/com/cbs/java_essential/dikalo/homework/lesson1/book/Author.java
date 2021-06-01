package com.cbs.java_essential.dikalo.homework.lesson1.book;

public class Author {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println("Author is " + this.author);
    }
}
