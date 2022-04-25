package com.ravi.learning;

import java.util.ArrayList;
import java.util.Arrays;

public class StringEquals {

    public static void main(String[] args) {

        String s1="home";
        String s2="mohe";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s3=new String(ch1);
        String s4=new String(ch2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        StringBuilder sb=new StringBuilder(s3);
        System.out.println(sb.reverse());
    }
}
