package com.higgsup.Functional.defaultMethod;
@FunctionalInterface
public interface Example {
    void get1();
   static void get() {
        System.out.println("d");
    }
}
