package com.bod;

import java.util.*;
import java.util.stream.Collectors;

public class Sixth {
    public static void main(String[] args) {
        String[] arr1 = {"a1", "b1", "c1", "d1", "e1", "f1", "g1"};
        String[] arr2 = {"a2", "b2", "c2", "d2", "e2", "f2", "g2"};

        Queue<String> queue1 = new LinkedList<>(Arrays.asList(arr1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(arr2));

        Queue<Queue<String>> queues = new LinkedList<>();
        queues.offer(queue1);
        queues.offer(queue2);

        List<String>resultList = new ArrayList<>();

        while (!queue1.isEmpty()) {
            List<String> temp = queues
                    .parallelStream()
                    .map(Queue::poll)
                    .collect(Collectors.toList());
            resultList.addAll(temp);
        }

        resultList.forEach(System.out::println);

    }
}
