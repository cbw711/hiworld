package com.cbw.javase.day08;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
//        f1();
        f2();
    }

    private static void f2() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aaa.txt"));
            Object o = ois.readObject();
            System.out.println(o);
            Employee o1 = (Employee) o;
            System.out.println(((Employee) o).name);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void f1() {
        Employee e = new Employee();
        e.name = "zhangsan";
        e.address = "beiqinglu";
        e.age = 10;
        try {
            FileOutputStream fileOut = new FileOutputStream("aaa.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
