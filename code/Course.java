package com.company;

import java.util.ArrayList;

public class Course {

    private int id;
    private String subject;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(int id, String subject, Teacher teacher) {
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
