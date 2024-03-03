package com.cydeo.Operations;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    // it takes a parameter it returns something
    // what it means for ex : collect all numbers in the list
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        /*
        int sum = 0;
        for (Integer number : numbers) {
            sum+= number;
        }
        System.out.println(sum);
        */ //this was the old solution

        // new solution by stream is :


       // int result = numbers.stream().reduce(0, (a,b)-> (a+b));
        int result = numbers.stream().reduce(0,Integer::sum);
        System.out.println(result);


        System.out.println("======calculate total calories==============");
       // Optional<Integer> calTotal= DishData.getAll().stream().map(Dish::getCalories).reduce((a,b)->(a+b));
        Optional<Integer> calTotal = DishData.getAll().stream().map(Dish::getCalories).reduce(Integer::sum);
        System.out.println(calTotal.get());

        System.out.println("=========max and min===========================");

        Optional<Integer> maxN = numbers.stream().reduce(Integer::max);
        System.out.println(maxN.get());
        Optional<Integer> minN = numbers.stream().reduce(Integer::min);
        System.out.println(minN.get());


        System.out.println("==========count==============");

        //counts how many data in the stream and returns long

        long allData = DishData.getAll().stream().count();
        System.out.println(allData);


    }
}
