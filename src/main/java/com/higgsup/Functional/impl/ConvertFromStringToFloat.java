package com.higgsup.Functional.impl;

import com.higgsup.Functional.Convert;

public class ConvertFromStringToFloat implements Convert<Float> {
    @Override
    public Float convert(Object o) {
        return Float.valueOf(String.valueOf(o));
    }
}
