package com.cbs.java_essential.examples.lesson3.ex012_final_methods;

class Main {
    static void main() {
        ClassA instanceA = new ClassA();
        instanceA.method1();
        instanceA.method2();

        System.out.println("-------------------");

        ClassB instanceB = new ClassB();
        instanceB.method1();
        instanceB.method2();

        System.out.println("-------------------");

        ClassC instanceC = new ClassC();
        instanceC.method1();
        instanceC.method2();
    }
}
