package com.gof.iteration2;

import com.gof.customer.core.DataAPI;

public abstract class DataHandler {

    protected DataHandler nextDataHandler;

    public void setNextDataHandler(DataHandler nextDataHandler) {
        this.nextDataHandler = nextDataHandler;
    }

    public abstract void handleData(DataAPI dataAPI);
}
