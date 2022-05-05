package com.ravi.learning;

import java.text.SimpleDateFormat;

public class Singleton {


    private static  Singleton singleton=null;
    public String  s;

    private  Singleton(){
        s="creating singleton instance";

    }

    public Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
class GFE{
    public static void main(String[] args) {

        Singleton s1=  new Singleton().getInstance();

        Singleton s2= new Singleton().getInstance();

        Singleton s3= new Singleton().getInstance();


        System.out.println("Hashcode of s1 is "
                + s1.hashCode());
        System.out.println("Hashcode of s2 is "
                + s2.hashCode());
        System.out.println("Hashcode of s3 is "
                + s3.hashCode());

    }
}

}
