package com.cbs.java_essential.ruslan.homework.lesson1.task3;

import java.util.Scanner;

/**
 * by Ruslan
 * HomeWork 1 task3
 * Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен содержать одно
 * строковое поле и метод void show (). Реализуйте возможность добавления в книгу названия книги, имени автора
 * и содержания. Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
 */

public class Book {

    private String book;

    void show() {
        System.out.println(book);

    }

    public static void main(String[] args) {
        Author author = new Author();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите автора: ");
        author.setAuthor(myScanner.next());


        Title title = new Title();
        Scanner myScanner1 = new Scanner(System.in);
        System.out.print("Введите название: ");
        title.setTitle(myScanner1.next());

        Content content = new Content();
        System.out.print("Введите содержание: ");
        Scanner myScanner2 = new Scanner(System.in);
        content.setContent(myScanner2.next());

        author.show();
        title.show();
        content.show();


    }
}