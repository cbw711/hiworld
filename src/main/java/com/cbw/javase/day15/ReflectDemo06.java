package com.cbw.javase.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo06 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.cbw.javase.day15.Student");

        Method[] methods = c.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println(methods.length);

        Method[] methods2 = c.getDeclaredMethods();
        for(Method m : methods2){
            System.out.println(m);
        }
        System.out.println(methods2.length);
        Method m1 = c.getMethod("method1");
        Constructor constructor = c.getConstructor();
        Object obj = constructor.newInstance();
        m1.invoke(obj);
    }
}
