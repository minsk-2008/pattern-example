package org.pattern.strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
