package com.gof.iteration8;


import com.gof.customer.core.DataAPI;

public class DataAPIDirector {

    private DataAPIBuilder dataAPIBuilder;

    public void setDataAPIBuilder(DataAPIBuilder builder) {
        dataAPIBuilder = builder;
    }

    public DataAPI buildDataAPI(Long id) {
        dataAPIBuilder.buildDataAPI(id);
        dataAPIBuilder.setDataBX();
        dataAPIBuilder.setDataFX();
        dataAPIBuilder.setDataMX();
        dataAPIBuilder.setDataSX();
        return dataAPIBuilder.getDataAPI();
    }

}
