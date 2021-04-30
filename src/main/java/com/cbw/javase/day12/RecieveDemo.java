package com.cbw.javase.day12;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class RecieveDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(10086);
            while (true){
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
                datagramSocket.receive(datagramPacket);
                System.out.println("数据是：" + new String(datagramPacket.getData(),0,datagramPacket.getLength()
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
