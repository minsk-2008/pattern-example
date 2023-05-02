package org.pattern.state.state;

public class MoveState implements TransformerState {

    // состояние движения
    @Override
    public void action() {
        System.out.println("State move!!!");
    }
}
