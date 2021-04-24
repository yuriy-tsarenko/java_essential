package com.cbs.java_essential.dikalo.homework.lesson1.computer;

public class Computer {
    String computer;

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        for (int i = 0; i < computer.length; i++) {
            computer[i].computer = "computer " + (i + 1);
            System.out.println(computer[i].computer);
        }

    }

}
