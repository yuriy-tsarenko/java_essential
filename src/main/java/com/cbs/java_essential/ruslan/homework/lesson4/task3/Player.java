package com.cbs.java_essential.ruslan.homework.lesson4.task3;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework4 task3
 */
public class Player implements Playable, Recodable {

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

}
