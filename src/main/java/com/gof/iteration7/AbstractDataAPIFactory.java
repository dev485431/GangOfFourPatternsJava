package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public abstract class AbstractDataAPIFactory {

    public abstract DataAPI getDataAPI(Long id, TypeOfData typeOfData);

}
