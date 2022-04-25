package com.ravi.learning.abstractfinal;

public class JavaEmployment extends Employment{
    @Override
    void applyforJob() {
        System.out.println("I had applied for Java Developer in XYZ company");
    }

    @Override
    void pepareForInterview() {
        System.out.println("Then I prepared for the interviews");
    }

    @Override
    void getOfferLetter() {
        System.out.println("I got the offer letter from XYZ company for Java developer with handsome salary");
    }

    @Override
    void joinCompany() {
        System.out.println("I am going to join the XYZ company in next month");
    }

    public static void main(String[] args) {
        JavaEmployment employment=new JavaEmployment();
        employment.becomeEmployee();
    }
}
