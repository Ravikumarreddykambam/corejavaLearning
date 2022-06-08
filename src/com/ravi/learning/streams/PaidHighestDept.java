package com.ravi.learning.streams;

import com.ravi.learning.peekexample.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class PaidHighestDept {

    public static void main(String[] args) {

        List<Employee> employees= Stream.of(
                new Employee(1,"Ravi","Kumar","DEV", 50000),
                new Employee(8,"babu","reddy","DEV", 80000),
                new Employee(3,"Patrik","test","QA", 60000),
                new Employee(9,"Deepak","Kumar","QA", 90000),
                new Employee(4,"Anil","Reddy","DEVOPS", 40000)
        ).collect(Collectors.toList());


        Comparator<Employee> comparingSalary = Comparator.comparing(Employee::getSalary);

        //System.out.println(comparingSalary);

        Map<String, Optional<Employee>> employeeMap = employees.stream()
                .collect(
                        groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(comparingSalary)))
                );

        System.out.println(employeeMap);
    }
}
