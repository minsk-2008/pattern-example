package org.pattern.state;

import org.pattern.state.context.TransformerContext;
import org.pattern.state.state.FireState;
import org.pattern.state.state.MoveState;
import org.pattern.state.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        // Создаем контекст
        TransformerContext context = new TransformerContext();

        // создаем два состояния
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        // передаем в контекст текущее состояние
        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
