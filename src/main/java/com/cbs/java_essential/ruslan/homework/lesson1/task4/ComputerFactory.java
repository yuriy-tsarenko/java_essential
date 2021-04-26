package com.cbs.java_essential.ruslan.homework.lesson1.task4;
/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 1 task4
 */

import static java.lang.Math.random;
import static java.lang.Math.round;

class ComputerFactory {

    static Computer generComputer() {

        Computer computer = new Computer();
        String[] name = new String[]{"Asus", "Neo", "Palm", "Atom", "Ibm", "Sony"};
        String[] procesor = new String[]{"amd", "intel", "pentium", "ruzen", "celeron"};
        int n = (int) (random() * name.length);
        int s = (int) (random() * procesor.length);
        computer.name = name[n];
        computer.procesor = procesor[s];
        computer.memeory = (int) round(random()) + 3;

        return computer;
    }
}




