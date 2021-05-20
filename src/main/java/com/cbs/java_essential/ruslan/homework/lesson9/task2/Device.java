package com.cbs.java_essential.ruslan.homework.lesson9.task2;

/**
 * Задание 2
 * Создать классы: 1) Основной класс Device (manufacturer(String), price(float),
 * serialNumber(String)); 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int),
 * mac (String)); Добавить методы доступа. Конструктор.
 */

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;


    Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}


class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }
}

class EthernetAdapter {
    private int speed;
    private String mac;

    EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }
}