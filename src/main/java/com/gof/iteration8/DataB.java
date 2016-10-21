package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

public class DataB extends DataAPI {

    public DataB(Long id, String dataFX, String dataBX) {
        super(id);
        this.setDataFX(dataFX);
        this.setDataBX(dataBX);
    }

}
