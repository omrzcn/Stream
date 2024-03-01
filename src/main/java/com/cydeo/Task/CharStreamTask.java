package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {

        List<String> words =Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream().map(w->w.length()).forEach(System.out::println);
        // i manupulate every words by map



    }
}
/*

in the given list, print number of characters for each word
 */