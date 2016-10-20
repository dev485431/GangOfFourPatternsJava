package com.gof.iteration6;

import com.gof.customer.RemoteOutputAPIAcronis;
import com.gof.customer.core.DataAPI;
import com.gof.customer.monitors.Monitor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoteOutputAPIAcronisObserver implements Observer {

    private List<Monitor> observers;

    public RemoteOutputAPIAcronisObserver() {
        observers = new CopyOnWriteArrayList<>();
    }

    public void sendMessages(DataAPI dataAPI) {
        sendFX(dataAPI.getDataFX());
        sendBX(dataAPI.getDataBX());
        sendMX(dataAPI.getDataMX());
        sendSX(dataAPI.getDataSX());
    }

    public void sendBX(String msg) {
        RemoteOutputAPIAcronis.sendBX(msg);
        notifyObservers("msgBX: " + msg);
    }

    public void sendFX(String msg) {
        RemoteOutputAPIAcronis.sendFX(msg);
        notifyObservers("msgFX: " + msg);
    }

    public void sendMX(String msg) {
        RemoteOutputAPIAcronis.sendMX(msg);
        notifyObservers("msgMX: " + msg);
    }

    public void sendSX(String msg) {
        RemoteOutputAPIAcronis.sendSX(msg);
        notifyObservers("msgSX: " + msg);
    }

    @Override
    public void addObserver(Monitor monitor) {
        observers.add(monitor);
    }

    @Override
    public void removeObserver(Monitor monitor) {
        observers.remove(monitor);
    }

    @Override
    public void notifyObservers(String msg) {
        observers.forEach(o -> o.showMessage(msg));
    }

    public List<Monitor> getObservers() {
        return observers;
    }
}
