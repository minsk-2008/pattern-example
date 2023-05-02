package org.pattern.abstract_factory.transport.aircraft;


public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("Boeing747 flight");
    }
    
}
