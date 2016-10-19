package com.gof.iteration6;

import com.gof.customer.monitors.Monitor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AbstractSubject {

    protected volatile List<Monitor> observers = new CopyOnWriteArrayList<>();

    protected void addObserver(Monitor monitor) {
        observers.add(monitor);
    }

    protected void removeObserver(Monitor monitor) {
        observers.remove(monitor);
    }

    public List<Monitor> getObservers() {
        return observers;
    }
}
