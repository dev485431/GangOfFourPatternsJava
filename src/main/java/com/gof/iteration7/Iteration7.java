package com.gof.iteration7;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.data.TypeOfData;

public class Iteration7 {

    public static void run() {
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();
        AbstractDataAPIFactory lightDataAPIFactory = DataAPIFactoryManager.getFactory(DataAPIFactoryManager
                .TypeOfDateAPI.LIGHT);
        AbstractDataAPIFactory heavyDataAPIFactory = DataAPIFactoryManager.getFactory(DataAPIFactoryManager
                .TypeOfDateAPI.HEAVY);

        remoteOutputAPITesting.setOutputData(lightDataAPIFactory.getDataAPI(1L, TypeOfData.LIVE));
        remoteOutputAPITesting.setOutputData(lightDataAPIFactory.getDataAPI(2L, TypeOfData.PREPARED));

        remoteOutputAPITesting.setOutputData(heavyDataAPIFactory.getDataAPI(3L, TypeOfData.FAKE));
        remoteOutputAPITesting.setOutputData(heavyDataAPIFactory.getDataAPI(4L, TypeOfData.ERR));
    }

}