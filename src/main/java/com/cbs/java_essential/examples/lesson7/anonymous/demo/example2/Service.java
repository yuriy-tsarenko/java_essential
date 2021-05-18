package com.cbs.java_essential.examples.lesson7.anonymous.demo.example2;

import com.cbs.java_essential.examples.lesson7.anonymous.demo.example1.Vehicle;

public class Service {


    public String getResult() {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void runEngine() {
                //code
            }

            @Override
            public String createStatistic() {
                //code
                return null;
            }
        };

        return vehicle.createStatistic();
    }
}
