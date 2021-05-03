package com.cbs.java_essential.ruslan.homework.lesson3.task2;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task2
 */

class BadPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Read: bad");
    }

    @Override
    void study() {
        System.out.println("Study: bad");
    }

    @Override
    void write() {
        System.out.println("Write: bad");
    }

    @Override
    void relax() {
        System.out.println("Relax: bad");
    }
}
