package com.java.ConstructorReference;

public class Student {

    private String name;
    //constructor
    public Student(String name){
        this.name= name;
        System.out.println("creating object of student: "+ name);
    }
    public void dispayStudentName(){
        System.out.println("I am a student and my name is :"+ this.name);
    }
}
