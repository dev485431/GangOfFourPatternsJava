package com.gof.iteration3;

import com.gof.customer.core.DataAPI;

public class RemoteOutputAPI {

    public RemoteOutputAPI() {
    }

    public void setOutputData(DataAPISequence data) {
        System.out.println("Has received data");
        System.out.println("Processing incoming data...");
        DataAPI.delay(1);
        System.out.println("APIs count is " + data.countAPIs());
    }
}
