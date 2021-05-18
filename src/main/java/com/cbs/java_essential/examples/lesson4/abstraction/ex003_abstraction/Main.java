package com.cbs.java_essential.examples.lesson4.abstraction.ex003_abstraction;

abstract class AbstractClassA {
    public abstract void operationA();
}


abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}


class ConcreteClass extends AbstractClassB {
    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");
    }

    @Override
    public void operationB() {
        System.out.println("ConcreteClass.operationB");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClass();
        AbstractClassB instance1 = (AbstractClassB) instance;
        instance1.operationA();
        instance1.operationB();
    }
}
