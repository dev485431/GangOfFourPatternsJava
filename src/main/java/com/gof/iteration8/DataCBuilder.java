package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

import static com.gof.iteration8.RandomUtils.ALPHABET;
import static com.gof.iteration8.RandomUtils.NUMBERS;

public class DataCBuilder implements DataAPIBuilder {

    @Override
    public DataAPI getDataAPI(Long id) {
        return new DataC(id,
                RandomUtils.generateRandomString(NUMBERS),
                RandomUtils.generateRandomString(ALPHABET),
                RandomUtils.generateRandomString(ALPHABET),
                RandomUtils.generateRandomString(NUMBERS));
    }

}
