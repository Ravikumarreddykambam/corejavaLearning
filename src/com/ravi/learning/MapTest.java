package com.ravi.learning;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {

        HashMap map=new HashMap<String, String>();
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");
        map.put("4","Four");

        System.out.println(map);
    }
}