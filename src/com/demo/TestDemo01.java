package com.demo;

public class TestDemo01 {
    public static void main(String[] args) {
        int a=2, b=4;
        int c=--b;
        if( a < --b){
            a *= a;
        }
        System.out.println(c);
        System.out.println(b);

        int i=8, j=16;
        if( i-1 > j ){
            i--;
        } else{
            j--;
        }
        System.out.println(i);
    }
}
