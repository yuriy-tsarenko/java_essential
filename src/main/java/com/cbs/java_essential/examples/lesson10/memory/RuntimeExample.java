package com.cbs.java_essential.examples.lesson10.memory;

import java.util.ArrayList;
import java.util.List;

public class RuntimeExample {
    public static void main(String[] args) {
        Reader reader = new Reader();
        List<byte[]> list = new ArrayList<>();
        System.out.println("i \t Free Memory \t Total Memory \t Max Memory");
        for (int i = 0; i < 1000; i++) {
            list.add(reader.readFile());
            System.out.println(i + " \t " + Runtime.getRuntime().freeMemory()
                    + " \t \t " + Runtime.getRuntime().totalMemory()
                    + " \t \t " + Runtime.getRuntime().maxMemory());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("total generated file number is: " + list.size());
    }
}
