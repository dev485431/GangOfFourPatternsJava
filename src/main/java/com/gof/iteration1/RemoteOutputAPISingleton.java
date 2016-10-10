package com.gof.iteration1;

import com.gof.customer.RemoteOutputAPI;

public class RemoteOutputAPISingleton {

    private static RemoteOutputAPI instance = null;

    private RemoteOutputAPISingleton() {
    }

    public static synchronized RemoteOutputAPI getInstance() {
        if (instance == null) {
            instance = new RemoteOutputAPI();
        }
        return instance;
    }

}
