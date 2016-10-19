package com.gof.iteration5;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration5 {

    public static void run() {

        Channel2 dataSource = new Channel2();
        List<DataAPI> data = dataSource.getDataAPI();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();

        RemoteOutputAPIAcronisFacade remoteApiFacade = new RemoteOutputAPIAcronisFacade();
        data.forEach(api -> {
            remoteOutputAPI.setOutputData(api);

            remoteApiFacade.start();
            remoteApiFacade.sendData(api);
            remoteApiFacade.stop();
        });

    }
}
