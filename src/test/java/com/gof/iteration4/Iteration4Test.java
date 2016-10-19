package com.gof.iteration4;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class Iteration4Test {

    @Test
    public void run() {
        Iteration4.run();
    }

    @Test
    public void testRun() {
        Channel2 dataSource = new Channel2();
        List<DataAPI> data = dataSource.getDataAPI();
        assertNotNull(data);

        TransformContext transformContext = new TransformContext();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();

        data.forEach(api -> {
            transformContext.doTransform(api);
            assertTrue(api.getTypeOfData() == transformContext.getDataTransformer().getTypeOfData());
            remoteOutputAPI.setOutputData(api);
        });
    }

}