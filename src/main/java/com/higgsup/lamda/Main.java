package com.higgsup.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

      //  demoLambdaCuVaMoi();

      //  demoConsumer();

        parallelDemo();

    }

    private static void parallelDemo() {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            strings.add("string" + i);
        }

        Long start = System.currentTimeMillis();
        strings.parallelStream().forEach(s -> {

        });
        System.out.println(" parallelStream "+ (System.currentTimeMillis()-start));

        start = System.currentTimeMillis();
        strings.forEach(s -> {

                }
        );
        System.out.println("forEach"+ (System.currentTimeMillis()-start));
    }

    private static void demoConsumer() {
        Consumer<String> stringConsumer = s -> System.out.println("show lần đầu" + s);

        Consumer<String> stringConsumerThen = stringConsumer.andThen(s -> System.out.println("show lần 2" + s));

        stringConsumerThen.accept("test");
    }

    private static void demoLambdaCuVaMoi() {
        // trước java 8
        Convert<Long> longConvert = new Convert<Long>() {
            @Override
            public Integer get(Long o, Long o1) {
                return o.compareTo(o1);
            }
        };
        System.out.println(longConvert.get(10L, 5L));

        // đến java 8 , ngắn ngon gọn hơn
        Convert<Long> longConvert1 = Long::compareTo;

        System.out.println(longConvert1.get(10L, 5L));
    }

}
