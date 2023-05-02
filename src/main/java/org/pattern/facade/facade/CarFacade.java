package org.pattern.facade.facade;


import org.pattern.facade.parts_car.Door;
import org.pattern.facade.parts_car.Ignition;
import org.pattern.facade.parts_car.Wheel;

// фасад для работы
public class CarFacade {

    private final Door door = new Door();
    private final Ignition ignition = new Ignition();
    private final Wheel wheel = new Wheel();

    // объединяем несколько действий в одно
    public void go() {
        door.open();
        ignition.fire();
        wheel.turn();
    }

}
