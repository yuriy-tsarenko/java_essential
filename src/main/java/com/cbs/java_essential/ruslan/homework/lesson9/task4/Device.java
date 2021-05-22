package com.cbs.java_essential.ruslan.homework.lesson9.task4;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework9 task4
 *  Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
 * Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
 */

class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    String getManufacturer() {
        return manufacturer;
    }

    float getPrice() {
        return price;
    }

    String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device: "
                + "manufacture = " + getManufacturer()
                + ", price = " + getPrice()
                + ", serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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

    private int getResolutionX() {
        return resolutionX;
    }

    private int getResolutionY() {
        return resolutionY;
    }


    @Override
    public String toString() {
        return "Monitor: "
                + "manufacture = " + getManufacturer()
                + ", price = " + getPrice()
                + ", serialNumber = " + getSerialNumber()
                + ", X = " + getResolutionX()
                + ", Y = " + getResolutionY();
    }
}

class EthernetAdapter {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
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
