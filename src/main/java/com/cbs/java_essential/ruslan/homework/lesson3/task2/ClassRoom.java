package com.cbs.java_essential.ruslan.homework.lesson3.task2;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task2
 */
import lombok.Getter;

@Getter

class ClassRoom {

    String name;
    String surname;

    ClassRoom(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private ClassRoom() {
    }

    ClassRoom(Pupil pupil) {
        pupil.read();
        pupil.relax();
        pupil.study();
        pupil.write();
    }
    static ClassRoom randomStudent() {

        ClassRoom students = new ClassRoom();
        String[] name = new String[]{"Eva", "Boris", "Alex", "Ivan", "George", "Stas"};
        String[] surname = new String[]{"Sidorov", "Sunnikov", "Petrenko", "Adamov", "Fedorov"};
        int n = (int) (Math.random() * name.length);
        int s = (int) (Math.random() * surname.length);
        students.name = name[n];
        students.surname = surname[s];
        return students;
    }


    void Show() {
        System.out.printf("%8s %10s",getName(), getSurname() + "\n");
    }

}