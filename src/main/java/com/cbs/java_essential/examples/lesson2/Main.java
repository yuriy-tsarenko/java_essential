package com.cbs.java_essential.examples.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            int id = i + 1;
            computers[i] = new Computer(id, "Asus HWR-" + id);
        }

        System.out.println(Arrays.toString(computers));
    }
}