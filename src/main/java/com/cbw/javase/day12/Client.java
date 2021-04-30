package com.cbw.javase.day12;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            System.out.println(socket);
            OutputStream ops = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(ops);
            Scanner sc = new Scanner(System.in);

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(true){
                if(dis.readUTF()!= null){
                System.out.println(dis.readUTF());}
                dos.writeUTF("客户端说： " + sc.nextLine());
                if ("abc".equals(sc.nextLine())){
                    break;
                }
            }

            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
