package com.ravi.learning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ConcurrentString {

    public static void main(String[] args) {

        /*String str="eraarsert";

        HashMap<Character, Integer> countChar=new HashMap<>();

        for(int i=0; i<=str.length()-1;i++){
            if(countChar.containsKey(str.charAt(i))){
                countChar.put(str.charAt(i),countChar.get(str.charAt(i))+1);
            }
            else{
                countChar.put(str.charAt(i),1);
            }
        }
        System.out.println(countChar);*/

        System.out.println(isAcronym("save","veas"));

    }
    public static boolean isAcronym(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Calculate chracter counts

        for (int i = 0; i < s1.length(); i++) {
            if (charCounts.containsKey(s1.charAt(i))) {
                charCounts.put(s1.charAt(i), charCounts.get(s1.charAt(i)) + 1);
            } else {
                charCounts.put(s1.charAt(i), 1);
            }
        }

        // Compare counts with characters in s2

        for (int i = 0; i < s2.length(); i++) {
            if (charCounts.containsKey(s2.charAt(i))) {
                charCounts.put(s2.charAt(i), charCounts.get(s2.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        // Check all letters matched
        for (int count : charCounts.values()) {
            if (count != 0) return false;
        }

        return true;
    }

}

