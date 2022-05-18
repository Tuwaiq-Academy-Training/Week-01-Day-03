package com.company;

public class Student extends Person {


    private double gpa;

    public Student(int id, String name, int age, String phoneNumber, String major,double gpa) {
        super(id,name,age,phoneNumber,major);
        this.gpa=gpa;
    }

    public Student(int id, String name, int age, String phoneNumber, String major) {
        super(id,name,age,phoneNumber,major);
    }
    public Student(int id, String name) {
        super(id,name);
    }




    public void submitHomeWork(String homeWorkName){

    }


    public void submitHomeWork(int homeWorkId){

    }

//    public static void changeSchoolName(String name){
//        schoolName=name+" 123";
//    }


    @Override
    public void leaveSchool(){
        System.out.println("Student leave");
    }

    public void addClass(String name){
        System.out.println("Student add class");
    }



}
