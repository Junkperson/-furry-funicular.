package com.junkperpen.fly.pattern.factory;

public class CFactory implements FoodFactory{


    @Override
    public Food getFood() {
        return new C();
    }
}

