package com.cbs.java_essential.ruslan.homework.lesson1.taskadd;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 1 taskadd
 * оздать класс с именем Address. В теле класса требуется создать поля: index, country, city, street, house, apartment.
 * Для каждого поля, создать метод с двумя методами доступа (get, set) Создать экземпляр класса Address.
 * В поля экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей, описывающих адрес.
 */
public class Main {
    public static void main(String[] args) {

        Address address = new Address(5555, "Grodno", "Belarus", "Bulbana",
                32, 477);
        Address address1 = new Address();
        address1.setIndex(4444);
        address1.setCountry("Ukraine");
        address1.setCity("Poltava");
        address1.setStreet("Persha");
        address1.setHouse(33);
        address1.setApartment(22);

        address.Show();
        address1.Show();

    }
}
