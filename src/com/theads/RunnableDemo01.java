package com.theads;

/**
 * 匿名内部类创建线程
 */
public class RunnableDemo01 {
    public static void main(String[] args) {
        Runnable ra=new ThreadDemo01(){
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    System.out.println(i);
                }
            }
        };

        new Thread(ra).start();
    }

}
