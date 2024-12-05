package com.builder.pseudocode;

import com.builder.pseudocode.builders.CarBuilder;
import com.builder.pseudocode.builders.CarManualBuilder;
import com.builder.pseudocode.cars.Car;
import com.builder.pseudocode.cars.Manual;
import com.builder.pseudocode.director.Director;

public class BuilderApp {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built: " + carManual.print());
    }
}
