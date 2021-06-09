package com.cbs.java_essential.return13.homework.lesson3;

//        Задание 2
//       Используя IntelliJ IDEA, создайте проект.
//       Требуется: Создать класс, представляющий учебный класс ClassRoom.
//       Создайте класс ученик Pupil.
//       В теле класса создайте методы void study(), void read(), void write(), void relax().
//       Создайте 3 производных класса ExcelentPupil, GoodPupil,
//       BadPupil от класса базового класса Pupil и переопределите каждый из методов,
//       в зависимости от успеваемости ученика.
//       Конструктор класса ClassRoom принимает аргументы типа Pupil,
//       класс должен состоять из 4 учеников. Предусмотрите возможность того,
//       что пользователь может передать 2 или 3 аргумента.
//       Выведите информацию о том,
//       как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.

class ClassRoom {
    ClassRoom(Pupil pupil) {
        pupil.write();
        pupil.study();
        pupil.read();
        pupil.relax();
    }
}

class Main32 {
    public static void main(String[] args) {
        ClassRoom pupil = new ClassRoom(new ExcellentPupil());
        ClassRoom pupil2 = new ClassRoom(new GoodPupil());
        ClassRoom pupil3 = new ClassRoom(new BadPupil());
        ClassRoom pupil4 = new ClassRoom(new Pupil());


    }
}

class Pupil {


    void study() {
        System.out.println("pupil is study");
    }

    void read() {
        System.out.println("pupil is reading");
    }

    void write() {
        System.out.println("pupil is writing");
        System.out.println("___________________________________________________________");
    }

    void relax() {
        System.out.println("pupil is relax");

    }
}

class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("ExcellentPupil is study");
    }

    @Override
    void read() {
        System.out.println("ExcellentPupil is reading");
    }

    @Override
    void write() {
        System.out.println("ExcellentPupil is writing");
        System.out.println("___________________________________________________________________");
    }

    @Override
    void relax() {
        System.out.println("ExcellentPupil is not relax");
    }

}

class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("goodPupil is study");
    }

    @Override
    void read() {
        System.out.println("goodPupil is not reading");
    }

    @Override
    void write() {
        System.out.println("goodPupil is not writing");
        System.out.println("___________________________________________________________________");
    }

    @Override
    void relax() {
        System.out.println("goodPupil is not relax");
    }

}

class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("badPupil is not study");
    }

    @Override
    void read() {
        System.out.println("badPupil is not reading");
    }

    @Override
    void write() {
        System.out.println("badPupil is not writing");
        System.out.println("___________________________________________________________________");
    }

    @Override
    void relax() {
        System.out.println("badPupil  is  relax");
    }
}
