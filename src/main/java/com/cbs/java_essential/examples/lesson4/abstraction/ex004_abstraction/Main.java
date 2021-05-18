package com.cbs.java_essential.examples.lesson4.abstraction.ex004_abstraction;

public class Main {
    public static void main(String[] args) {
        AbstractBaseClass instance = new ConcreteDerivedClass();

        instance.simpleMethod();
        instance.overriddenMethod();
        instance.abstractMethod();
    }
}
