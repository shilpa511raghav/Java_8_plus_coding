package com.java.StreamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
         // Create Streams
        List<String> languageslist = List.of("Java","Golang", "Reactjs","Python");
        List<Integer> numberList = List.of(1,2,3,4,5,6);

        //create a stream from list
        List<String> ls = Arrays.asList("apple","mango","banana");
        Stream<String> listStream = ls.stream();

         //Create a stream from int array(int is primitive data type)
        //specialized primitive streams (IntStream, LongStream, DoubleStream) in java 8 and can directly optimize operations like sum(), average(), etc
        //Performance better for heavy numeric calculations: avoids boxing overhead and is faster for numeric operations.
        int[] ar = new int[]{1,4,8};
        IntStream intStream = Arrays.stream(ar);

        //Create a stream from Integer Array
        //Integer is wrapper class so  treated as object arrays and - uses the generic Stream<T> type and - Operations like sum() aren’t directly available; you’d need to map to int first
        //- Flexibility when absent entries like null values: Stream<Integer> allows null values and works with objects, and need boxing unboxing
        Integer[] arr = new Integer[]{77,4,1,3,8};
        Stream<Integer> integerStream = Arrays.stream(arr);

    }
}
