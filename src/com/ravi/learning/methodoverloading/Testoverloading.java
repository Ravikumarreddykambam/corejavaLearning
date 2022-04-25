package com.ravi.learning.methodoverloading;

public class Testoverloading {


    public int getValue(int x){
        return x;
    }
    public String getValue(String str){
        return str;
    }
    public int getValue(int x, String s){
        return x;
    }
    public int getValue(String s, int x){
        return x;
    }


    public static void main(String[] args) {

    }
}
