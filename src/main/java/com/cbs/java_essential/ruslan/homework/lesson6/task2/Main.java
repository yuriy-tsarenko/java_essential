package com.cbs.java_essential.ruslan.homework.lesson6.task2;
/**
 *  * By Ruslan svitliy@gmail.com
 *  * Homework 6 task2
 * Требуется: Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
 * которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
 */

public class Main {
    public static void main(String[] args) {

        Vehicle.Wheel insideVehicleWheel = new Vehicle.Wheel();
        Vehicle.Door insideVehicleDoor = new Vehicle.Door();

        insideVehicleWheel.print();
        insideVehicleDoor.print();
    }
}
