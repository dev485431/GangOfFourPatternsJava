package com.gof.iteration4;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class TransformContext {

    private static final String EXCEPTION_WRONG_DATA_TYPE = "Unknown TypeOfData";
    private AbstractDataTransformer dataTransformer;

    public void doTransform(DataAPI api) {
        dataTransformer = chooseStrategy(api.getTypeOfData());
        api.setDataFX(dataTransformer.transform(getInputString(api)));
    }

    private AbstractDataTransformer chooseStrategy(TypeOfData typeOfData) {
        AbstractDataTransformer dataTransformer;
        switch (typeOfData) {
            case LIVE:
                dataTransformer = new LiveDataTransformer(typeOfData);
                break;

            case PREPARED:
                dataTransformer = new PreparedDataTransformer(typeOfData);
                break;

            case FAKE:
                dataTransformer = new FakeDataTransformer(typeOfData);
                break;

            case ERR:
                dataTransformer = new ErrorDataTransformer(typeOfData);
                break;
            default:
                throw new IllegalArgumentException(EXCEPTION_WRONG_DATA_TYPE);
        }
        return dataTransformer;
    }

    public String getInputString(DataAPI api) {
        return api.getDataMX() + api.getDataSX() + api.getDataBX() + api.getDataFX();
    }

    public AbstractDataTransformer getDataTransformer() {
        return dataTransformer;
    }

}
