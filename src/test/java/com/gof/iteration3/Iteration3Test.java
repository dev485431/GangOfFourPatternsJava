package com.gof.iteration3;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class Iteration3Test {

    @Test
    public void run() {
        Iteration3.run();
    }

    @Test
    public void testRun() {

        Channel2 dataSource = new Channel2();
        List<DataAPI> data = dataSource.getDataAPI();
        assertNotNull(data);

        data.forEach(api -> {
            api.setResultX(api.getDataFX() + api.getDataMX() + api.getDataSX() + api.getDataBX());
            assertTrue((api.getDataFX() + api.getDataMX() + api.getDataSX() + api.getDataBX())
                    .equals(api.getResultX()));
        });

        DataAPISequence dataAPISequence = new DataAPIAdapter(data);
        assertTrue(data.size() == dataAPISequence.countAPIs());

        for (int i = 0; i < data.size(); i++) {
            assertTrue(data.get(i).equals(dataAPISequence.getAPIByIndex(i)));
        }
    }
}