package com.cbs.java_essential.examples.lesson8.with_logger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleLogger logger = new SimpleLogger();
        System.out.println("Which type of document would you like to work with?"
                + " Available option DOC or XML or TXT. Input one of them.");
        String choice = sc.nextLine();
        
        try {
            switch (TypeOfDocuments.getChoice(choice)) {
                case TXT:
                    System.out.println("TXT");
                    break;
                case XML:
                    System.out.println("XML");
                    break;
                case DOC:
                    System.out.println("DOC");
                    break;
                default:
                    System.out.println("unsupported value");
            }
        } catch (IllegalStateException e) {
            logger.logInfo(e.toString());
        }
    }
}

