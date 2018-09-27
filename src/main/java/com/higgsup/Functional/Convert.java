package com.higgsup.Functional;
@FunctionalInterface
public interface Convert<T> {
    T convert(Object o);
}
