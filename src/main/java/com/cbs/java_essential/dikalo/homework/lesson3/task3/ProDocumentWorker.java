package com.cbs.java_essential.dikalo.homework.lesson3.task3;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("Document edited.");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document is saved in the old format, saving in other formats is available "
                + "in the Expert version");
    }
}
