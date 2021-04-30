package com.cbw.javase.day15;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader scl = ClassLoader.getSystemClassLoader();
        System.out.println(scl);
        ClassLoader c2 = scl.getParent();
        System.out.println(c2);
        ClassLoader c3 = c2.getParent();
        System.out.println(c3);
    }
}
