package com.ravi.learning.maptolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {

    public static void main(String[] args) {

        Map<Integer, Employee> map=new HashMap<>();
        map.put(101,new Employee(101,"Ravi","IT"));
        map.put(102,new Employee(102,"Mary","HR"));
        map.put(103,new Employee(103,"John","Admin"));
        map.put(104,new Employee(104,"Kim","QA"));

        List<Integer> keylist=new ArrayList<>(map.keySet());

        System.out.println(keylist);
        List<Employee> valueList=new ArrayList<>(map.values());
        System.out.println(valueList);

        //Java 8 code
        List<Integer> listKey=map.keySet().stream().toList();
        System.out.println(listKey);
        List<Employee> listemp=map.values().stream().toList().stream().collect(Collectors.toList());
        System.out.println(listemp);


    }
}
