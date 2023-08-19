package com.designPattern.strategyPattern.wheelerStrategy;

public class TwoWheeler implements Wheeler {

    String wheel = "Two Wheeler";

    @Override
    public String getWheel() {
        return wheel;
    }

    @Override
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
}
