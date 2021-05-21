package com.cbs.java_essential.ruslan.homework.lesson9.addtask;

/*
Создать класс Animal с именем String, возрастом int, хвостом Boolean.
В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
В классе Animal переопределить методы equals & hashCode.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion", 9, true);
        Animal cat = new Animal("Cat", 2, true);
        Animal snail = new Animal("Snail", 1, false);
        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(cat);
        animals.add(snail);

            System.out.println(animals);
        }
    }

