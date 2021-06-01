package com.cbs.java_essential.ruslan.homework.lesson1.task3;

/**
 * by Ruslan
 * HomeWork 1 task3
 * Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен содержать одно
 * строковое поле и метод void show (). Реализуйте возможность добавления в книгу названия книги, имени автора
 * и содержания. Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
 */

public class Title extends Book {
    String title;

    public Title(String title) {
        this.title = title;
    }

    public Title() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    void show() {

        System.out.println("Название: " + title);
    }
}
