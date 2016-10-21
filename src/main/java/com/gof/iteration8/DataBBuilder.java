package com.gof.iteration8;

public class DataBBuilder extends DataAPIBuilder {

    public void buildDataAPI(Long id) {
        dataAPI = new DataB(id);
    }

    @Override
    public void setDataFX() {
        dataAPI.setDataFX(generateRandomString(ALPHABET));
    }

    @Override
    public void setDataBX() {
        dataAPI.setDataBX(generateRandomString(ALPHABET));
    }

}
