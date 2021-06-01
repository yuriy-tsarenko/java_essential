package com.cbs.java_essential.dikalo.homework.lesson4.task1;

public class XmlHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("XML open");
    }

    @Override
    void change() {
        System.out.println("XML change");
    }

    @Override
    void create() {
        System.out.println("XML create");
    }

    void save() {
        System.out.println("DOC save");
    }
}
