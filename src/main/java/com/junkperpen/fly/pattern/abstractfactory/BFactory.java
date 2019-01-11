package com.junkperpen.fly.pattern.abstractfactory;

public class BFactory implements AbstractFactory {


    @Override
    public Food getFood() {
        return new BFood();
    }
}

