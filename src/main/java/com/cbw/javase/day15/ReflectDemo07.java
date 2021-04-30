package com.cbw.javase.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo07 {
    public static void main(String[] args) throws Exception{
        //创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        array.add(20);
//        array.add("hello");

        Class<? extends ArrayList> c = array.getClass();
        Method add = c.getMethod("add", Object.class);
        add.setAccessible(true);
        add.invoke(array,"hello");

        System.out.println(array);
    }
}
