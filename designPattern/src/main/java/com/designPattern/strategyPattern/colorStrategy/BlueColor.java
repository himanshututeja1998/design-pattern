package com.designPattern.strategyPattern.colorStrategy;

public class BlueColor implements Color {
    
    String color = "blue";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(final String color) {
        this.color = color;
    }
}