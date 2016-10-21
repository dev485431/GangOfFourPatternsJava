package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

import java.util.Random;

public abstract class DataAPIBuilder {

    protected final static String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    protected final static String NUMBERS = "0123456789";
    protected final static int MAX_LENGTH = 15;

    protected DataAPI dataAPI;

    public DataAPI getDataAPI() {
        return dataAPI;
    }

    public abstract void buildDataAPI(Long id);

    public void setDataFX() {
    }

    public void setDataBX() {
    }

    public void setDataMX() {
    }

    public void setDataSX() {
    }

    public static String generateRandomString(String chars) {
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < MAX_LENGTH; i++) {
            int charIndex = new Random().nextInt(chars.length());
            randomString.append(chars.charAt(charIndex));
        }
        return randomString.toString();
    }
}
