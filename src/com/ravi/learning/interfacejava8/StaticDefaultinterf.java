package com.ravi.learning.interfacejava8;

public class StaticDefaultinterf implements  Java8interface{

    public static void main(String[] args) {

        System.out.println(Java8interface.staticMethod());
        StaticDefaultinterf std=new StaticDefaultinterf();
        System.out.println(std.defaultMethod());


    }


}
