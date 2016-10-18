package com.gof.iteration4;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class TransformContext {

    private static final String EXCEPTION_WRONG_DATA_TYPE = "Unknown TypeOfData";
    private DataTransformer dataTransformer;

    public void doTransform(DataAPI api) {
        dataTransformer = chooseStrategy(api.getTypeOfData());
        api.setDataFX(dataTransformer.transform(api.getDataMX() + api.getDataSX() + api.getDataBX() + api.getDataFX()));
    }

    private DataTransformer chooseStrategy(TypeOfData typeOfData) {
        DataTransformer dataTransformer;
        switch (typeOfData) {
            case LIVE:
                dataTransformer = new LiveDataTransformer();
                break;

            case PREPARED:
                dataTransformer = new PreparedDataTransformer();
                break;

            case FAKE:
                dataTransformer = new FakeDataTransformer();
                break;

            case ERR:
                dataTransformer = new ErrorDataTransformer();
                break;
            default:
                throw new IllegalArgumentException(EXCEPTION_WRONG_DATA_TYPE);
        }
        return dataTransformer;
    }
}
