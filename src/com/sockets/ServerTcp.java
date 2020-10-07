package com.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {
    public static void main(String[] args) throws IOException {
        //创建服务器端对象
        ServerSocket ss=new ServerSocket(55);
        //接收连接accept方法，返回socket对象
        Socket s1= ss.accept();
        //读取客户端发送数据，通过socket获取输入流
        InputStream is= s1.getInputStream();
        //创建字节数组
        byte[] b1=new byte[1024];
        //据读取到字节数组中
        int len=is.read(b1);
        //解析数组，打印字符串信息
        String msg=new String(b1,0,len);
        //把读取到的内容输出到控制台上
        System.out.println(new String(b1));
        //关闭资源
        is.close();
        s1.close();
    }
}
