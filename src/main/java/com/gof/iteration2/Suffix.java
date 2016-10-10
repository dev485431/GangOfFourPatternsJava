package com.gof.iteration2;

import com.gof.customer.data.TypeOfData;

import java.util.EnumMap;

public final class Suffix {

    public static final EnumMap<TypeOfData, String> map;

    static {
        map = new EnumMap<>(TypeOfData.class);
        map.put(TypeOfData.LIVE, "1");
        map.put(TypeOfData.PREPARED, "2");
        map.put(TypeOfData.FAKE, "3");
        map.put(TypeOfData.ERR, "4");
    }
}
