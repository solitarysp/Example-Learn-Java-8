package com.higgsup.stream.IntermediateOperationAndTerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        List<String> rep = strings.stream().filter(s -> s.equals("a")).collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(rep);

    }
}
