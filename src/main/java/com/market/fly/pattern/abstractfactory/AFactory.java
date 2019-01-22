package com.market.fly.pattern.abstractfactory;


public class  AFactory implements AbstractFactory {


    @Override
    public Food getFood() {
        return new AFood();
    }

}

