package org.pattern.singleton;

public class Start {

    public static void main(String[] args) {

        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();

        Singleton.getInstance().stop();

    }
}
