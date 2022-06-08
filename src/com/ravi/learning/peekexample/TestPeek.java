package com.ravi.learning.peekexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPeek {
    public static <list> void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee e1=new Employee(1,"ravi","kambam","active");
        Employee e2=new Employee(2,"Selva","kambam","active");
        Employee e3=new Employee(3,"Rajesh","kambam","inactive");
        Employee e4=new Employee(4,"babu","kambam","active");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(list);

        List<Employee> filteredList=list.stream().filter(employee -> employee.getDepartment().equals("active"))
                .peek(employee -> employee.setFirstname("Test")).collect(Collectors.toList());
        System.out.println(filteredList);

    }
}
