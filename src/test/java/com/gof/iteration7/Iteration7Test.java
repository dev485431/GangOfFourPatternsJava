package com.gof.iteration7;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertNotNull;

public class Iteration7Test {

    private static final String REGEXP_ALPHABET = "^[a-zA-Z]*$";
    private static final String REGEXP_NUMBERS = "^[0-9]*$";

    @Test
    public void run() {
        Iteration7.run();
    }

    @Test
    public void testRun() {
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();
        AbstractDataAPIFactory lightDataAPIFactory = DataAPIFactoryCreator.getFactory(DataAPIFactoryCreator
                .TypeOfDateAPI.LIGHT);
        AbstractDataAPIFactory heavyDataAPIFactory = DataAPIFactoryCreator.getFactory(DataAPIFactoryCreator
                .TypeOfDateAPI.HEAVY);

        assertNotNull(lightDataAPIFactory);
        assertNotNull(heavyDataAPIFactory);

        DataAPI dataAPI = lightDataAPIFactory.getDataAPI(1L, TypeOfData.LIVE);

        assertNotNull(dataAPI);
        assertEquals(new Long(1L), dataAPI.getId());
        assertEquals(TypeOfData.LIVE, dataAPI.getTypeOfData());
        assertTrue(dataAPI.getDataFX().matches(REGEXP_ALPHABET));
        assertNull(dataAPI.getDataBX());
        assertNull(dataAPI.getDataMX());
        assertNull(dataAPI.getDataSX());

        remoteOutputAPITesting.setOutputData(dataAPI);

        dataAPI = lightDataAPIFactory.getDataAPI(2L, TypeOfData.PREPARED);

        assertNotNull(dataAPI);
        assertEquals(new Long(2L), dataAPI.getId());
        assertEquals(TypeOfData.PREPARED, dataAPI.getTypeOfData());
        assertTrue(dataAPI.getDataFX().matches(REGEXP_ALPHABET));
        assertNull(dataAPI.getDataBX());
        assertNull(dataAPI.getDataMX());
        assertNull(dataAPI.getDataSX());

        remoteOutputAPITesting.setOutputData(dataAPI);

        dataAPI = heavyDataAPIFactory.getDataAPI(3L, TypeOfData.FAKE);

        assertNotNull(dataAPI);
        assertEquals(new Long(3L), dataAPI.getId());
        assertEquals(TypeOfData.FAKE, dataAPI.getTypeOfData());
        assertTrue(dataAPI.getDataFX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataBX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataMX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataSX().matches(REGEXP_NUMBERS));

        remoteOutputAPITesting.setOutputData(dataAPI);

        dataAPI = heavyDataAPIFactory.getDataAPI(4L, TypeOfData.ERR);

        assertNotNull(dataAPI);
        assertEquals(new Long(4L), dataAPI.getId());
        assertEquals(TypeOfData.ERR, dataAPI.getTypeOfData());
        assertTrue(dataAPI.getDataFX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataBX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataMX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataSX().matches(REGEXP_NUMBERS));

        remoteOutputAPITesting.setOutputData(dataAPI);
    }
}