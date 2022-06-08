package com.ravi.learning;

import java.text.SimpleDateFormat;

public class Singleton {


    private static Singleton singleton = null;
    public String s;

    private Singleton() {
        s = "creating singleton instance";

    }

    public static  Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {

        Singleton s1=   Singleton.getInstance();

        Singleton s2=  Singleton.getInstance();

        Singleton s3=   Singleton.getInstance();


        System.out.println("Hashcode of s1 is "
                + s1.hashCode());
        System.out.println("Hashcode of s2 is "
                + s2.hashCode());
        System.out.println("Hashcode of s3 is "
                + s3.hashCode());

    }
}



