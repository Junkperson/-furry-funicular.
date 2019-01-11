package com.junkperpen.fly.pattern.factory;

public class  AFactory implements AbstractFactory{


    @Override
    public Food getFood() {
        return new A();
    }

}

