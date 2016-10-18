package com.gof.iteration2;

import com.gof.customer.core.Channel1;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration2 {

    public static void run() {

        Channel1 dataSource = new Channel1();
        List<DataAPI> data = dataSource.getDataAPI();

        DataHandler liveDataHandler = new LiveDataHandler();
        DataHandler preparedDataHandler = new PreparedDataHandler();
        DataHandler fakeDataHandler = new FakeDataHandler();
        DataHandler errorDataHandler = new ErrorDataHandler();

        liveDataHandler.setNextDataHandler(preparedDataHandler);
        preparedDataHandler.setNextDataHandler(fakeDataHandler);
        fakeDataHandler.setNextDataHandler(errorDataHandler);

        for (DataAPI dataAPI : data) {
            liveDataHandler.handleData(dataAPI);
            System.out.println("Type of data: " + dataAPI.getTypeOfData() + " , DataFX: " +
                    dataAPI.getDataFX());
        }
    }

}