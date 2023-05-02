package org.pattern.factory_method;

import org.pattern.factory_method.car.Car;
import org.pattern.factory_method.car.JeepWithTrailer;

public class Start {

    public static void main(String[] args) {

        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadTypeSelection.CITY);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadTypeSelection.OFF_ROAD);
        car.drive();
        car.stop();


        car = carSelector.getCar(RoadTypeSelection.OUT_OFF_CITY);
        car.drive();
        car.stop();

        JeepWithTrailer jeepWithTrailer = new JeepWithTrailer();
        jeepWithTrailer.newFunction();

    }

}
