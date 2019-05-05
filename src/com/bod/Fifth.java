package com.bod;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fifth {
    private static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Queue<T> queue1 = first.collect(Collectors.toCollection(LinkedList::new));
        Queue<T> queue2 = second.collect(Collectors.toCollection(LinkedList::new));

        return Stream.generate(new Supplier<T>() {
            boolean f = false;

            @Override
            public T get() {
                f = !f;
                return f ? queue1.poll() : queue2.poll();
            }
        }).limit(queue1.size() * 2);
    }

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a1", "b1", "c1");
        Stream<String> stream2 = Stream.of("a2", "b2", "c2");
        zip(stream1, stream2).forEach(System.out::println);
    }
}
