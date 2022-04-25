package com.ravi.learning;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {

        HashMap map=new HashMap<String, String>();
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");
        map.put("4","Four");

        System.out.println(map);
        System.out.println("Concurrenthashmap data");
        ConcurrentHashMap cmap=new ConcurrentHashMap<>();
        cmap.put("1","One");
        cmap.put("2","Two");
        cmap.put("3","Three");
        cmap.put("4","Four");

        System.out.println(cmap);
    }
}
