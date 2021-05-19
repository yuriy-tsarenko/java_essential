package com.cbs.java_essential.ruslan.homework.lesson4.task2;

/**
 * by Ryslan svitliy.rk@gmail.com
 * Homework 4 task2
 * <p>
 * Создайте класс AbstractHandler.
 * В теле класса создать методы void open(), void create(), void change(), void save().
 * Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
 * Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия,
 * создания, редактирования, сохранения определенного формата документа.
 */

public class Main {
    public static void main(String[] args) {


        DocHandler docHandler = new DocHandler();
        System.out.println(" Работа с форматом DOC");
        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();

        TxtHandler txtHandler = new TxtHandler();
        System.out.println(" Работа с форматом TXT");
        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();

        XmlHandler xmlHandler = new XmlHandler();
        System.out.println(" Работа с форматом XML: ");
        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();

    }
}