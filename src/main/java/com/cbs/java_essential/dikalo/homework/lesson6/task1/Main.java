//Создайте проект, используя IntelliJ IDEA. Требуется: Создать класс Vehicle с методом print. В классе Vehicle, создайте
//внутренний класс Wheel и Door, которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.

package com.cbs.java_essential.dikalo.homework.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel carWheel = new Vehicle().new Wheel();
        Vehicle.Door carDoor = new Vehicle().new Door();

        carWheel.print();
        carDoor.print();
    }
}
