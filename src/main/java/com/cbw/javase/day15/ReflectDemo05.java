package com.cbw.javase.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo05 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.cbw.javase.day15.Student");
        //Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        //s.name = "林青霞";
//        Field nameField = c.getField("name"); //NoSuchFieldException: name
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "林青霞");
        System.out.println(obj);

        //s.age = 30;
        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,30);
        System.out.println(obj);

        //s.address = "西安";
        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj,"西安");
        System.out.println(obj);
    }
}
