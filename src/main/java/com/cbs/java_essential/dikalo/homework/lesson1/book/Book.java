//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс Book(Main). Создать классы Title, Author и
//Content, каждый из которых должен содержать одно строковое поле и метод void show (). Реализуйте возможность
//добавления в книгу названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
//книги, имя автора и Содержание.

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
