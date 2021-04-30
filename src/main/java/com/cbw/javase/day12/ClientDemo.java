package com.cbw.javase.day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        System.out.println("客户端开始写：");
        OutputStream ops = socket.getOutputStream();
        ops.write("hello world!".getBytes());

        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端：" + data);

        socket.close();
    }
}
