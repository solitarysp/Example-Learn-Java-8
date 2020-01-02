package com.higgsup.stream.cac_cach_Stream_lay_source;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static String pathUrl = "D:\\project\\Example-Learn-Java-8\\src\\main\\resources\\data.txt";

    public static void main(String[] args) throws IOException {
        fromClassConCuaCollection();
        fromArrays();
        fromBufferedReader();
        fromFiles();
    }

    private static void fromFiles() throws IOException {
        Path path = Paths.get(pathUrl);
        Stream<String> stream = Files.lines(path);
        Stream<String> stream1 = Files.lines(path, Charset.defaultCharset());
    }

    private static void fromBufferedReader() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(pathUrl));
        Stream<String> stream = bufferedReader.lines();
    }

    private static void fromArrays() {
        String[] name = new String[10];
        Stream<String> stream = Arrays.stream(name);
    }

    private static void fromClassConCuaCollection() {
        List<String> strings = new ArrayList<>();
        Stream<String> stream = strings.stream();
        Stream<String> stream1 = strings.parallelStream();
    }
}
