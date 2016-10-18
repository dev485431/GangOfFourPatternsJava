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

        for (DataAPI api : data) {
            transformContext.doTransform(api);
            remoteOutputAPI.setOutputData(api);
        }

    }

}