package com.gof.iteration6;

import com.gof.customer.monitors.Monitor;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {

    protected volatile List<Monitor> observers = new ArrayList<>();

    protected void addObserver(Monitor monitor) {
        synchronized (observers) {
            observers.add(monitor);
        }
    }

    protected void removeObserver(Monitor monitor) {
        synchronized (observers) {
            observers.remove(monitor);
        }
    }

    public synchronized List<Monitor> getObservers() {
        return observers;
    }
}
