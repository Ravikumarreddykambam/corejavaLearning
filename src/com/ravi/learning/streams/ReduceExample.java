package com.ravi.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,6,4,7,23);
        List<String> words=Arrays.asList("corejava","Spring","Hibernate");
        int sum=0;
        for(int no:numbers){
            sum=sum+no;
        }
        System.out.println(sum);

        int sum1=numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);
        int reducesum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(reducesum);

        Optional<Integer> reducesumWithMethodReference=numbers.stream().reduce(Integer::sum);
        System.out.println(reducesumWithMethodReference.get());

        Integer mulResult=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(mulResult);

        Integer maxValue=numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(maxValue);
        Integer maxValueMethodReference=numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueMethodReference);

        String longestString=words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(longestString);


    }
}
