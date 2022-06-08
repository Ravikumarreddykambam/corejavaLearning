package com.ravi.learning;

public class Testvar {

    public static void main(String[] args) {

        var a=10;

        var var=20;
        //int var=30;
        System.out.println(a);
    }
}

sealed class Testparent
        permits Child1, Child2,  Child3 {}
non-sealed class Child3 extends Testparent{

}
