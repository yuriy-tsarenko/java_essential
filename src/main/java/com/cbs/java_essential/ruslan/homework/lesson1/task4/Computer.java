package com.cbs.java_essential.ruslan.homework.lesson1.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * by Ruslan
 * HomeWork 1 task4
 *
 * Создать класс Computer, создать массив объектов Computers размером 5.
 * Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)
 */


public class Computer {
    String name;
    String procesor;
    Integer memeory;

    private Computer(String name, String procesor, Integer memeory) {
        this.name = name;
        this.procesor = procesor;
        this.memeory = memeory;
    }

    Computer() {

    }

    private String getName() {
        return name;
    }

    private String getProcesor() {
        return procesor;
    }

    private Integer getMemeory() {
        return memeory;
    }


    private void indicate() {
        System.out.printf("%8s %10s %8s", getName(), getProcesor(), getMemeory() + "\n");
    }


    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = ComputerFactory.generComputer();
        }
        Computer computer = (new Computer(ComputerFactory.generComputer().name,
                ComputerFactory.generComputer().procesor, ComputerFactory.generComputer().memeory));

        Computer computer1 = (new Computer(ComputerFactory.generComputer().name,
                ComputerFactory.generComputer().procesor, ComputerFactory.generComputer().memeory));

        Computer computer2 = (new Computer(ComputerFactory.generComputer().name,
                ComputerFactory.generComputer().procesor, ComputerFactory.generComputer().memeory));


        Computer computer3 = (new Computer(ComputerFactory.generComputer().name,
                ComputerFactory.generComputer().procesor, ComputerFactory.generComputer().memeory));

        List<Computer> list = new ArrayList<>();
        list.add(computer);
        list.add(computer1);
        list.add(computer2);
        list.add(computer3);

        System.out.printf("%8s %10s %9s", "Фабрика", "Процессор", "Память");
        System.out.println("\n" + "------------------------------");
        for (Computer sor : list) {
            sor.indicate();
        }
        System.out.println();

    }

}


