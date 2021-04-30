package com.cbw.javase.day12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("监听在端口号：8888");
            Socket accept = ss.accept();
            System.out.println("有连接过来了。。。");
            InputStream ips = accept.getInputStream();
            DataInputStream dis = new DataInputStream(ips);

            OutputStream os = accept.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            Scanner sc = new Scanner(System.in);
            while (true){
                if(dis.readUTF()!= null){
                    System.out.println(dis.readUTF());}
                dos.writeUTF("服务器说：" + sc.nextLine());
                if(sc.nextLine().equals("abc")){
                    break;
                }
            }

            dis.close();
            accept.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
