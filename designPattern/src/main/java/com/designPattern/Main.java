package com.designPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designPattern.strategyPattern.vehicle.Bike;
import com.designPattern.strategyPattern.vehicle.Car;

@SpringBootApplication
public class Main { 
    public static void run() {
        Car car = new Car();
        car.display();
        
        Bike bike = new Bike();
        bike.display();
    }
}
