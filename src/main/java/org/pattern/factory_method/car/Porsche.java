package org.pattern.factory_method.car;

public class Porsche implements Car{

    @Override
    public void drive() {
        System.out.println("PORSCHE Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("PORSCHE Stopped at 1 sec");
    }

}
