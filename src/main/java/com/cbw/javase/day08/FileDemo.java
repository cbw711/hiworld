package com.cbw.javase.day08;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File("file.txt");
//        System.out.println(File.separator);
//        System.out.println(f.getCanonicalPath());
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getPath());
//        System.out.println(f.getName());
//        System.out.println(f.getParentFile());
//        System.out.println(f.isDirectory());
//        System.out.println(f.isFile());
////        File f1 = new File("abc.txt");
////        f1.mkdir();
////        System.out.println(f1.exists());
//        new File("ddd/abcccc").mkdirs();
//        File f2 = new File("ddd/abcccc/s.txt");
//        System.out.println(f2.exists());
//        f2.createNewFile();
        File f = File.createTempFile("tmp-", ".txt");
        f.deleteOnExit();
        System.out.println(f.isFile());
        System.out.println(f.getAbsolutePath());

    }
}
