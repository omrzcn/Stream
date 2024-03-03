package com.cydeo.Operations;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindingMatching {
    public static void main(String[] args) {

        System.out.println("================ALL MATCH=====================");

        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy); // all of the dishes are low than 1000
        // we can use it for example filtering on web site .



        System.out.println("================ANY MATCH=====================");

        // it any of them is matching its gonna return us true or false

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }



        System.out.println("================NONE MATCH=====================");

        // if non of them is matching it gonna return True, else false

       boolean isHealthy2= DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);


        System.out.println("================FIND ANY=====================");

        // its gonna find any of them we filtered .

        // 'find any' method can be used in parallel stream  code to get fast result

              Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
                System.out.println(dish.get());



        System.out.println("================FIND FIRST =====================");

        // its gonna find first one we filtered

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)

        // synchronized means we can say that java works codes line by line but ASynchronized meaning is that java is not work codes in a order

        // in paralel stream if we wanna find any data, "find any" method can be the best choice, its fast


        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        System.out.println("================================================");
        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findAny  = list1.stream().parallel().filter(s->s.startsWith("D")).findAny();
        Optional<String> findFirst  = list1.stream().parallel().filter(s->s.startsWith("J")).findFirst();


        System.out.println(findAny.get());
        System.out.println(findFirst.get());



        System.out.println("================Min =====================");

        Optional<Dish> dMin =DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get().getName());

        System.out.println("================MAX=====================");
        // forst compare than return max number

        Optional<Dish> dMax =DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get().getName());

    }









}
