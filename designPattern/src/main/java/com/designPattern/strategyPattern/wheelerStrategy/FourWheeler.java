package com.designPattern.strategyPattern.wheelerStrategy;

public class FourWheeler implements Wheeler {
    String wheel = "Four Wheeler";

    @Override
    public String getWheel() {
        return wheel;
    }

    @Override
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
}
