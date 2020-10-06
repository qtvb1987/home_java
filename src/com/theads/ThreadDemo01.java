package com.theads;

public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"子线程");
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
