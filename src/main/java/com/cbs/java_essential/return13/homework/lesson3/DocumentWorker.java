package com.cbs.java_essential.return13.homework.lesson3;

//Задание 4
//       Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс DocumentWorker.
//       В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
//       В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт", "Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
//       Создайте производный класс ProDocumentWorker.
//       Переопределите соответствующие методы, при переопределении методов выводите следующие строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт".
//       Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker. Переопределите соответствующий метод.
//       При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
//       В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
//       Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.

import java.util.Scanner;

public class DocumentWorker {
    void openDocument() {
        System.out.println("Документ открыт");
    }

    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Pro");
    }

    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Pro");
    }
}

class ProDocumentWorker extends DocumentWorker {
    @Override
    void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}

class ExpertDocumentWorker extends DocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}

class Main1 {
    private int key = 1, keyPro = 2, keyExp = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключ к версии");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Вам доступна обычная версия программы");
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                break;
            case 2:
                System.out.println("Вам доступна Pro версия программы");
                DocumentWorker documentWorkerPro = new ProDocumentWorker();
                documentWorkerPro.openDocument();
                documentWorkerPro.editDocument();
                documentWorkerPro.saveDocument();
                break;
            case 3:
                System.out.println("вам доступна Эксперт версия программы");
                DocumentWorker documentWorkerExp = new ExpertDocumentWorker();
                documentWorkerExp.openDocument();
                documentWorkerExp.editDocument();
                documentWorkerExp.saveDocument();
                break;
        }


    }
}
