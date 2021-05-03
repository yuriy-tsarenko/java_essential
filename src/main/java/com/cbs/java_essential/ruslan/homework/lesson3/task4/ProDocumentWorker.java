package com.cbs.java_essential.ruslan.homework.lesson3.task4;
/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task4
 *
 */

class ProDocumentWorker extends DocumentWorker {

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, " +
                "сохранение в остальных форматах доступно в версии Эксперт");
    }

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }
}