package com.company;

 public class  Teacher extends Person  {

    private int salary;

    public Teacher(int id, String name, int age, int salary, String major, String phoneNumber) {
        super(id,name,age,phoneNumber,major);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void gradeStudent(){

    }

     @Override
     public void addClass(String name) {
         System.out.println("Teacher add class");
     }
 }
