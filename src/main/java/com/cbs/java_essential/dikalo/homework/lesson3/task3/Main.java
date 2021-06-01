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
