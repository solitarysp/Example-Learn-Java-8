package com.higgsup.Functional;

import com.higgsup.Functional.impl.ConvertFromStringToFloat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongBiFunction;

public class Main {
    public static void main(String[] args) {
        Example1 example1 = s -> {
            for (String value : s
                    ) {
                System.out.println(value);
            }
        };
        List<String> stringList = new ArrayList<>();

        stringList.add("d");
        stringList.add("1");
        example1.show(stringList);

        Convert<Double> convert = o -> Double.parseDouble(String.valueOf(o));

        System.out.println("chuyen spring den Double "+convert.convert("1212"));

        ConvertFromStringToFloat convertFromStringToFloat = new ConvertFromStringToFloat();
        System.out.println(convertFromStringToFloat.convert(112312));
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(5);

        System.out.println("dasdas");
        checkNumber(integers, (Integer o1,Integer o2) -> {
            if (o1 < o2) {
                return o1;
            } else {
                return o2;
            }
        });

        Example2 example2 = () -> System.out.println("d");

        example2.get();

        System.out.println("lon nhat la : "+checkNumber222(integers, (o1, o2) -> {
            if (o1 > o2) {
                return o1;
            } else {
                return o2;
            }
        }));

        ToLongBiFunction<Integer, Integer> toLongBiFunction = (o, o2) -> o * o2;
        System.out.println(nhanAvoiB(toLongBiFunction,5,8));
    }

    private static long nhanAvoiB(ToLongBiFunction<Integer, Integer> toLongBiFunction, Integer o, Integer o2) {
        return toLongBiFunction.applyAsLong(o, o2);
    }

    private static Integer checkNumber222(List<Integer> integers, Comparator comparator) {
        Integer integer = 0;
        for (int i = 0; i < integers.size(); i++) {
            integer = comparator.compare(integer, integers.get(i));
        }
        return integer;
    }

    private static void checkNumber(List<Integer> integers, Comparator comparator) {
        for (int i = 0; i < integers.size() - 1; i++) {
            System.out.println(comparator.compare(integers.get(i), integers.get(i + 1)));
        }
    }
}
