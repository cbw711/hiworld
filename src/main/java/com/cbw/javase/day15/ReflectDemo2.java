package com.cbw.javase.day15;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.cbw.javase.day15.Student");
        Constructor<?> cs = cls.getConstructor(String.class, int.class, String.class);
        Object o = cs.newInstance("brandon", 13, "beijing");
        System.out.println(o);
    }
}
