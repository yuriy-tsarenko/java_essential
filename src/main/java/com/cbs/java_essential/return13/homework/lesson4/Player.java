package com.cbs.java_essential.return13.homework.lesson4;

//        Задание 3
//        Создайте 2 интерфейса Playable и Recodable.
//        В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//        Создайте производный класс Player от базовых интерфейсов Playable и Recodable. Написать программу, которая выполняет проигрывание и запись.


interface Playable {
    void play();

    void pause();

    void stop();

}

interface Recordable {
    void record();

    void pause();

    void stop();
}

public class Player implements Playable, Recordable {


    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void record() {
        System.out.println("record");
    }

    @Override
    public void pause() {
        System.out.println("pause");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    public static void main(String[] args) {
        Player player = new Player();
        player.pause();
        player.play();
        player.stop();
        player.record();
    }
}


