package com.cbs.java_essential.ruslan.homework.lesson3.task2;
/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task2
 */

class GoodPupil extends Pupil {

    @Override
    void read() {
        System.out.println("Read: good");
    }

    @Override
    void study() {
        System.out.println("Study: good");
    }

    @Override
    void write() {
        System.out.println("Write: good");
    }

    @Override
    void relax() {
        System.out.println("Relax: good");
    }
}