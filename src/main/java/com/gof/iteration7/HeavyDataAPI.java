package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class HeavyDataAPI extends DataAPI {

    public HeavyDataAPI(Long id, TypeOfData typeOfData) {
        super(id, typeOfData, RandomUtils.generateRandomString(RandomUtils.NUMBERS),
                RandomUtils.generateRandomString(RandomUtils.NUMBERS),
                RandomUtils.generateRandomString(RandomUtils.NUMBERS),
                RandomUtils.generateRandomString(RandomUtils.NUMBERS));
    }
}
