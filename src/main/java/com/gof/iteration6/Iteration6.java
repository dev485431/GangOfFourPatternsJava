package com.gof.iteration6;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import com.gof.customer.monitors.*;

import java.util.LinkedList;
import java.util.List;

public class Iteration6 {

    public static void run() {
        Channel2 dataSource = new Channel2();
        List<DataAPI> dataAPIs = dataSource.getDataAPI();

        List<Monitor> observers = new LinkedList<>();
        observers.add(new MonitorFR());
        observers.add(new MonitorSE());
        observers.add(new MonitorUK());
        observers.add(new MonitorUS());

        RemoteOutputAPIAcronisObserver acronisObserver = new RemoteOutputAPIAcronisObserver();
        observers.forEach(acronisObserver::addObserver);

        dataAPIs.forEach(acronisObserver::sendMessages);
    }

}
