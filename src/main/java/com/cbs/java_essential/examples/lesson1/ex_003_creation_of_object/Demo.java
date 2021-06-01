package com.cbs.java_essential.examples.lesson1.ex_003_creation_of_object;

import com.cbs.java_essential.examples.lesson1.ex_002_access_modifiers.Car;

public class Demo extends com.cbs.java_essential.examples.lesson1.ex_002_access_modifiers.Car {

    public void someWork() {
        System.out.println(maxSpeed);
    }

    public static void main(String[] args) {
        com.cbs.java_essential.examples.lesson1.ex_002_access_modifiers.Car car = new Car();
    }
}
