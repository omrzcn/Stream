package com.cydeo.Operations;

import com.cydeo.Task.DishData;

public class FindingMatching {
    public static void main(String[] args) {

        System.out.println("================ALL MATCH=====================");

        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy); // all of the dishes are low than 1000










    }









}
