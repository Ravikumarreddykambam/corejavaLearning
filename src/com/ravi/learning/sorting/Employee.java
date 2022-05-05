package com.ravi.learning.sorting;

import java.util.*;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
       List<Employee> list = new ArrayList<>();
        list.add(new Employee(10,"ravi",20,10000));
        list.add(new Employee(21,"kumar",20,20000));
        list.add(new Employee(34,"reddy",20,30000));
        list.add(new Employee(14,"test",20,40000));
        //Arrays.sort(empArr);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    @Override
    public int compareTo(Employee employee) {

        if (this.id==employee.id){
            return 0;
        }else if (this.id>employee.id){
            return  1;
        }else
        return -1;
    }
}
