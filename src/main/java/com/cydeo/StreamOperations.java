package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,2,2,3,4);
        list.forEach(System.out::println);




        System.out.println("============FILTER============");

        // first we are getting into list  to river (Stream)
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    //   into stream -operation-              -- this the exit from river from stream

        //this manupulation is done. If we want we can make more manipuluatiyon with new stream


        System.out.println("============filtering unique elements by DISTINCT=============");

        //avoid suplication

        list.stream().filter(i->i%2==0).distinct().forEach(System.out::println); // only unuqie ones no duplicate




        System.out.println("============LIMIT============");
        // when i provide limit(1), its gonna print first element not others
        // whe can imagine like show me the highest price. something like that

        list.stream()
                .filter(i-> i%2==0).limit(1).forEach(System.out::println);
















    }
}
