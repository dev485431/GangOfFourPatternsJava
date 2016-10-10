package com.gof.iteration1;

import com.gof.customer.RemoteInputAPI;
import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;

public class Iteration1 {

    public static void run() {
        DataAPI input = (new RemoteInputAPI()).getInputData();
        RemoteOutputAPI output = RemoteOutputAPISingleton.getInstance();
        output.setOutputData(input);
    }

}
