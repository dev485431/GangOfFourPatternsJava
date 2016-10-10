package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class FakeDataHandler extends DataHandler {

    @Override
    public void handleData(DataAPI dataAPI) {
        if (dataAPI.getTypeOfData() == TypeOfData.FAKE) {
            dataAPI.setDataFX(dataAPI.getDataFX() + Suffix.map.get(dataAPI.getTypeOfData()));
        } else if (nextDataHandler != null) {
            nextDataHandler.handleData(dataAPI);
        }
    }
}