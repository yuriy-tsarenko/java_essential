
package com.cbs.java_essential.ruslan.homework.lesson8.task3;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework8 task 3
 * Требуется: Описать класс с именем Price, содержащую следующие поля:
 * название товара;
 * название магазина, в котором продается товар;
 * стоимость товара в гривнах.
 * Написать программу, выполняющую следующие действия:
 * ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены
 * в алфавитном порядке по названиям магазинов);
 * вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры
 * (если такого магазина нет, вывести исключение).
 */


public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Price[] prices = new Price[2];
        List<Price> listPrice;
        listPrice = Arrays.asList(prices);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        while (i < prices.length) {

            String nameProduct = null;
            String nameShop = null;
            double price = 0;

            System.out.println("Название продукта: ");
            try {
                nameProduct = reader.readLine();
            } catch (IOException e) {
                log.warn(e);
            }
            System.out.println("Название магазина: ");
            try {
                nameShop = reader.readLine();
            } catch (IOException e) {
                log.warn(e);
            }
            System.out.println("Цена: ");
            try {
                price = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                log.warn(e);
                System.out.println("Только цифры");
            }
            prices[i] = new Price(nameProduct, nameShop, price);
            i++;
        }

        bubbleSortArrayList(listPrice);
        for (Price price : listPrice) {
            System.out.println(price);
        }

        System.out.println("Ведите название магазина:");
        String inputName = null;
        try {
            inputName = reader.readLine();
        } catch (IOException e) {
            log.warn(e);
        }


        boolean isFound = false;
        for (Price price : prices) {
            String name = price.getShopName();
            if (name.equals(inputName)) {
                isFound = true;
                System.out.print(" Найдено: " + price + ";");
            }
        }
        if (!isFound) {
            Exception myException = new Exception("My Exception ", new RuntimeException());
            try {
                throw myException;
            } catch (Exception e) {
                log.warn(e);
                System.out.println("Не найдено.");
            }
        }
    }

    private static void bubbleSortArrayList(List<Price> priceList) {
        Price temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < priceList.size() - 1; i++) {
                if (priceList.get(i).compareTo(priceList.get(i + 1)) > 0) {
                    temp = priceList.get(i);
                    priceList.set(i, priceList.get(i + 1));
                    priceList.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}