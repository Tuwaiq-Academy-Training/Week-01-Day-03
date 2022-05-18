package com.company;

abstract public class Person  implements School  {

    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String major;


    public Person(int id, String name, int age, String phoneNumber, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.major = major;

        System.out.println(schoolName);
    }

    public Person(int id , String name){
        this.id=id;
        this.name=name;
    }


    public abstract void addClass(String className);


    public void leaveSchool(){
        System.out.println("Person leave");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString2() {
        return null;
    }
}
