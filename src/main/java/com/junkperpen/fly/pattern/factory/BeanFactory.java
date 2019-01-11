package com.junkperpen.fly.pattern.factory;

public class BeanFactory {

    public static Food getA(){
        return new A();
    }
    public static Food getB(){
        return new B();
    }
    public static Food getC(){
        return new C();
    }

    public Food getFood(String food){
        if("A".equals(food)){
            return getA();
        }else if("B".equals(food)){
            return getB();
        }else if("C".equals(food)){
            return getC();
        }
        return null;

    }


}

