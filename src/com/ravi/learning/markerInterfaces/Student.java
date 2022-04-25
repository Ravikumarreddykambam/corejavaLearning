package com.ravi.learning.markerInterfaces;

public class Student implements  Cloneable{

    String name=null;
    int id ;
     Student(){
    }
    public  Student(String name,int id){
         this.name=name;
         this.id=id;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

         Student std=new Student("ravi1",101);

         System.out.println(std);

         Student std2= (Student) std.clone();
         System.out.println(std2);


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
