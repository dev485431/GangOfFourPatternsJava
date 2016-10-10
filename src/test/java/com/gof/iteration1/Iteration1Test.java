package com.gof.iteration1;

import com.gof.customer.RemoteInputAPI;
import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class Iteration1Test {

    @Test
    public void test() {
        Iteration1.run();
    }

    @Test
    public void testRun() {
        DataAPI input = (new RemoteInputAPI()).getInputData();
        assertNotNull(input);

        RemoteOutputAPI output1 = RemoteOutputAPISingleton.getInstance();
        output1.setOutputData(input);

        RemoteOutputAPI output2 = RemoteOutputAPISingleton.getInstance();
        assertTrue(output1 == output2);
    }
}
