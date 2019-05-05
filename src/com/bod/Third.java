package com.bod;

import java.util.Arrays;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<String> numsList = Arrays.asList("1,2,0", "4,5");

        numsList
                .stream()
                .map(p -> p.split("[,]"))
                .forEach(p -> {
                    for (String elem : p) {
                        System.out.println(elem);
                    }
                });
    }
}
