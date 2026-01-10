package com.java.StreamsExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsAdvance {
    public static void main(String[] args) {

        //Usage of filter
        List<Integer> list = List.of(2,4,5,5,9,24,26,34,66,11,17,19,38,4,34,38);
        List<Integer> filteredList = list.stream().filter(e-> e%2==0).toList();
        System.out.println(filteredList.toString());
        //filteredList.add(23);// cannot do as it is immutable since toList is used

        // divide each number by 2 and get new List
        List<Integer> mappedList = filteredList.stream().map(e-> e/2).collect(Collectors.toList());
        System.out.println(mappedList);
        mappedList.add(7); // here we use collector.tolist so we can make modification in that newList
        System.out.println("added a new number in mappedList"+mappedList);


        // combine above both filter and map and do other extra operations also in list and in one stream only

       List<Integer> newList= list.stream()
               .filter(e->e%2==0)
               .map(e->e/2)
               .distinct().sorted(Comparator.reverseOrder())
               .limit(4) // need 4 from starting
               .skip(1) // skip 1 element from starting
               .collect(Collectors.toList());

       //Use Stream.iterate to generate a number dependant on previous or generate any sequence have number dependent on previous number, fabonicci, AP, exponential growth etc
        List<Integer> collect = Stream.iterate(0,e->e+1)
                .limit(101)
                .skip(1)
                .filter(e-> e%2==0) // filter just filter elements from stream
                .map(e->e/2) //map do transformation of value
                .collect(Collectors.toList());
        System.out.println("Series: "+ collect);

        //Filter even and also which ever are divided by 10
        List<Integer> intList = Arrays.asList(5, 10, 12, 20, 25, 30);
        List<Integer> filteredValues= intList.stream()
                .filter(e -> (e % 2 == 0 && e % 10 == 0))
                .collect(Collectors.toList());
        System.out.println(filteredValues);

        //Filter even numbers and then transform them by dividing by 10
        List<Integer> intList2 = Arrays.asList(5, 10, 12, 20, 25, 30);
        List<Integer> filteredAndTransformedValues= intList2.stream()
                .filter(e -> (e % 2 == 0))
                .map(e -> e / 10)
                .collect(Collectors.toList());
        System.out.println(filteredAndTransformedValues);







    }
}
