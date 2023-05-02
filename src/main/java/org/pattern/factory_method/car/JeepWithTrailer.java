package org.pattern.factory_method.car;

public class JeepWithTrailer extends Jeep {

    public void newFunction() {
        System.out.println("JEEP with trailer, hase new function");
    }

    @Override
    public void drive() {
        System.out.println("JEEP with trailer DRIVE");
    }

    @Override
    public void stop() {
        System.out.println("JEEP with trailer STOP");
    }
}
