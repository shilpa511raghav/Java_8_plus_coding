package com.java.OptinalExample;

import java.util.Optional;

public class OptionalUsage {
    public static void main(String[] args) {

        //String myString = "I am practicing Java 8";
        String myNullString = null;   //
        String myString = "I am learning java 8 plus reactjs";
        //Without Optional and before java 8
        if(myString == null){
            System.out.println("string is null");
        }else if(myString.length()>12){
            System.out.println(myString.concat(" and DSA along with it"));
        }else{
            System.out.println("my string is : "+myString+" and length is "+myString.length());

        }
        //Optional introduced in Java 8
        //Optional<String> str= Optional.of(myNullString); // must not be null string for of method
        Optional<String> str2= Optional.ofNullable(myNullString);// can be null also for Nullable method

        //Optional usage with multiple scenerios for string
       


    }
}
