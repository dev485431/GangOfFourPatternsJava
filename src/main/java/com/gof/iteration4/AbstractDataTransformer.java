package com.gof.iteration4;

import com.gof.customer.data.TypeOfData;

public abstract class AbstractDataTransformer {

    protected TypeOfData typeOfData;

    public AbstractDataTransformer(TypeOfData typeOfData) {
        this.typeOfData = typeOfData;
    }

    abstract String transform(String s);

    protected TypeOfData getTypeOfData() {
        return typeOfData;
    }
}
