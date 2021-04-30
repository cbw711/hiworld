package com.cbw.javase.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("com.cbw.javase.day15.Student");
        Field[] df = cls.getDeclaredFields();
        for(Field f : df){
            System.out.println(f);
        }
        System.out.println("========");
        Field[] df2 = cls.getFields();
        for(Field f : df2){
            System.out.println(f);
        }

        Field address = cls.getField("address");
        Constructor c = cls.getConstructor();
        Object o = c.newInstance();

        address.set(o, "山西太原");

        System.out.println(o);
    }
}
