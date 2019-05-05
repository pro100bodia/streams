package com.bod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        String[] names = {"Dmytro",
                "Stepan",
                "Bohdan",
                "Daria",
                "Nikita"};

        List<String> namesList = Arrays.asList(names);

        namesList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
