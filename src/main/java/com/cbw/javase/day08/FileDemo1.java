package com.cbw.javase.day08;

import java.io.*;

public class FileDemo1 {
    public static void main(String[] args) throws Exception{
        File f = new File(".");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.getCanonicalPath());

        System.out.println(File.separator);
        boolean file = f.isFile();
        System.out.println(file);
        System.out.println(f.isDirectory());
    }
}
