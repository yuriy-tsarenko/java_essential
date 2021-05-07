package com.cbs.java_essential.ruslan.homework.lesson4.task3;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework4 task3
 * Создайте 2 интерфейса Playable и Recodable.
 * В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause()
 * / void stop() соответственно. Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
 * Написать программу, которая выполняет проигрывание и запись.
 */

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        System.out.println("Команды воспроизведения: ");
        player.play();
        player.pause();
        player.stop();
        System.out.println("Команды записи: ");
        player.record();
        player.pause();
        player.stop();


    }
}

