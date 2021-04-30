package com.cbw.javase.day15;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("com.cbw.javase.day15.Student");
        Constructor<?> declaredConstructors = cls.getDeclaredConstructor(String.class);
        declaredConstructors.setAccessible(true);
        Object obj = declaredConstructors.newInstance("this");
        System.out.println(obj);
    }
}
