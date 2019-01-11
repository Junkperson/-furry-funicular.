package com.junkperpen.fly.pattern.factory;


public class Test {

    public static void main(String[] args) {
        Food food = null;

        String str ="B";
        if("A".equals(str)){
            food= BeanFactory.getA();
        }else if("B".equals(str)){
            food= BeanFactory.getB();
        }
        System.out.println(food);



    }
}
