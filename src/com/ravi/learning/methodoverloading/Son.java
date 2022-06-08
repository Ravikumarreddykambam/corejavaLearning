package com.ravi.learning.methodoverloading;

public class Son extends Father{

    public void chidMethod(){
        System.out.println("This is son class method");
    }
    public static void test(){
        System.out.println("This is child class static method ");
    }

    public static void main(String[] args) {
        Father son=new Son();
        son.test();
        //son.chidMethod();

    }
}
