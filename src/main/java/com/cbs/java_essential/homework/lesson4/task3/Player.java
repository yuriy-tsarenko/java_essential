package com.cbs.java_essential.homework.lesson4.task3;
/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework4 task3
 * Создайте 2 интерфейса Playable и Recodable.
 * В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause()
 * / void stop() соответственно. Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
 * Написать программу, которая выполняет проигрывание и запись.
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
