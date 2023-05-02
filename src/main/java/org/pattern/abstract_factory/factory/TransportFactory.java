package org.pattern.abstract_factory.factory;


import org.pattern.abstract_factory.transport.aircraft.Aircraft;
import org.pattern.abstract_factory.transport.car.Car;

// фабрика по созданию семейства транспортных средств
public interface TransportFactory {

    // фабрика будет производить то, что укажем
    Car createCar();// автомобили, знает только интерфейс, а конктретный автомобиль в имплементации

    Aircraft createAircraft(); // самолеты

}
