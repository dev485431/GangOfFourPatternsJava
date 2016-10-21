package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;

public class Iteration8 {

    public static void run() {
        DataAPIDirector dataAPIDirector = new DataAPIDirector();
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();

        dataAPIDirector.setDataAPIBuilder(new DataABuilder());
        remoteOutputAPITesting.setOutputData(dataAPIDirector.buildDataAPI(1L));

        dataAPIDirector.setDataAPIBuilder(new DataBBuilder());
        remoteOutputAPITesting.setOutputData(dataAPIDirector.buildDataAPI(2L));

        dataAPIDirector.setDataAPIBuilder(new DataCBuilder());
        remoteOutputAPITesting.setOutputData(dataAPIDirector.buildDataAPI(3L));
    }

}