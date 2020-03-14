package com.jff.java8.ListToSetInJava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetInJava_UsingStream {

    public static void main(String[] args) {

        // Creating a list of strings
        List<String> aList = Arrays.asList("Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks", "GFG");

        Set<String> set = aList.stream().collect(Collectors.toSet());

        for (String x : set)
            System.out.println(x);
    }
}
