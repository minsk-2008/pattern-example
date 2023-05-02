package org.pattern.facade;


import org.pattern.facade.facade.CarFacade;
import org.pattern.facade.parts_car.Door;
import org.pattern.facade.parts_car.Ignition;
import org.pattern.facade.parts_car.Wheel;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Ignition ignition = new Ignition();
        ignition.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        System.out.println("---------");

        // вызов с фасадом, упрощаем в одно действие
        CarFacade carFacade = new CarFacade();
        carFacade.go();


    }
}
