package com.cbw.javase.day01;

public class BaseOne {
    public BaseOne() {
        System.out.println("BaseOne构造器");
    }

    {
        System.out.println("BaseOne初始化块");
        System.out.println();
    }

    static {
        System.out.println("BaseOne静态初始块");
    }
}
