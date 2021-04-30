package com.cbw.javase.day08;

import java.io.*;

public class FileDiguiDemo {
    public static String pathname = "/Users/brandonchan/IdeaProjects/hiworld/abc/bcd/test.txt";
//    public static String pathname = "/Users/brandonchan/IdeaProjects/hiworld/abc";

    public static void main(String[] args) {
        //实验 File 类
//        f1();
        // 递归遍历文件夹
//        f2(new File(pathname));
        // FileInputStream 应用
//        f3();
        //输出流
//        f4();
        // 字符输入流
//        f5();
        // 字符输出流
//        f6();
        f7();
    }

    private static void f7() {
//        try (FileWriter fw = new FileWriter("abc.txt")) {
//            fw.write("i'm back.../n",0,"i'm back.../n".length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        /*
            没有关闭fw.close()。
            不关闭流，数据只保存在缓存区，并未保存到文件
         */
        try {
            FileWriter fw = new FileWriter("abcd.txt");
            FileReader fr = new FileReader("abc.txt");
            int len;
            while ((len=fr.read())!=-1){
                fw.write(len);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void f6() {
        try (FileWriter fw = new FileWriter(new File(pathname))) {
            fw.write("i'm back.../n",0,"i'm back.../n".length());
            fw.write('b');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void f5() {
        try (FileReader fr = new FileReader(new File(pathname))) {
            int b;
            while ((b=fr.read()) != -1){
                System.out.println((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void f4() {
        try (FileOutputStream fos = new FileOutputStream(new File(pathname))) {
            fos.write("hello java".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void f3() {
        try (FileInputStream fis = new FileInputStream(new File(pathname))) {
//            int i;
//
//            while ((i=fis.read())!=-1){
//                System.out.println((char)i);
//            }
            byte[] bytes = new byte[1024];
            int len;
            while ((len=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        递归来list 文件夹下的文件
     */
    private static void f2(File file) {
        File[] list = file.listFiles();
        if (list != null){
            for (File f : list){
                if (f.isDirectory()){
                    System.out.println(f.getName());
                    f2(f);
                }else{
                    System.out.println(f.getName());
                }
            }
        }
    }

    /*
        实现 File 类
     */
    private static void f1() {
        File f = new File(pathname);
        System.out.println("File 对象是 ： " + f);
        String separator = File.separator;
        System.out.println("本机的分隔符 ： " + separator);
        System.out.println("是否是文件：" + f.isFile());
        System.out.println("是否是文件夹：" + f.isDirectory());
//        f.delete();
//        f.mkdirs();
//        f.mkdir();
//        f.exists();
//        f.list();
//        f.listFiles();
//        f.renameTo(new File("/Users/brandonchan/IdeaProjects/hiworld/abc/bcd/test.txt"));
        String[] list = f.list(); // bcd nnn  agd有子文件没有取出
        for (String s : list){
            System.out.println(s);
        }
        File[] files = f.listFiles();// bcd nnn  agd有子文件没有取出
        for(File fi : files){
            System.out.println(fi.getName());
        }
    }


}
