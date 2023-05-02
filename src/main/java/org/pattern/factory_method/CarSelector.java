package org.pattern.factory_method;

import org.pattern.factory_method.car.Car;
import org.pattern.factory_method.car.Jeep;
import org.pattern.factory_method.car.JeepWithTrailer;
import org.pattern.factory_method.car.Porsche;

// фабрика по созданию автомобилей
public class CarSelector {

    // фабричный метод, который создает нужный автомобиль
    public Car getCar(RoadTypeSelection roadType) {
        return switch (roadType) {
            case CITY -> new Porsche();
            case OFF_ROAD -> new Jeep();
            case OUT_OFF_CITY -> new JeepWithTrailer();
        };
    }
}
