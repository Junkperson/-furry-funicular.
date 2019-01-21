package com.junkperpen.fly.pattern.single;

public class LazyTwo {
    private static LazyTwo lazyTwo=null;
    private LazyTwo(){};
    public static synchronized LazyTwo getInstance(){
        if(lazyTwo==null){
            lazyTwo=new LazyTwo();
        }
        return lazyTwo;
    }
}
