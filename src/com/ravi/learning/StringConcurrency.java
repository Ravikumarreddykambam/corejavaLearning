package com.ravi.learning;

import java.util.HashMap;
import java.util.Map;

public class StringConcurrency {

    public static void main(String[] args) {
        String str="ravikumar";
        Map<Character, Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if (map.containsKey(c)){
                int cnt = map.get(c);
                map.put(str.charAt(i),++cnt);

            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}
