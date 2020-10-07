package com.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcpDemo02 {
    public static void main(String[] args) throws IOException {
        //开启服务器
        ServerSocket ss=new ServerSocket(6666);
        //建立接收连接
        Socket s1= ss.accept();
        InputStream is= s1.getInputStream();
        byte[] b1=new byte[1024];
        int len= is.read(b1);
        System.out.println(new String(b1));
        //读完，写出数据 客户端接收
        OutputStream os=s1.getOutputStream();
        os.write("你也好".getBytes());

        is.close();
        os.close();
        s1.close();
    }
}
