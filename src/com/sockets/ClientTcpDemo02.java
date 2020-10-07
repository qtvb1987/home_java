package com.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTcpDemo02 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",6666);
        OutputStream os= socket.getOutputStream();
        os.write("你好".getBytes());
        InputStream is= socket.getInputStream();
        byte[] bi=new byte[1024];

        int len= is.read(bi);
        System.out.println(new String(bi));
        os.close();
        is.close();
        socket.close();
    }
}
