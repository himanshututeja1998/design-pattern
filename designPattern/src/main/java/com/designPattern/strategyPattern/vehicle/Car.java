package com.designPattern.strategyPattern.vehicle;

import com.designPattern.strategyPattern.colorStrategy.BlueColor;
import com.designPattern.strategyPattern.colorStrategy.Color;
import com.designPattern.strategyPattern.wheelerStrategy.FourWheeler;
import com.designPattern.strategyPattern.wheelerStrategy.Wheeler;

public class Car implements Vehicle {

    final Color color = new BlueColor();

    final Wheeler wheel = new FourWheeler();

    @Override
    public void display() {
        String message = String.format("Car, Color: %s Wheel: %s", color.getColor(), wheel.getWheel());
        System.out.println(message);
    }
}
