package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

public class DataC extends DataAPI {

    public DataC(Long id, String dataMX, String dataSX, String dataFX, String dataBX) {
        super(id);
        this.setDataMX(dataMX);
        this.setDataSX(dataSX);
        this.setDataFX(dataFX);
        this.setDataBX(dataBX);
    }
}
