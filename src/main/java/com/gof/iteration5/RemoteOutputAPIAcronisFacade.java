package com.gof.iteration5;

import com.gof.customer.RemoteOutputAPIAcronis;
import com.gof.customer.core.DataAPI;

public class RemoteOutputAPIAcronisFacade {

    private enum API_STATE {STARTED, SENT, STOPPED}

    private API_STATE state = API_STATE.STOPPED;

    public void start() {
        if (state != API_STATE.STOPPED) {
            throw new IllegalStateException("RemoteOutputAPIAcronis is not stopped!");
        }
        RemoteOutputAPIAcronis.initSystem();
        RemoteOutputAPIAcronis.preparingConnection();
        RemoteOutputAPIAcronis.connect();

        state = API_STATE.STARTED;
    }

    public void sendData(DataAPI dataAPI) {
        if (state != API_STATE.STARTED) {
            throw new IllegalStateException("RemoteOutputAPIAcronis is not started!");
        }
        RemoteOutputAPIAcronis.sendMX(dataAPI.getDataMX());
        RemoteOutputAPIAcronis.sendSX(dataAPI.getDataSX());
        RemoteOutputAPIAcronis.sendBX(dataAPI.getDataBX());
        RemoteOutputAPIAcronis.sendFX(dataAPI.getDataFX());

        state = API_STATE.SENT;
    }

    public void stop() {
        if (state != API_STATE.SENT) {
            throw new IllegalStateException("RemoteOutputAPIAcronis must send data before stopping!");
        }
        RemoteOutputAPIAcronis.stopSystem();
        RemoteOutputAPIAcronis.checkErrors();
        RemoteOutputAPIAcronis.disconnect();

        state = API_STATE.STOPPED;
    }
}
