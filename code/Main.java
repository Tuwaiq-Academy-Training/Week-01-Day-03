package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Teacher t1=new Teacher(1,"Saleh",23,999999,
                "CS","05555");


        Student s1=new
                Student(1,"Ali",
                20,"0555","CS",3.5);

        Student s2=new
                Student(2,"Khalid",
                25,"0559","CS",4.5);
        Course course=new Course(1,"Math",t1);
        course.addStudent(s1);
        course.addStudent(s2);
        // t1.leaveSchool();
        // s1.leaveSchool();

//        Person p=new Person(2,"Khalid",
//                25,"0559","CS");

       // p.leaveSchool();

        s1.submitHomeWork(1);

       // System.out.println(p.schoolName);
       // s1.changeSchoolName("Tuwaiq");
       //  System.out.println(p.schoolName);

        Student s3=new Student(3,"khalid");

        s1.addClass("Math");
        t1.addClass("History");


    }

    public static int sum(int number1 , int number2){
        return  number1+number2;
    }



    public static int sum(int number1){
        return  number1+5;
    }
}
