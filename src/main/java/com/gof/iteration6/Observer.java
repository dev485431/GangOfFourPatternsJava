package com.gof.iteration6;

import com.gof.customer.monitors.Monitor;

public interface Observer {

    void addObserver(Monitor monitor);

    void removeObserver(Monitor monitor);

    void notifyObservers(String msg);

}
