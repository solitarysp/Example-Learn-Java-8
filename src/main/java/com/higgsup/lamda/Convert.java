package com.higgsup.lamda;

public interface Convert<T> {
    Integer get(T o, T o1);

    default Integer get(T o1) {
        return null;
    }
}
