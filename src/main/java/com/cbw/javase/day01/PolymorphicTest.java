package com.cbw.javase.day01;

public class PolymorphicTest {
    public static void main(String[] args) {
        Ye y = new Ye();
        Ye y2 = new Fu(); //向上
        Fu f = new Fu();
        Zi z = new Zi();
        Sun s = new Sun();


        System.out.println("第一题 " + y.show(f));     //Ye and Ye
        System.out.println("第二题 " + y.show(z));     //Ye and Ye
        System.out.println("第三题 " + y.show(s));     //Ye and Sun
        System.out.println("第四题 " + y2.show(f));    //Ye and Ye //Fu and Ye
        System.out.println("第五题 " + y2.show(z));    //Ye and Ye //Fu and Ye
        System.out.println("第六题 " + y2.show(s));    //Ye and Sun
        System.out.println("第七题 " + f.show(f));     //Fu and FU
        System.out.println("第八题 " + f.show(z));     //Fu and Fu
        System.out.println("第九题 " + f.show(s));     //Fu and Fu //Ye and Sun

    }
}
