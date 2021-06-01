//Требуется: Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы измерения
//(к примеру, из метров в километры, из километров в мили, и так далее).

package com.cbs.java_essential.dikalo.homework.lesson6.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Distance.distance = new Scanner(System.in).nextDouble();
        Distance.Converter conv = new Distance.Converter();
        System.out.println(conv.convertKilometersToMeters(Distance.distance));
        System.out.println(conv.convertKilometersToMiles(Distance.distance));
        System.out.println(conv.convertMetersToKilometers(Distance.distance));
        System.out.println(conv.convertMilesToKilometers(Distance.distance));

    }
}
