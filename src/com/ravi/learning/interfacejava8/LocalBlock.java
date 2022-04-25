package com.ravi.learning.interfacejava8;

public class LocalBlock {
    public static void main(String[] args) {
        {

            int x=10;
            System.out.println("Local block inside method : "+x);
        }
    System.out.println("main method");
    LocalBlock lb=new LocalBlock();


    }

    {
        System.out.println("Class level blocks");
    }
    static {
        System.out.println("Static class level blocks");
    }
}
