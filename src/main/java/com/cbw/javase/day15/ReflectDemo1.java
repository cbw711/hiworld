package com.cbw.javase.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception{
//        f1();
        f2();

    }

    private static void f2() throws Exception {
        Class<Person> c1 = Person.class;
        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
        System.out.println("========");
        Constructor<?> cs = c1.getConstructor();
        Object person = cs.newInstance();
        System.out.println(person);
    }

    private static void f1() throws Exception{
        Class<Person> c1 = Person.class;
        Person p = new Person();
        Class<? extends Person> c2 = p.getClass();
        Class<?> c3 = Class.forName("com.cbw.javase.day15.Person");
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c2==c3);
        System.out.println(c1==Person.class);
    }
    /*

     */
}
