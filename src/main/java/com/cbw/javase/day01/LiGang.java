package com.cbw.javase.day01;

public class LiGang {
    public LiGang() {
        System.out.println("父类构造方法被访问");
    }
    static {
        System.out.println("父类静态代码块被访问");
    }
    {
        System.out.println("子类构造代码块执行了");
    }

    private String name = "李刚";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("父类的run方法被调用");
    }
    int age = 48;
}
