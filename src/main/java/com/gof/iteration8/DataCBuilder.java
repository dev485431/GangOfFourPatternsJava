package com.gof.iteration8;

public class DataCBuilder extends DataAPIBuilder {

    public void buildDataAPI(Long id) {
        dataAPI = new DataC(id);
    }

    @Override
    public void setDataMX() {
        dataAPI.setDataMX(generateRandomString(NUMBERS));
    }

    @Override
    public void setDataSX() {
        dataAPI.setDataSX(generateRandomString(ALPHABET));
    }

    @Override
    public void setDataFX() {
        dataAPI.setDataFX(generateRandomString(ALPHABET));
    }

    @Override
    public void setDataBX() {
        dataAPI.setDataBX(generateRandomString(NUMBERS));
    }

}
