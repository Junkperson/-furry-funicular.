package com.junkperpen.fly.pattern.factory;

public class BFactory implements AbstractFactory{


    @Override
    public Food getFood() {
        return new B();
    }
}

