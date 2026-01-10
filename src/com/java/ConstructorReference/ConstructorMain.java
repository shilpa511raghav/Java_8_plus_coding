package com.java.ConstructorReference;

public class ConstructorMain {
    public static void main(String[] args) {
        System.out.println("Learning constructor reference example");

        //get object of interfae using lambda is one way
        ProviderInterface providerInterface =(name)->{
            return new Student(name);
        };
        Student std = providerInterface.getStudentName("Shilpa");
        std.dispayStudentName();

        //Using constructor reference like below using new keyword or using Student class constructor
        //We write ProviderInterface on the LHS because method and constructor references must be assigned to a functional interface type.
        // The interface defines the abstract method signature that the reference matches
        //ClassName::new
        ProviderInterface providerInterface1 = Student::new;
        Student student= providerInterface1.getStudentName("Amit");
        student.dispayStudentName();



    }
}
