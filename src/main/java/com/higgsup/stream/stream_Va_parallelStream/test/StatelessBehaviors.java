package com.higgsup.stream.stream_Va_parallelStream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StatelessBehaviors {
    public static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            strings.add(i);
        }

        Long start=System.currentTimeMillis();

        Optional<Integer> sum1 = strings.stream().reduce((integer, integer2) -> integer + integer2);
        System.out.println(sum1.get());

        System.out.println(System.currentTimeMillis()-start);

        start=System.currentTimeMillis();

        Optional<Integer> sum12 = strings.stream().parallel().reduce((integer, integer2) -> integer + integer2);
        System.out.println(sum12.get());

        System.out.println(System.currentTimeMillis()-start);

    }
}
