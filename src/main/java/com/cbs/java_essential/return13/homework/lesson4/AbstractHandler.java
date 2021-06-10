package com.cbs.java_essential.return13.homework.lesson4;

import java.util.Scanner;

//   Задание 2
//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save().
//Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия,
// создания, редактирования, сохранения определенного формата документа.


abstract class AbstractHandler {
    abstract void open();

    abstract void create();

    abstract void change();

    abstract void save();
}

class XmlHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("XML document opening");
    }

    @Override
    void create() {
        System.out.println("XML document create");
    }

    @Override
    void change() {
        System.out.println("XML document change");
    }

    @Override
    void save() {
        System.out.println("XML document saved");
    }
}

class TxtHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT document opening");
    }

    @Override
    void create() {
        System.out.println("TXT document create");
    }

    @Override
    void change() {
        System.out.println("TXT document change");
    }

    @Override
    void save() {
        System.out.println("TXT document saved");
    }
}

class DocHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC document opening");
    }

    @Override
    void create() {
        System.out.println("DOC document create");
    }

    @Override
    void change() {
        System.out.println("DOC document change");
    }

    @Override
    void save() {
        System.out.println("DOC document saved");
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите документ с расширением: Например doc.txt, doc.html");
        String s = scanner.next();

        switch (s) {
            case "doc.xml":
                AbstractHandler docXml = new XmlHandler();
                docXml.change();
                docXml.create();
                docXml.save();
                docXml.open();
                break;
            case "doc.txt":
                AbstractHandler docTxt = new TxtHandler();
                docTxt.open();
                docTxt.save();
                docTxt.create();
                docTxt.change();
                break;
            case "doc.doc":
                AbstractHandler docDoc = new DocHandler();
                docDoc.change();
                docDoc.create();
                docDoc.save();
                docDoc.open();
                break;
            default:
        }


    }
}
