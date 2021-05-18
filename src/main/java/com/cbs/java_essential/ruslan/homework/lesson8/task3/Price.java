package com.cbs.java_essential.ruslan.homework.lesson8.task3;

import lombok.Getter;

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
@Getter
public class Price {
    private String productName;
    private String shopName;
    private double price;

    Price(String productName, String shopName, double price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    Price() {
    }
    int compareTo(Price price) {
        int result;
        result = (this.shopName).compareTo(price.shopName);
        return result;
    }
    @Override
    public String toString() {
        return "Название продукта: "
                + this.productName + "; Название магазина: "
                + this.shopName + "; Цена: " + this.price;
    }

}
