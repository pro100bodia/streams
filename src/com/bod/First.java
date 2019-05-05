package com.bod;

import java.util.Arrays;
import java.util.List;

public class First {
    public static void main(String[] args) {
        String[] names = {"01. Dmytro",
                "02. Stepan",
                "03. Bohdan",
                "04. Daria",
                "447. Nikita"};


        List<String> namesList = Arrays.asList(names);

        namesList
                .stream()
                .filter((p) -> p.matches("^(\\d*[13579]+).+"))
                .forEach(System.out::println);
    }
}
