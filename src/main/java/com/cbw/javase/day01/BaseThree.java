package com.cbw.javase.day01;

public class BaseThree extends BaseTwo {
    public BaseThree() {
        System.out.println("BaseThree构造器");
    }

    {
        System.out.println("BaseThree初始块");
    }

    static {
        System.out.println("BaseThree静态初始块");
    }
}
