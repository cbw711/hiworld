package com.cbw.javase.day08;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
//        propertiesSetGet();
//        loadPro();
        f1();
    }

    private static void f1() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("properties.txt"));
        PrintWriter pw = new PrintWriter("aaa.txt");
        String line;
        while ((line=bufferedReader.readLine())!=null){
            pw.write(line);
            pw.write("/r/n");
        }
        bufferedReader.close();
        pw.close();
    }

    private static void loadPro() throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("properties.txt"));
        Set<String> strings = pro.stringPropertyNames();
        for(String s : strings){
            System.out.println(s + " -- " + pro.getProperty(s));
        }
    }

    private static void propertiesSetGet() {
        Properties pro = new Properties();
        pro.setProperty("username","jack");
        pro.setProperty("age","24");
        pro.setProperty("sex","man");
        System.out.println(pro);

        System.out.println(pro.getProperty("username"));
        System.out.println(pro.getProperty("age"));
        System.out.println(pro.getProperty("sex"));

        Set<String> strings = pro.stringPropertyNames();
        for(String s : strings){
            System.out.println(s + " -- " + pro.getProperty(s));
        }
    }
}
