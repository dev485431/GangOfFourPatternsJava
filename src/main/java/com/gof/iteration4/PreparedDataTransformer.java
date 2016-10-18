package com.gof.iteration4;

public class PreparedDataTransformer implements DataTransformer {
    private static final String REPLACE_FROM = "0";
    private static final String REPLACE_TO = "358";

    @Override
    public String transform(String s) {
        return s.replace(REPLACE_FROM, REPLACE_TO);
    }
}
