package com.java.MethodReference;

import java.time.LocalDate;

public class Stuff {
    public static void doStuff(){
        System.out.println("I am doing a task");
        System.out.println("I am second line");
        LocalDate now = LocalDate.now();

        System.out.println();
    }

    //Static method
    public static void threadTask(){
        for (int j =0;j<5;j++){
            System.out.println("j is : "+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //Non static method
    public void printNumbers(){
        for (int j =0;j<5;j++){
            System.out.println("non static method reference : "+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
