package com.java;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {

        //Use of filter method. filter method takes predicate means true and false boolean value
        List<String> names =List.of("anjali","Amit",  "Shilpa", "santosh","champa","ankita","suresh","Saroj","amit");
        List<String> filtered = names.stream().filter(e -> e.startsWith("S")).toList();
        System.out.println("name start with S will be : "+filtered);

        //map use Function which will return some value not true or false
        List<Integer> listOfInt= List.of(2,6,1,4,6,9,12,44);
        List<Integer> numbers = listOfInt.stream().map(e -> e * e).toList();
        numbers.forEach(System.out::println); // pass function method reference directly



        /*
        * Use sorted()
        * Note:  .sorted() on streams orders strings by their natural, case‑sensitive lexicographic Comparable rules.
         * if we will not use case insenstivity it will take case sensitive order and places first capital letter first and the small case letter later
         * Can use any comparator also for handling this case sensitivity of string
         * For integer - no case sentivity needed
         * */
        List<String> sortedNames = names.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
        List<String> sortedNamesUsingComparator = names.stream().sorted((s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase())).toList();

        //Using method reference for string comparison
        List<String> sortedNamesUsingComparator2 = names.stream().sorted(Comparator.comparing(String::toUpperCase)).toList(); //always uppercase before lowercase

        System.out.println(sortedNames.toString());
        System.out.println(sortedNamesUsingComparator);
        System.out.println(sortedNamesUsingComparator2);


        /*
        * Method reference: used to create simple lambda expressions by referencing existing methods
        * operator is ::
        * Type of method reference: Static methods, instance methods of particular objects and Constructor
        * */



        

    }

}
