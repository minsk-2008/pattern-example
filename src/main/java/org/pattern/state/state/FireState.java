package org.pattern.state.state;

public class FireState implements TransformerState {

    // состояние стрельба
    @Override
    public void action() {
        System.out.println("State fire!!!");
    }

}
