package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {


        // creating Stream step -1
        String[] courses = {"Java","Spring","Agile"};

        // and change the array to Stream with Arrays.stream
        Stream<String > courseStream = Arrays.stream(courses);

        // Creating Stream from collections

        List<String> courseList = new ArrayList<>(Arrays.asList("Java","Spring","Agile"));
        Stream<String>  courseStream2 = courseList.stream();
        System.out.println(courseStream2);

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102)

        );



        Stream<Course> myCourseStream = myCourses.stream(); //now my courseList is in the flow

        // creating stream values

        //this is another way
        Stream<Integer> stream = Stream.of(1,2,3,4);














    }
}
