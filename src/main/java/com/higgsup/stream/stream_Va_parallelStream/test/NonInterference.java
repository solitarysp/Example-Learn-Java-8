package com.higgsup.stream.stream_Va_parallelStream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NonInterference {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(String.valueOf(i));
        }
       // stream(strings);

        //parallelStream(strings);

    }

    private static void parallelStream(List<String> strings) {
        Stream<String> sl =   strings.parallelStream();
        strings.add("three");
        strings.add("three");
        sl.forEach(s -> System.out.println(s));
    }

    private static void stream(List<String> strings) {
        Stream<String> sl = strings.stream();
        strings.add("three");
        strings.add("three");
        sl.forEach(s -> System.out.println(s));
    }
}
