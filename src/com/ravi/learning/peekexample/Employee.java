package com.ravi.learning.peekexample;

public class Employee {
    private int id;
    private String firstname;

    private String lastName;
    private String department;
    private Integer salary;

    public Employee(int id, String firstname,  String lastName, String department) {
        this.id = id;
        this.firstname = firstname;

        this.lastName = lastName;
        this.department = department;
    }

    public Employee(int id, String firstname, String lastName, String department, Integer salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
