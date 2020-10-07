package com.sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTcpDemo01 {
    public static void main(String[] args) {
        try {
            //创建socket（ip,port），确定连接到哪里
            Socket client=new Socket("localhost",55);
            //获取流对象。输出流
            OutputStream os= client.getOutputStream();
            //写出数据
            os.write("你好".getBytes());
            //关闭资源
            os.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
