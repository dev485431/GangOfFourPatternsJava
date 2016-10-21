package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

import static com.gof.iteration8.RandomUtils.ALPHABET;

public class DataBBuilder implements DataAPIBuilder {

    @Override
    public DataAPI getDataAPI(Long id) {
        return new DataB(id,
                RandomUtils.generateRandomString(ALPHABET),
                RandomUtils.generateRandomString(ALPHABET));
    }

}
