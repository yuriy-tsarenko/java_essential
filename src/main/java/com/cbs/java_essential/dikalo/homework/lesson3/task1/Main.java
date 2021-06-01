//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс, представляющий учебный класс ClassRoom.
//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите
//каждый из методов, в зависимости от успеваемости ученика. Конструктор класса ClassRoom принимает аргументы
//типа Pupil, класс должен состоять из 4 учеников. Предусмотрите возможность того, что пользователь может передать
//2 или 3 аргумента. Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать,
//писать, отдыхать.

package com.cbs.java_essential.dikalo.homework.lesson3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pupilsNumber = new Scanner(System.in).nextInt();
        Classroom[] classroom = new Classroom[pupilsNumber];

        if (pupilsNumber > 0 && pupilsNumber <= 4) {
            for (int i = 0; i < pupilsNumber; i++) {
                switch (i) {
                    case 0:
                        classroom[0] = new Classroom(new ExcellentPupil());
                        break;
                    case 1:
                        classroom[1] = new Classroom(new GoodPupil());
                        break;
                    case 2:
                        classroom[2] = new Classroom(new GoodPupil());
                        break;
                    case 3:
                        classroom[3] = new Classroom(new BadPupil());
                        break;
                    default:
                        System.exit(-1);
                }
            }
        } else {
            System.out.println("invalid number of students");
        }
    }
}