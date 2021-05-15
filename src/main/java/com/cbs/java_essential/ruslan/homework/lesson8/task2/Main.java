package com.cbs.java_essential.ruslan.homework.lesson8.task2;

import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework 8 task2
 * Требуется: Описать класс с именем Worker, содержащую следующие поля:
 * фамилия и инициалы работника;
 * название занимаемой должности;
 * год поступления на работу.
 * Написать программу, выполняющую следующие действия:
 * ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены
 * по алфавиту);
 * если значение года введено не в соответствующем формате выдает исключение.
 * вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Worker workerNew = new Worker();
        Worker[] workers = new Worker[3];

        List<Worker> listOfWorker;
        listOfWorker = Arrays.asList(workers);

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int i = 0;
        while (i < workers.length) {

            System.out.println("Введите ФИО: ");
            try {
                workerNew.setInitials(reader.readLine());
            } catch (IOException e) {
                log.warn(e);
                System.out.println(e.getMessage());
            }
            System.out.println("Введите должность: ");
            try {
                workerNew.setPosition(reader.readLine());
            } catch (IOException e) {
                log.warn(e);
                System.out.println(e.getMessage());
            }
            System.out.println("Введите год приема: ");

            try {
                workerNew.setYear(reader.readLine());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            isDateValid(workerNew.getYear());

            workers[i] = new Worker(workerNew.getInitials(), workerNew.getPosition(), workerNew.getYear());
            i++;
        }

        bubbleSortArrayList(listOfWorker);
        for (Worker value : workers) {
            System.out.println(value);
        }

        System.out.println("Введите стаж: ");
        int number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("В данном поле могут использоваться только цифры!");

        }
        int yearToday = ZonedDateTime.now().getYear();
        System.out.println("Стаж работы  превышает " + number + " лет:");
        for (Worker value : workers) {
            int years = Integer.parseInt(value.getYear());
            int experience = yearToday - years;
            if (experience > number) {
                System.out.println(value);
            }
        }
    }

    private static void bubbleSortArrayList(List<Worker> listOfWorker) {
        Worker temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < listOfWorker.size() - 1; i++) {
                if (listOfWorker.get(i).compareTo(listOfWorker.get(i + 1)) > 0) {
                    temp = listOfWorker.get(i);
                    listOfWorker.set(i, listOfWorker.get(i + 1));
                    listOfWorker.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

    private static void isDateValid(String dateToValidate) {
        if (dateToValidate == null) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        simpleDateFormat.setLenient(false);

        try {
            Date date = simpleDateFormat.parse(dateToValidate);
        } catch (ParseException e) {
            System.out.println("Неправельный формат даты! Только цифры: 9999");
        }
    }


}









