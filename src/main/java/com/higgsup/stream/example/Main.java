package com.higgsup.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("thanh");
        names.add("nam");
        names.add("tuan");
        names.add("thanh");

        // trả về 1 list phần tử khi các phép so sánh ở phần từ đó là true
        System.out.println(names.stream().filter(s -> s.equals("nam")).collect(Collectors.toList()));

        // trả về tất cả dữ liệu theo điều kiển return
        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));
        // list cũ vẫn vậy, k tác động gì đến list cũ.
        System.out.println(names);

        // tìm dữ liệu và trả về dữ liệu khi tìm thấy lần đầu luôn
        Optional<String> s = names.stream().findFirst();
        Optional<String> s1 = names.stream().filter(s2 -> s2.equals("thanh")).findFirst();
        s.ifPresent(System.out::println);

        s1.ifPresent(System.out::println);

        // trẻ về true nếu tất cả đều map, flase nếu nhỏ hơn tổng leng có mấp với câu tính toán
        System.out.println( names.stream().allMatch(s2 -> s2.equals("nam1")));

        // trả về list có sắp xếp
        System.out.println( names.stream().sorted().collect(Collectors.toList()));

        // xóa những object giống nhau
        System.out.println(names.stream().distinct().collect(Collectors.toList()));



    }
}
