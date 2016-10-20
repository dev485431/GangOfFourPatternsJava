package com.gof.iteration7;

public class DataAPIFactoryCreator {

    public enum TypeOfDateAPI {LIGHT, HEAVY}

    private static final String ERROR_UNKNOWN_FACTORY = "Factory type not implemented";

    public static AbstractDataAPIFactory getFactory(TypeOfDateAPI typeOfDateAPI) {
        switch (typeOfDateAPI) {
            case LIGHT:
                return new LightDataAPIFactory();

            case HEAVY:
                return new HeavyDataAPIFactory();

            default:
                throw new IllegalArgumentException(ERROR_UNKNOWN_FACTORY);
        }
    }
}
