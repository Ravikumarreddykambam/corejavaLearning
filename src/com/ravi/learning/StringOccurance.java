package com.ravi.learning;

public class StringOccurance {

    public static void main(String[] args) {


        String str="aabccccdeekkaaa";

        //expected a2bc4de2k2a3
        for(int i=0;i<str.length();i++){

            int count=1;
            while (i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                ++i;
                count++;
            }
            System.out.print(str.charAt(i)+ ""+count+" ");
        }



    }
}
