package com.cbs.java_essential.return13.homework.lesson7;

//Задание 2
// Создайте перечислительный тип (enum) Animals, содержащий конструктор,
// который должен принимать целочисленное значение (возраст животного),
// и содержать перегруженный метод toString(),
// который должен возвращать название экземпляра и возраст животного.


public enum Animals {
    ZUBR(15), DOG(5), CAT(3);
    private int year;

    Animals(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name() + ": year = " + year;
    }


}

class Main {
    public static void main(String[] args) {
        Animals animals = Animals.CAT;
        Animals animals1 = Animals.DOG;
        Animals animals2 = Animals.ZUBR;
        System.out.println(animals);
        System.out.println(animals1);
        System.out.println(animals2);
    }
}



