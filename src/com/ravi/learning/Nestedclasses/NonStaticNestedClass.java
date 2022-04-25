package com.ravi.learning.Nestedclasses;

import com.sun.tools.javac.Main;

public class NonStaticNestedClass {
    public static void main(String[] args) {

        ClassD obj1 =new ClassD();
        ClassD.ClassE obj2=obj1.new ClassE();
        obj2.get();
    }
}


class ClassD{
    static int x=10;
    int y=20;
    public int z=30;

    class ClassE{
        void get(){
            System.out.println("X value is : "+ x);
            System.out.println("Y value is : "+ y);
            System.out.println("Z value is : "+ z);
        }

    }
}
