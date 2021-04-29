package com.cbs.java_essential.ruslan.homework.lesson1.taskadd;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 1 taskadd
 * оздать класс с именем Address. В теле класса требуется создать поля: index, country, city, street, house, apartment.
 * Для каждого поля, создать метод с двумя методами доступа (get, set) Создать экземпляр класса Address.
 * В поля экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей, описывающих адрес.
 */
class Address {

    private int index;
    private String city;
    private String country;
    private String street;
    private int house;
    private int apartment;

    Address(int index, String city, String country, String street, int house, int apartment) {
        this.index = index;
        this.city = city;
        this.country = country;
        this.street = street;
        this.house = house;
        this.apartment = apartment;

    }
    Address() { }

    int getIndex() {
        return index;
    }

    void setIndex(int index) {
        this.index = index;
    }

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    String getStreet() {
        return street;
    }

    void setStreet(String street) {
        this.street = street;
    }

    int getHouse() {
        return house;
    }

    void setHouse(int house) {
        this.house = house;
    }

    int getApartment() {
        return apartment;
    }

    void setApartment(int apartment) {
        this.apartment = apartment;
    }

    void Show() {
        System.out.printf("Index: %2s  Country: %2s   sity: %2s   street: %2s   house: %2s    appartment: %2s",
                getIndex(), getCountry(), getCity(), getStreet(), getHouse(), getApartment() + "\n");
    }

}




