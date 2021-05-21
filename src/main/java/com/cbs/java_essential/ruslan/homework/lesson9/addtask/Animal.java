package com.cbs.java_essential.ruslan.homework.lesson9.addtask;

import java.util.Objects;

/*
Создать класс Animal с именем String, возрастом int, хвостом Boolean.
В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
В классе Animal переопределить методы equals & hashCode.
 */


public class Animal {

    private String petName;
    private int petAge;
    private boolean tail;

    Animal(String petName, int petAge, boolean tail) {
        this.petName = petName;
        this.petAge = petAge;
        this.tail = tail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(petName, petAge, tail);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return Objects.equals(petName, animal.petName) &&
                Objects.equals(petAge, animal.petAge) &&
                Objects.equals(tail, animal.tail);
    }

    @Override
    public String toString() {
        return "  Имя: "
                + this.petName + ", возраст: "
                + this.petAge + ", хвост: "
                + conversion(this.tail)
                + " \n ";
    }

    private static String conversion(boolean bool)
    {
        if(bool) return "да";
        else return "нет";
    }
}