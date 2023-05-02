package org.pattern.decorator.wrapper_decorator;


import org.pattern.decorator.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }

   
}
