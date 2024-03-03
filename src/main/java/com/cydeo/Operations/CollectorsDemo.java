package com.cydeo.Operations;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;
import com.cydeo.Task.Type;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Set;

public class CollectorsDemo {
    public static <Set> void main(String[] args) {

        // when we manipulate it Collect is gonna help us create new structure in one line.
        // For ex :

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("============toCollection==============");
        // is used to create a Collection using Collector

        List<Integer> numberList = numbers.stream().filter(x-> x % 2 == 0 ).collect(Collectors.toCollection(ArrayList::new));
           // List<Integer> numberList = numbers.stream().filter(x ->x %2 == 0).collect(Collectors.toList());
        System.out.println(numberList);

        java.util.Set<Integer> numberSet =  numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);


        System.out.println("============toList==============");

        // shorthand of toCollection

        List<Integer> numberList2 = numbers.stream().filter( x-> x % 2 == 0).collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("============toSet==============");

        java.util.Set<Integer> numberList3 = numbers.stream().filter( x-> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(numberList3);


        System.out.println("============toMap==============");
        Map<String,Integer> dishMap= DishData.getAll().stream().collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);


        System.out.println("===========summingInt===============toIntFunction");
       // Integer sum = DishData.getAll().stream().mapToInt(Dish::getCalories).sum();  this is shortest way to summing calories than below code
        Integer sum = DishData.getAll().stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);



        System.out.println("============counting==============");
        // counts ne data we filtered

       // Long count = numbers.stream().filter(x-> x%2 == 0).count();
        Long count = numbers.stream().filter( i -> i % 2 == 0).collect(Collectors.counting());// or we can wite our code shorthand like above.
        System.out.println(count);


        System.out.println("============averageingInt==============");
        // it finds the average in integers passed values

        Double average= DishData.getAll().stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);

        System.out.println("============joining==============");
        // joining() is used to join various elements of a character or string array into a single object

        List<String> courses = Arrays.asList("Java","JS","TS");

        String str =courses.stream().collect(Collectors.joining(","));
        System.out.println(str);


        System.out.println("============partitioningBy==============");
        // is used to partition a stream of objects (or a set of elements) based on a given predicate.
        // true lari ve falselari yazdiriyor.
        // its not common to use .
        Map<Boolean,List<Dish>> veggieDish= DishData.getAll().stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("============groupingBy==============");
        // is used for grouping objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishType   = DishData.getAll().stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);













    }
}
