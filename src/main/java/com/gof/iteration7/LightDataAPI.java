package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class LightDataAPI extends DataAPI {

    public LightDataAPI(Long id, TypeOfData typeOfData) {
        super(id, RandomUtils.generateRandomString(RandomUtils.ALPHABET), typeOfData);
    }
}
