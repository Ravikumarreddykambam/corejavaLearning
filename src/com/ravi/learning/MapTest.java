package com.ravi.learning;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Map.Entry.comparingByValue;

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
        cmap.put("5","Five");
        cmap.put("3","Three");
        cmap.put("4","Four");

        System.out.println(cmap);
        cmap.entrySet().stream().sorted(comparingByValue()).forEach(System.out::println);

        TreeMap tmap=new TreeMap<>();
        tmap.put("a",3);
        tmap.put("d",5);
        tmap.put("b",1);
        tmap.put("c",2);
        System.out.println(tmap);
        tmap.entrySet().stream().sorted(comparingByValue()).forEach(System.out::println);
    }
}
