package com.cbs.java_essential.dikalo.homework.lesson1.address;

public class Address {
    private static int index;
    private static int house;
    private static int apartment;
    private static String country;
    private static String city;
    private static String street;


    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Address.index = index;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Address.country = country;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Address.city = city;
    }

    public static String getStreet() {
        return street;
    }

    public static void setStreet(String street) {
        Address.street = street;
    }

    public static int getHouse() {
        return house;
    }

    public static void setHouse(int house) {
        Address.house = house;
    }

    public static int getApartment() {
        return apartment;
    }

    public static void setApartment(int apartment) {
        Address.apartment = apartment;
    }

    public static void show() {
        System.out.println("Index: " + index + "\nCountry: " + country + "\nCity: " + city
                + "\nStreet: " + street + "\nHouse: " + house + "\nApartment: " + apartment);

    }
}
