package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class HeavyDataAPIFactory extends AbstractDataAPIFactory {

    @Override
    public DataAPI getDataAPI(Long id, TypeOfData typeOfData) {
        return new HeavyDataAPI(id, typeOfData);
    }

}
