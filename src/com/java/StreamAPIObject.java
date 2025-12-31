package com.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIObject {

    public static void main(String[] args){
        //create Stream 1
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e->{
            System.out.println("blank stream: "+e);
        });

        //2 .Create stream using Stream.of method

        String [] java8features= {"Lambda", "StreamApi", " FunctionalInterface"};

        Stream<String> featuresStream = Stream.of(java8features);
        featuresStream.forEach(e-> System.out.println("Java 8 feature :  "+e));

        // Create stream using Stream.builder method
        Stream<Object> streamBuilder = Stream.builder().build();

        //create steam using Arrays.stream
        int []ar = new int[] {1,2,3,4,5,6,7,8,9,10};
        /*Stream is a pipeline to process or transform elements from source of input
        * It produces new stream of values(transform using map, filter etc) ,leaving source remain
        * */
        IntStream integerStream=  Arrays.stream(ar);
        integerStream.map(e-> e*3).forEach(e-> System.out.println("modified a copy of int array Stream instead of modification in original stream array: "+e));
        Arrays.stream(ar).forEach(e-> System.out.println("actual array remain same"+e));

        //create stream object using List, set
        List<String> listOfLanguage= new ArrayList();
        listOfLanguage.add("java");
        listOfLanguage.add("ReactJs");
        listOfLanguage.add("Python");
        listOfLanguage.add("Golang");
        Stream<String> langStream= listOfLanguage.stream();
        langStream.forEach(e-> System.out.println("lang is: "+e));
    }
}
