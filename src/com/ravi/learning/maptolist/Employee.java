package com.ravi.learning.maptolist;

public class Employee {

    private Integer empid;
    private String empName;

    public Employee(Integer empid, String empName, String empDept) {
        this.empid = empid;
        this.empName = empName;
        this.empDept = empDept;
    }

    private String empDept;

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                '}';
    }
}
