package com.cbw.javase.day01;

public class LiXiaoGang extends LiGang{
    public LiXiaoGang() {
        System.out.println("子类构造方法被访问");
    }
    static {
        System.out.println("子类静态代码块被访问");
    }
    {
        System.out.println("父类的构造代码块执行了");
    }
    int age = 18;

    String name = "李小刚";
    public void show() {
        // 访问父类中的name，
        System.out.println("我爸是"+super.getName());
        // 继承而来，所以直接访问。
        // 访问子类中的name2
        System.out.println("我是"+this.name);
    }
}
