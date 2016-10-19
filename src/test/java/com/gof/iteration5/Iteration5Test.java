package com.gof.iteration5;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.List;

public class Iteration5Test {

    private Channel2 channel2 = new Channel2();

    @Test
    public void run() {
        Iteration5.run();
    }

    @Test
    public void testRun() {
        List<DataAPI> dataAPIList = channel2.getDataAPI();
        RemoteOutputAPIAcronisFacade remoteApiFacade = new RemoteOutputAPIAcronisFacade();
        dataAPIList.forEach(dataAPI -> {
            remoteApiFacade.start();
            remoteApiFacade.sendData(dataAPI);
            remoteApiFacade.stop();
        });
    }

    @Test(expected = IllegalStateException.class)
    public void testRunDataNotSent() {
        List<DataAPI> dataAPIList = channel2.getDataAPI();
        RemoteOutputAPIAcronisFacade remoteApiFacade = new RemoteOutputAPIAcronisFacade();
        dataAPIList.forEach(dataAPI -> {
            remoteApiFacade.start();
            remoteApiFacade.stop();
        });
    }

    @Test(expected = IllegalStateException.class)
    public void testRunIncorrectOrder() {
        List<DataAPI> dataAPIList = channel2.getDataAPI();
        RemoteOutputAPIAcronisFacade remoteApiFacade = new RemoteOutputAPIAcronisFacade();
        dataAPIList.forEach(dataAPI -> {
            remoteApiFacade.stop();
            remoteApiFacade.start();
            remoteApiFacade.sendData(dataAPI);
        });
    }

    @Test(expected = IllegalStateException.class)
    public void testRunNotStarted() {
        List<DataAPI> dataAPIList = channel2.getDataAPI();
        RemoteOutputAPIAcronisFacade remoteApiFacade = new RemoteOutputAPIAcronisFacade();
        dataAPIList.forEach(dataAPI -> {
            remoteApiFacade.sendData(dataAPI);
            remoteApiFacade.stop();
        });
    }
}