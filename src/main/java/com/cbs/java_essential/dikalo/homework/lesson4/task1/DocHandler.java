package com.cbs.java_essential.dikalo.homework.lesson4.task1;

public class DocHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC open");
    }

    @Override
    void change() {
        System.out.println("DOC change");
    }

    @Override
    void create() {
        System.out.println("DOC create");
    }

    void save() {
        System.out.println("DOC save");
    }
}
