package com.cbs.java_essential.dikalo.homework.lesson4.task1;

public class TxtHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT open");
    }

    @Override
    void change() {
        System.out.println("TXT change");
    }

    @Override
    void create() {
        System.out.println("TXT create");
    }

    void save() {
        System.out.println("DOC save");
    }
}
