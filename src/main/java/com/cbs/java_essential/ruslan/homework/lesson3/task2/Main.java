package com.cbs.java_essential.ruslan.homework.lesson3.task2;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 3 task2
 * Задание 2
 * Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс, представляющий учебный класс ClassRoom.
 * Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
 * Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil
 * и переопределите каждый из методов, в зависимости от успеваемости ученика. Конструктор класса ClassRoom
 * принимает аргументы типа Pupil, класс должен состоять из 4 учеников. Предусмотрите возможность того,
 * что пользователь может передать 2 или 3 аргумента. Выведите информацию о том, как все ученики экземпляра класса
 * ClassRoom умеют учиться, читать, писать, отдыхать.
 */

public class Main {

    public static void main(String[] args) {

        ClassRoom[] students = new ClassRoom[4];
        for (int i = 0; i < students.length; i++) {
            students[i] = ClassRoom.randomStudent();
        }
        ClassRoom student1 = (new ClassRoom(ClassRoom.randomStudent().name,
                ClassRoom.randomStudent().surname));
        ClassRoom student2 = (new ClassRoom(ClassRoom.randomStudent().name,
                ClassRoom.randomStudent().surname));
        ClassRoom student3 = (new ClassRoom(ClassRoom.randomStudent().name,
                ClassRoom.randomStudent().surname));
        ClassRoom student4 = (new ClassRoom(ClassRoom.randomStudent().name,
                ClassRoom.randomStudent().surname));

        GoodPupil goodPupil = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();
        BadPupil badPupil = new BadPupil();

        student1.indicate();
        goodPupil.read();
        excelentPupil.write();
        excelentPupil.study();
        badPupil.relax();

        student2.indicate();
        excelentPupil.read();
        goodPupil.write();
        goodPupil.study();
        badPupil.relax();

        student3.indicate();
        badPupil.study();
        badPupil.read();
        badPupil.write();
        excelentPupil.relax();

        student4.indicate();
        goodPupil.study();
        excelentPupil.read();
        excelentPupil.write();
        goodPupil.relax();

    }
}






