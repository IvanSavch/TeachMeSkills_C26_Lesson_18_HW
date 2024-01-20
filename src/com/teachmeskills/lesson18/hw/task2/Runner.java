package com.teachmeskills.lesson18.hw.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        Collections.addAll(name,"Lisa","Ivan","Arthur","Daniil","Mark","Fedor");
        System.out.println("Select all names starting with 'a' -> " + name.stream()
                                                                          .filter(a -> a.toLowerCase().startsWith("a"))
                                                                          .toList());
        System.out.println("Enter firs element -> " + name.stream().sorted().findFirst());
    }
}
