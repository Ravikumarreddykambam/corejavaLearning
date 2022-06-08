package com.ravi.learning.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorExp {


    public static void main(String[] args) {
        ArrayList<Student> stdlist=new ArrayList<>();

        stdlist.add(new Student(10,"ravi",20,"test"));
        stdlist.add(new Student(21,"kumar",20,"test2"));
        stdlist.add(new Student(34,"reddy",20,"test3"));
        stdlist.add(new Student(14,"test",20,"test4"));

        //System.out.println(stdlist);
        //Collections.sort(stdlist,Student.idcalucator);
        System.out.println("before name sorting ");
        System.out.println(stdlist);
        Collections.sort(stdlist,Student.namesorting);
        System.out.println(stdlist);
        stdlist.sort( Comparator.comparing(Student:: getName).reversed());
        System.out.println("After name sorting ");
        System.out.println(stdlist);
        Comparator<Student> groupByComparator=Comparator.comparing(Student:: getId).thenComparing(Student::getName);
        stdlist.sort(groupByComparator);
        System.out.println(stdlist);


    }

}
class Student {

    private int id;
    private String name;
    private int age;
    private String college;

    public Student(int id, String name, int age, String college) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                '}';
    }

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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

   public static Comparator<Student> idcalucator=new Comparator<Student>() {
       @Override
       public int compare(Student o1, Student o2) {
           return o1.id-o2.getId();
       }
   };

    public static  Comparator<Student> namesorting=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
