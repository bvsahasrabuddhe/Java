package com.bvsahasrabuddhe;
class Employee{
    int id;
    String name;
    int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("my name is "+ name);
        System.out.println("and my salary is "+ salary);
    }
}
public class CustomClass {
    public static void main(String[] args) {
        Employee Bob = new Employee();
//        Employee John = new Employee();
//
//        Bob.id = 1;
//        Bob.name = "Bobby";
//        Bob.salary = 50000;
//
//        John.id = 2;
//        John.name = "Jonny";
//        John.salary = 70000;
//
//        Bob.printDetails();
//        John.printDetails();
        Bob.setId(19);
        Bob.setName("Bobby");
        System.out.println(Bob.getId());
        System.out.println(Bob.getName());
    }
}
