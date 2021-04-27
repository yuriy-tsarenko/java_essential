package com.cbs.java_essential.return13.homework.lesson1;

// Используя IDEA, создайте проект с пакетом.
// Создать класс Computer, создать массив объектов Computers размером 5.
// Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)

public class Computer {
    String number;

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++) {
            computers[i].number = "computer " + i;

        }

        for (Computer c : computers) {
            System.out.println(c.number);
        }


    }

}
