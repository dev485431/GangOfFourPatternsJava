package com.gof.iteration2;

import com.gof.customer.core.Channel1;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class Iteration2Test {

    @Test
    public void run() {
        Iteration2.run();
    }

    @Test
    public void testRun() {

        Channel1 dataSource = new Channel1();
        List<DataAPI> inputData = dataSource.getDataAPI();
        assertNotNull(inputData);

        DataHandler liveDataHandler = new LiveDataHandler();
        DataHandler preparedDataHandler = new PreparedDataHandler();
        DataHandler fakeDataHandler = new FakeDataHandler();
        DataHandler errorDataHandler = new ErrorDataHandler();

        liveDataHandler.setNextDataHandler(preparedDataHandler);
        preparedDataHandler.setNextDataHandler(fakeDataHandler);
        fakeDataHandler.setNextDataHandler(errorDataHandler);

        for (DataAPI dataAPI : inputData) {
            liveDataHandler.handleData(dataAPI);
            assertTrue(dataAPI.getDataFX().endsWith(Suffix.map.get(dataAPI.getTypeOfData())));
        }
    }
}