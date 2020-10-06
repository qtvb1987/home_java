package com.theads;

public class ThreadTest01 {
    public static void main(String[] args) {

        ThreadDemo01 td=new ThreadDemo01();
        td.setName("子线程1----");
        //启动线程
        td.start();
        ThreadDemo01 td2=new ThreadDemo01();
        td2.setName("子线程2---");
        //启动线程
        td2.start();

        //主函数中内容叫主线程
        System.out.println("主线程");
        for (int i=200;i<300;i++){
            System.out.println(i);
        }
    }


}
