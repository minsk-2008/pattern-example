package org.pattern.abstract_factory.factory;


import org.pattern.abstract_factory.transport.aircraft.Aircraft;
import org.pattern.abstract_factory.transport.aircraft.TU134;
import org.pattern.abstract_factory.transport.car.Car;
import org.pattern.abstract_factory.transport.car.Niva;

// Создание конктретно российских транспортных средств
public class RussianTransportFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
