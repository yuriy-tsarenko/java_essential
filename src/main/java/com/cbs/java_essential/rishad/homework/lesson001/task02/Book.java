package com.cbs.java_essential.rishad.homework.lesson001.task02;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги: ");
        Title title = new Title(scanner.nextLine());
        System.out.print("Введите имя автора: ");
        Author author = new Author(scanner.nextLine());
        System.out.print("Введите содержание книги: ");
        Content content = new Content(scanner.nextLine());

        title.show();
        author.show();
        content.show();

    }
}
