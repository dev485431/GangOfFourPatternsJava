package com.gof.iteration4;

import com.gof.customer.data.TypeOfData;

public class FakeDataTransformer extends AbstractDataTransformer {
    private static final String REPLACE_FROM = "0";
    private static final String REPLACE_TO = "#";

    public FakeDataTransformer(TypeOfData typeOfData) {
        super(typeOfData);
    }

    @Override
    public String transform(String s) {
        return s.replace(REPLACE_FROM, REPLACE_TO);
    }
}
