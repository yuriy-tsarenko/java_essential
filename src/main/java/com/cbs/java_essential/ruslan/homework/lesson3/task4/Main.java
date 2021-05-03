package com.cbs.java_essential.ruslan.homework.lesson3.task4;
/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task4
 * Создайте класс DocumentWorker. В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
 * В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
 * "Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
 * Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы, при переопределении методов
 * выводите следующие строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных
 * форматах доступно в версии Эксперт". Создайте производный класс ExpertDocumentWorker от базового класса
 * ProDocumentWorker. Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
 * "Документ сохранен в новом формате". В теле метода main() реализуйте возможность приема от пользователя номера ключа
 * доступа pro и exp. Если пользователь не вводит ключ, он может пользоваться только бесплатной версией
 * (создается экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp,
 * то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
 */


import java.io.*;

public class Main {
    public static void main(String[] args)  {

        int proKey = 4444;
        int expKey = 1111;

        int inputVersionKey = -1;

        BufferedReader bufferedReaderKey = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Введите ключ продукта: ");
        try {
            inputVersionKey = Integer.parseInt(bufferedReaderKey.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (inputVersionKey == proKey) {
            System.out.println("Pro access");
            DocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();

        } else if (inputVersionKey == expKey) {
            DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Exp access");
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println("Free version");
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
    }
}
