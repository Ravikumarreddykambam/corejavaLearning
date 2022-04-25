package com.ravi.learning;

public class StringClass {

    public static void main(String[] args) {
        String s1="str 32415 hgg";
        /*String s2="str";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3=new String("str");
        //s3="str";
        System.out.println(s3.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1==s3);*/

        System.out.println(s1.length());
        System.out.println(s1.codePoints().count());

        String s2="aab";
        System.out.println(s2);
        System.out.println(s2.repeat(3));

        double d1=1;
        double d2=4;
        System.out.println(Double.compare(d1,d2));

        String s4="rest";
        String s5="rest";
        System.out.println(s4.equals(s5));
        System.out.println(s4.hashCode()==s5.hashCode());

    }

}
