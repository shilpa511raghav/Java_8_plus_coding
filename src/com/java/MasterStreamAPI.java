package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MasterStreamAPI {

    private static List<Integer> list1 = List.of(2,5,17,19,78,34,6); // unmodifiable list
    private static List<Integer> list2 = new ArrayList<>(); // modifiable list
    private static List<Integer> list3 = Arrays.asList(2,5,77,88,99); // unmodifiable list

    public static void printEvenNumberFromList(){
        list2.add(5);
        list2.add(6);
        list2.add(18);
        list2.add(57);
        list2.add(81);
        //Traditional way of filtering even number form a list without java 8 streams
        List<Integer> evenNumberList = new ArrayList();
        for (int each : list1){
            if(each %2 ==0 ) evenNumberList.add(each);
        }
        System.out.println("List1:  = "+list1);
        System.out.println("evenList: ="+ evenNumberList);

        //Using Streams - filter takes predicate(True/False) as argument
        List immutableEvenList1 = list1.stream().filter(i -> i % 2 == 0).toList(); // .toList() method return unmodifiable/immutable list(introduced in java 16)
        List mutableEvenList2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); // .collect(Collectors.toList() returns modifiable/mutable list)
        System.out.println("stream evenlist : "+ immutableEvenList1);
        //immutableEvenList1.add(56); // invalid operation as this list cannot be modified and result in compile erros
        //System.out.println("modified immutable evenList1= =="+ immutableEvenList1);

        mutableEvenList2.add(88);
        System.out.println("Mutable evenList2 = "+ mutableEvenList2);

    }
}
