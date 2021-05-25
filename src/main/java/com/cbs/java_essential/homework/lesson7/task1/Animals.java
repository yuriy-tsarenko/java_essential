//Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное значение
//(возраст животного), и содержать перегруженный метод toString(), который должен возвращать название экземпляра и
//возраст животного.

package com.cbs.java_essential.homework.lesson7.task1;

public enum Animals {
    Horse(9), Cow(7), Dog(5), Cat(3);
    private final int year;
        Animals(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name() + ": year - " + year;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Animals.Horse.toString());
        System.out.println(Animals.Cow.toString());
        System.out.println(Animals.Dog.toString());
        System.out.println(Animals.Cat.toString());
    }
}