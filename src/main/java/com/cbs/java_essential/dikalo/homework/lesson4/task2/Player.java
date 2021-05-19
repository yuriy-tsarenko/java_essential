package com.cbs.java_essential.dikalo.homework.lesson4.task2;

public class Player implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {
        System.out.println("pause");

    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void record() {
        System.out.println("record");
    }

    @Override
    public void change() {
        System.out.println("change");
    }

    @Override
    public void save() {
        System.out.println("save");
    }
}
