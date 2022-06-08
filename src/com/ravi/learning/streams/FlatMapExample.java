package com.ravi.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Integer> listmap1= Arrays.asList(3,4,2,1);
        List<Integer> listmap2= Arrays.asList(8,4,63);
        List<Integer> listmap3= Arrays.asList(22,54,12,32);

        List<List<Integer>> listoflist=Arrays.asList(listmap1,listmap2,listmap3);

        System.out.println(listoflist);
        List<Integer> afterList=null;
       afterList= listoflist.stream().flatMap(list-> list.stream())
                .collect(Collectors.toList());
        System.out.println(afterList);


    }
}
