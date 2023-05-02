package org.pattern.singleton;

public class Singleton {

    // работает для одного потока
    private static Singleton instance;

    // Конструктор помечается как private, а для создания нового объекта Singleton использует специальный
    // метод getInstance(). Он либо создаёт объект, либо отдаёт существующий объект, если он уже был создан
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println(this);
    }

    public void stop() {
        System.out.println("stop");
    }

}
