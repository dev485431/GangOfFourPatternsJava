package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

public class DataA extends DataAPI {

    public DataA(Long id, String dataMX, String dataSX) {
        super(id);
        this.setDataMX(dataMX);
        this.setDataSX(dataSX);
    }

}
