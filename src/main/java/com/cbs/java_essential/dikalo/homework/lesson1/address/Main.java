package com.cbs.java_essential.dikalo.homework.lesson1.address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        System.out.println("Enter index: ");
        int index = new Scanner(System.in).nextInt();
        System.out.println("Enter country: ");
        String country = new Scanner(System.in).nextLine();
        System.out.println("Enter city: ");
        String city = new Scanner(System.in).nextLine();
        System.out.println("Enter street: ");
        String street = new Scanner(System.in).nextLine();
        System.out.println("Enter house: ");
        int house = new Scanner(System.in).nextInt();
        System.out.println("Enter apartment: ");
        int apartment = new Scanner(System.in).nextInt();
        Address.setIndex(index);
        Address.setCountry(country);
        Address.setCity(city);
        Address.setStreet(street);
        Address.setHouse(house);
        Address.setApartment(apartment);

        Address.show();
    }
}
