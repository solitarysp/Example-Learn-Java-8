package com.higgsup.CollectionTest;

import com.higgsup.CollectionTest.entity.Student;
import com.higgsup.CollectionTest.repo.StudentRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionTest {
    public static void main(String[] args) {
        StudentRepo studentRepo = new StudentRepo();
        List<Student> students = studentRepo.getListStudent(10);

        withMap();

        //  withList(students);
        // System.out.println("d");
    }

    private static void withList(List<Student> students) {
        List<Student> students1 = students.stream().sorted((o1, o2) -> o2.getId().compareTo(o1.getId())).collect(Collectors.toList());
        students1.forEach(student -> System.out.println(student.getId()));
    }

    private static void withMap() {
        Map<String, String> map = new HashMap<>();
        map.put("C", "2");
        map.put("B", "3");
        map.put("Z", "1");

        List<Map.Entry<String, String>> byKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        System.out.println("key : " + byKey);

        List<Map.Entry<String, String>> byValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println("value : " + byValue);

        List<Map.Entry<String, String>> byValueCustom = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());
        System.out.println("byValueCustom : " + byValueCustom);


        byValueCustom.forEach(stringStringEntry -> {
            System.out.println("key: " + stringStringEntry.getKey() + "  value" + stringStringEntry.getValue());
        });
        System.out.println("===================");

        // láy về giá trị nếu có, k thì sẽ lấy về defalut
        String val = map.getOrDefault("F", "Nah!");
        System.out.println(val);
        System.out.println("===================");
        // replaceAll tất cả value
        map.replaceAll((s, s2) -> "x");
        System.out.println(map);
        System.out.println("===================");


        // đẩy dữ liệu vào nếu chưa có key này, nếu có thì thôi.
        map.putIfAbsent("B", "B");
        System.out.println(map.get("B"));


        // tìm by ky và thực hiện phép toán. có thể thay đổi value key trực tiếp.
        map.compute("A", (s, s2) -> {
            if (1 < 10) {
                return s2 = "test";
            } else {
                return s2 = "test";
            }
        });
        System.out.println("compute " + map.get("A"));

        //làm nếu không tìm thấy key
        map.computeIfAbsent("AAA", s -> {
            System.out.println("không tìm thấy" + s);
            return s;
        });

        //làm nếu tìm thấy key
        map.computeIfPresent("A", (s, s2) -> {
            System.out.println("tìm thấy" + s);
            return s;
        });


        //thêm nếu chưa có, và chỉnh sửa nếu đã có.
        map.merge("FF", "new", (s, s2) -> s + s2);
        System.out.println(map.get("FF"));
    }
}
