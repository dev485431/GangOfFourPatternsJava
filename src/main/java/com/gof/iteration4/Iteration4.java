package com.gof.iteration4;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration4 {

    public static void run() {
        Channel2 dataSource = new Channel2();
        List<DataAPI> data = dataSource.getDataAPI();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        TransformContext transformContext = new TransformContext();

        data.forEach(api -> {
            System.out.println("Received object with TypeOfData" + api.getTypeOfData());
            System.out.println("Before transformation: " + transformContext.getInputString(api));
            transformContext.doTransform(api);
            System.out.println("Using transformer for TypeOfData: " + transformContext.getDataTransformer()
                    .getTypeOfData());
            System.out.println("After transformation: " + api.getDataFX());
            remoteOutputAPI.setOutputData(api);
        });

    }

}