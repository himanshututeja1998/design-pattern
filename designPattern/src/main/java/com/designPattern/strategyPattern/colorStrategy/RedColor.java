package com.designPattern.strategyPattern.colorStrategy;

public class RedColor implements Color {
    
    String color = "red";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(final String color) {
        this.color = color;
    }
}
