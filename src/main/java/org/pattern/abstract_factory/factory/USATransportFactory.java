package org.pattern.abstract_factory.factory;


import org.pattern.abstract_factory.transport.aircraft.Aircraft;
import org.pattern.abstract_factory.transport.aircraft.Boeing747;
import org.pattern.abstract_factory.transport.car.Car;
import org.pattern.abstract_factory.transport.car.Ford;

// Создание конктретно американских транспортных средств
public class USATransportFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
