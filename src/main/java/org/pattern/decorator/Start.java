package org.pattern.decorator;


import org.pattern.decorator.objects.Button;
import org.pattern.decorator.objects.Component;
import org.pattern.decorator.objects.TextView;
import org.pattern.decorator.objects.Window;
import org.pattern.decorator.wrapper_decorator.BorderDecorator;
import org.pattern.decorator.wrapper_decorator.ColorDecorator;

public class Start {


    public static void main(String[] args) {

        // элементы графического редактора
        Component button;
        Component textView;
        Component window;

        boolean showBorder = true;

        if (!showBorder) {
            window = new Window();
            textView = new TextView();
            button = new Button();
        } else {
            window = new ColorDecorator(new BorderDecorator(new Window())); // вложенность и цвета и рамки
            textView = new BorderDecorator(new TextView()); // добавляем рамку
            button = new BorderDecorator(new Button());
        }

        window.draw();
        textView.draw();
        button.draw();

    }

}
