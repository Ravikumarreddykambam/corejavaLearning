package com.ravi.learning.interfacejava8;

public interface Java8interface {

    public static String  staticMethod(){

        return "This is static method of java 8";
    }
    public default String defaultMethod(){
        return "This is default method of java 8";
    }
}
