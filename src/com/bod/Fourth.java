package com.bod;

import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class Fourth {
    public static void main(@NotNull String[] args) {
        long seed = Long.parseLong( args[0]);
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2L, 48L);

        Stream.iterate(seed, n -> n = (a * n + c) % m)
                .limit(20)
                .forEach(System.out::println);
    }
}
