package com.cydeo.Task;

public class DishTask {
    public static void main(String[] args) {

        System.out.println("============Print all dish name that has less than 400 calories");

        DishData.getAll().stream().filter(i->i.getCalories() < 400).map(Dish::getName).forEach(System.out::println);

        System.out.println("===============print the length of the name of each dish");
       DishData.getAll().stream().map(Dish::getName).map(String::length).forEach(System.out::println);


        System.out.println("==========print three high caloric dish name ( >300)");
        DishData.getAll().stream().filter(i->i.getCalories()>300).limit(3).map(Dish::getName).forEach(System.out::println);


        System.out.println("=============print all dish name that are below 400 calories in sorted");
        DishData.getAll().stream().filter(cal->cal.getCalories() < 400).map(Dish::getName).forEach(System.out::println);



    }
}
