package com.cbs.java_essential.ruslan.homework.lesson1.task3;
/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 1 task3
 * Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен содержать одно
 * строковое поле и метод void show (). Реализуйте возможность добавления в книгу названия книги, имени автора
 * и содержания. Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
 */
public class Content extends Book{
    private String content;

    Content(String content) {
        this.content = content;
    }

    Content() { }

    void setContent(String content) {
        this.content = content;
    }

    @Override
    void show() {
        System.out.println("Содержание книги: " + content);
    }
}