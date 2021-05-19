//Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс DocumentWorker. В теле класса создайте три метода
// openDocument(), editDocument(), saveDocument(). В тело каждого из методов добавьте вывод на экран соответствующих
// строк: "Документ открыт", "Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии
// Про". Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы, при переопределении
// методов выводите следующие строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение в
// остальных форматах доступно в версии Эксперт". Создайте производный класс ExpertDocumentWorker от базового класса
// ProDocumentWorker. Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
// "Документ сохранен в новом формате". В теле метода main() реализуйте возможность приема от пользователя номера ключа
// доступа pro и exp. Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
// экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр
// соответствующей версии класса, приведенный к базовому – DocumentWorker.

package com.cbs.java_essential.dikalo.homework.lesson3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String proKey = "pro";
        String expKey = "exp";

        String key = new Scanner(System.in).nextLine();

        if (key.equals(proKey)) {
            DocumentWorker instance = new ProDocumentWorker();
            instance.openDocument();
            instance.editDocument();
            instance.saveDocument();
        } else if (key.equals(expKey)) {
            DocumentWorker instance = new ExpertDocumentWorker();
            instance.openDocument();
            instance.editDocument();
            instance.saveDocument();
        } else {
            DocumentWorker instance = new DocumentWorker();
            instance.openDocument();
            instance.editDocument();
            instance.saveDocument();
        }
    }
}
