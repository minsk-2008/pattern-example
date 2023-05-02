package org.pattern.abstract_factory;


import org.pattern.abstract_factory.factory.RussianTransportFactory;
import org.pattern.abstract_factory.factory.TransportFactory;
import org.pattern.abstract_factory.factory.USATransportFactory;

public class Start {

    private static final boolean EXPORTS_EXCEED_IMPORTS = true;

    public static void main(String[] args) {

        // в зависмости от условий будут использоваться разные реализации
        TransportFactory factory;
        if (EXPORTS_EXCEED_IMPORTS) {
            factory = new RussianTransportFactory();
        } else {
            factory = new USATransportFactory();
        }

        factory.createAircraft().flight();
        factory.createCar().drive();
        factory.createCar().stop();

    }

}
