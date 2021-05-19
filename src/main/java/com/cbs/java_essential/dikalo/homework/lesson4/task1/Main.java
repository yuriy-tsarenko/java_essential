//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save(). Создать производные классы
// XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу, которая будет выполнять
// определение документа и для каждого формата должны быть методы открытия, создания, редактирования, сохранения
// определенного формата документа.

package com.cbs.java_essential.dikalo.homework.lesson4.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose file type\n1 - DOC\n2 - TXT\n3 - XML");
        int selectType = new Scanner(System.in).nextInt();
        switch (selectType) {
            case 1:
                System.out.println("Choose option\n1 - open\n2 - change\n3 - create");
                AbstractHandler typeDoc = new DocHandler();
                int docOption = new Scanner(System.in).nextInt();
                switch (docOption) {
                    case 1:
                        typeDoc.open();
                        break;
                    case 2:
                        typeDoc.change();
                        break;
                    case 3:
                        typeDoc.create();
                        break;
                    default:
                        System.exit(-1);
                }
                break;
            case 2:
                System.out.println("Choose option\n1 - open\n2 - change\n3 - create");
                AbstractHandler typeTxt = new TxtHandler();
                int txtOption = new Scanner(System.in).nextInt();
                switch (txtOption) {
                    case 1:
                        typeTxt.open();
                        break;
                    case 2:
                        typeTxt.change();
                        break;
                    case 3:
                        typeTxt.create();
                        break;
                    default:
                        System.exit(-1);
                }
                break;
            case 3:
                System.out.println("Choose option\n1 - open\n2 - change\n3 - create");
                AbstractHandler typeXml = new XmlHandler();
                int xmlOption = new Scanner(System.in).nextInt();
                switch (xmlOption) {
                    case 1:
                        typeXml.open();
                        break;
                    case 2:
                        typeXml.change();
                        break;
                    case 3:
                        typeXml.create();
                        break;
                    default:
                        System.exit(-1);
                }
                break;
            default:
                System.exit(-1);
        }
    }
}
