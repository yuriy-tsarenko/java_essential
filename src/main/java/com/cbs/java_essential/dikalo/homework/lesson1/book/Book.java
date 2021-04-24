package com.cbs.java_essential.dikalo.homework.lesson1.book;

public class Book {

    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setAuthor("Taras Shevchenko");
        title.setTitle("Kobzar");
        content.setContent("sad poems :(");

        author.show();
        title.show();
        content.show();

    }
}
