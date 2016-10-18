package com.gof.iteration3;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration3 {

    public static void run() {

        Channel2 dataSource = new Channel2();
        List<DataAPI> data = dataSource.getDataAPI();

        data.forEach(api -> api.setResultX(api.getDataFX() + api.getDataMX() + api.getDataSX() + api
                .getDataBX()));

        DataAPISequence dataAPISequence = new DataAPIAdapter(data);
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        remoteOutputAPI.setOutputData(dataAPISequence);

    }

}