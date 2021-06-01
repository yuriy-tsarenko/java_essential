package com.cbs.java_essential.examples.lesson4.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {

    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    public abstract void abstractMethod();
}
