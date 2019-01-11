package com.junkperpen.fly.pattern.abstractfactory;


import com.junkperpen.fly.pattern.factory.AFood;
import com.junkperpen.fly.pattern.factory.Food;

public class  AFactory implements AbstractFactory {


    @Override
    public Food getFood() {
        return new AFood();
    }

}

