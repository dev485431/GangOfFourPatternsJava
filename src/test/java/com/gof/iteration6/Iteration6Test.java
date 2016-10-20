package com.gof.iteration6;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import com.gof.customer.monitors.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Iteration6Test {

    @Test
    public void run() {
        Iteration6.run();
    }

    @Test
    public void testRun() {
        Channel2 dataSource = new Channel2();
        List<DataAPI> dataAPIs = dataSource.getDataAPI();

        RemoteOutputAPIAcronisObserver acronisObserver = new RemoteOutputAPIAcronisObserver();
        Monitor monitorFR = new MonitorFR(),
                monitorSE = new MonitorSE(),
                monitorUK = new MonitorUK(),
                monitorUS = new MonitorUS();

        List<Monitor> initialObservers = new LinkedList<>();
        initialObservers.add(monitorFR);
        initialObservers.add(monitorSE);
        initialObservers.add(monitorUK);
        initialObservers.add(monitorUS);

        initialObservers.forEach(o -> acronisObserver.addObserver(o));
        List<Monitor> actualObservers = acronisObserver.getObservers();
        assertEquals(initialObservers, actualObservers);

        dataAPIs.forEach(api -> acronisObserver.sendMessages(api));

        acronisObserver.removeObserver(monitorFR);
        acronisObserver.removeObserver(monitorSE);
        assertFalse(actualObservers.equals(initialObservers));

        dataAPIs.forEach(api -> acronisObserver.sendMessages(api));

        acronisObserver.addObserver(monitorFR);
        acronisObserver.addObserver(monitorSE);
        assertTrue(actualObservers.containsAll(initialObservers) && initialObservers.containsAll(actualObservers));

        dataAPIs.forEach(api -> acronisObserver.sendMessages(api));
    }
}
