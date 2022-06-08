package com.ravi.learning.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FrequencyString {

    public  String str="test";

    public static void main(String[] args) {
        String input="ravikumar";
        Map<String, Long> countMap=Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(),counting()));

        System.out.println(countMap);


    }
}
