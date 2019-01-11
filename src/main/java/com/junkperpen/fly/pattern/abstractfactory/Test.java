package com.junkperpen.fly.pattern.abstractfactory;


import com.junkperpen.fly.pattern.factory.BeanFactory;
import com.junkperpen.fly.pattern.factory.Food;

public class Test {

    public static void main(String[] args) {
        Food food = null;

        String str ="B";
        if("A".equals(str)){
            food= new AFactory().getFood();
        }else if("B".equals(str)){
            food=new BFactory().getFood();
        }
        System.out.println(food);



    }
}
