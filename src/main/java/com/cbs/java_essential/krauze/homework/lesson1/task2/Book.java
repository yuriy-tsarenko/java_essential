package com.cbs.java_essential.krauze.homework.lesson1.task2;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        author.setAuthor("М.Булгаков");
        title.setTitle("Мастер и Маргарита");
        content.setContent("Драмма");

        author.show();
        title.show();
        content.show();
    }
}