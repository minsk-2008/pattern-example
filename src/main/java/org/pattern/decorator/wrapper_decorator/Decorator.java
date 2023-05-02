package org.pattern.decorator.wrapper_decorator;


import org.pattern.decorator.objects.Component;

// или использовать интерфейс вместо абстрактного класса
public abstract class Decorator implements Component {

    // добавляем внешний вид
    protected Component component;

    protected Decorator (Component component) {
        this.component = component;
    }

    public abstract void afterDraw();


    @Override
    public void draw() {
        component.draw();  // отрисовываем исходный компонент
        afterDraw();       // добавляем новый функционал за счет Декоратора
    }
    
}
