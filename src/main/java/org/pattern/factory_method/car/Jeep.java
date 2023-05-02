package org.pattern.factory_method.car;

public class Jeep implements Car{

    @Override
    public void drive() {
        System.out.println("Jeep drive speed 100 km/h");
    } 
    
    @Override
    public void stop() {
        System.out.println("Jeep Stopped at 5 sec");
    }

}
