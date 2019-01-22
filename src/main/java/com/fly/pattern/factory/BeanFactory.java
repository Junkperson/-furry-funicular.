package com.fly.pattern.factory;

public class BeanFactory {
    private Food food;

    public static Food getA(){
        return new AFood();
    }
    public static Food getB(){
        return new BFood();
    }




}

