package com.gof.iteration6;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import com.gof.iteration5.RemoteOutputAPIAcronisFacade;

import java.util.List;

public class Iteration6 {

    public static void run() {
        Channel2 dataSource = new Channel2();
        List<DataAPI> data = dataSource.getDataAPI();
        RemoteOutputAPIAcronisFacade remoteApiFacade = new RemoteOutputAPIAcronisFacade();

        data.forEach(api -> {
            remoteApiFacade.start();
            remoteApiFacade.sendData(api);
            remoteApiFacade.stop();

            //
        });


    }

}
