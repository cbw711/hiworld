package com.cbw.javase.day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        System.out.println("服务器等待接收信息： ");
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("数据是： " + data);

        OutputStream os = s.getOutputStream();
        os.write("数据已经收到了".getBytes());

//        s.close();
        ss.close();
    }
}
