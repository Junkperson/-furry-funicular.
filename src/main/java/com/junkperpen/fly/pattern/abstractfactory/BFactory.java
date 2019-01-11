package com.junkperpen.fly.pattern.abstractfactory;


import com.junkperpen.fly.pattern.factory.BFood;
import com.junkperpen.fly.pattern.factory.Food;

public class BFactory implements AbstractFactory {


    @Override
    public Food getFood() {
        return new BFood();
    }
}

