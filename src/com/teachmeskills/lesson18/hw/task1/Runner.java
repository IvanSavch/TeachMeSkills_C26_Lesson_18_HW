package com.teachmeskills.lesson18.hw.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,2,3,4,44,55,44,34,44,55,56,57,100,111,12,13,14,15,15,6,7);
        System.out.println("Delete duplicate -> " + integerList.stream()
                                                               .distinct()
                                                               .toList());
        System.out.println("Print all even elements in the range from 7 to 17 (inclusive) -> " + integerList.subList(6,17)
                                                                                                            .stream()
                                                                                                            .filter(a -> a%2==0).toList());
        System.out.println("All elements *2 -> " + integerList.stream().map(a -> a*2).toList());
        System.out.println("Sorted and print first 4 elements -> " + integerList.subList(0,4).stream().sorted().toList());
        System.out.println("Print elements on stream -> " + integerList.stream().count());
        System.out.println("Display the arithmetic mean of all numbers in the stream -> " + integerList.stream().mapToDouble(Integer ::doubleValue).average());


    }
}
