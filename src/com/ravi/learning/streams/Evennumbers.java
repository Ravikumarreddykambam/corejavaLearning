package com.ravi.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Evennumbers {

    public static void main(String[] args) {

        List<Integer> listNumbers= Arrays.asList(2,4,5,9,6,34,23,56,43);

        List<Integer>evenNumbers=listNumbers.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);


    }
}
