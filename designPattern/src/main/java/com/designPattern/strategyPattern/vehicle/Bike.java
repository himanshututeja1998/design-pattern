package com.designPattern.strategyPattern.vehicle;

import com.designPattern.strategyPattern.colorStrategy.Color;
import com.designPattern.strategyPattern.colorStrategy.RedColor;
import com.designPattern.strategyPattern.wheelerStrategy.TwoWheeler;
import com.designPattern.strategyPattern.wheelerStrategy.Wheeler;

public class Bike implements Vehicle {

    final Color color = new RedColor();

    final Wheeler wheel = new TwoWheeler();

    @Override
    public void display() {
        System.out.println("Bike, Color : %s Wheel : %s".formatted(color.getColor(), wheel.getWheel()));
    }
}
