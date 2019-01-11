package com.junkperpen.fly.pattern.factory;



public class Test {

    public static void main(String[] args) {
        Food food = new BeanFactory().getB();
        System.out.println(food);
        Food A=new AFactory().getFood();
        System.out.println(A);

    }
}
