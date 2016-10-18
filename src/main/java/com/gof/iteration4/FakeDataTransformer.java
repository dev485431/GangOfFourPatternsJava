package com.gof.iteration4;

public class FakeDataTransformer implements DataTransformer {
    private static final String REPLACE_FROM = "0";
    private static final String REPLACE_TO = "#";

    @Override
    public String transform(String s) {
        return s.replace(REPLACE_FROM, REPLACE_TO);
    }
}
