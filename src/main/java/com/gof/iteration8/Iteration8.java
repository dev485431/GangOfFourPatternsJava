package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;

import java.util.LinkedList;
import java.util.List;

public class Iteration8 {

    public static void run() {

        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();
        List<DataAPI> dataAPIList = new LinkedList<>();
        DataAPIBuilder dataABuilder = new DataABuilder();
        DataAPIBuilder dataBBuilder = new DataBBuilder();
        DataAPIBuilder dataCBuilder = new DataCBuilder();

        dataAPIList.add(dataABuilder.getDataAPI(1L));
        dataAPIList.add(dataABuilder.getDataAPI(2L));
        dataAPIList.add(dataBBuilder.getDataAPI(3L));
        dataAPIList.add(dataBBuilder.getDataAPI(4L));
        dataAPIList.add(dataCBuilder.getDataAPI(5L));
        dataAPIList.add(dataCBuilder.getDataAPI(6L));

        dataAPIList.forEach(remoteOutputAPITesting::setOutputData);
    }

}
