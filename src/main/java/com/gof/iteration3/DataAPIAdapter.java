package com.gof.iteration3;

import com.gof.customer.core.DataAPI;

import java.util.List;

public class DataAPIAdapter implements DataAPISequence {

    private List<DataAPI> dataAPIs;

    public DataAPIAdapter(List<DataAPI> dataAPIs) {
        this.dataAPIs = dataAPIs;
    }

    @Override
    public int countAPIs() {
        return dataAPIs == null ? 0 : dataAPIs.size();
    }

    @Override
    public DataAPI getAPIByIndex(int index) {
        return dataAPIs == null ? null : dataAPIs.get(index);
    }
}
