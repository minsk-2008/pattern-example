package org.pattern.abstract_factory.transport.car;

public class Ford implements Car {

    @Override
    public void drive() {
        System.out.println("Ford drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Ford stopped at 1 sec");
    }

}
