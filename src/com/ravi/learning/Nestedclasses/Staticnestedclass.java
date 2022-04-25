package com.ravi.learning.Nestedclasses;



public class Staticnestedclass {
    public static void main(String[] args) {

        ClassA.ClassB obj1=new ClassA.ClassB();
        obj1.get();
    }
}

class ClassA{

    static int x=10;
    int y=20;
    private static int z=30;
    static class  ClassB{
        void get(){
            System.out.println("X value :  "+x);
           // System.out.println("Y value :  "+y);
            System.out.println("Z value :  "+z);
        }
    }
}