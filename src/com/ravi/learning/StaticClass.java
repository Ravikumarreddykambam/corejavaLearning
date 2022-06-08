package com.ravi.learning;

public class StaticClass {

    public static void main(String[] args) {

        Parent cobj=new Child();
        System.out.println("value : "+ cobj.value);

        Parent par = cobj;

        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        if (par instanceof Child)
        {
            System.out.println("Value accessed through " +
                    "parent reference with typecasting is " +
                    ((Child)par).value);
        }
    }
}

class Parent{
    int value=100;

}
class Child extends Parent{
    int value=10;
}
