package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import static junit.framework.Assert.*;
import static junit.framework.TestCase.assertNotNull;

public class Iteration8Test {

    private static final String REGEXP_ALPHABET = "^[a-zA-Z]*$";
    private static final String REGEXP_NUMBERS = "^[0-9]*$";

    @Test
    public void run() {
        Iteration8.run();
    }

    @Test
    public void testRun() {
        DataAPIDirector dataAPIDirector = new DataAPIDirector();
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();


        dataAPIDirector.setDataAPIBuilder(new DataABuilder());
        DataAPI dataAPI = dataAPIDirector.buildDataAPI(1L);

        assertNotNull(dataAPI);
        assertTrue(dataAPI.getClass().equals(DataA.class));
        assertEquals(new Long(1L), dataAPI.getId());
        assertNull(dataAPI.getTypeOfData());
        assertNull(dataAPI.getDataFX());
        assertNull(dataAPI.getDataBX());
        assertTrue(dataAPI.getDataMX().matches(REGEXP_ALPHABET));
        assertTrue(dataAPI.getDataSX().matches(REGEXP_ALPHABET));

        remoteOutputAPITesting.setOutputData(dataAPI);


        dataAPIDirector.setDataAPIBuilder(new DataBBuilder());
        dataAPI = dataAPIDirector.buildDataAPI(2L);

        assertNotNull(dataAPI);
        assertTrue(dataAPI.getClass().equals(DataB.class));
        assertEquals(new Long(2L), dataAPI.getId());
        assertNull(dataAPI.getTypeOfData());
        assertTrue(dataAPI.getDataFX().matches(REGEXP_ALPHABET));
        assertTrue(dataAPI.getDataBX().matches(REGEXP_ALPHABET));
        assertNull(dataAPI.getDataMX());
        assertNull(dataAPI.getDataSX());

        remoteOutputAPITesting.setOutputData(dataAPI);

        
        dataAPIDirector.setDataAPIBuilder(new DataCBuilder());
        dataAPI = dataAPIDirector.buildDataAPI(3L);

        assertNotNull(dataAPI);
        assertTrue(dataAPI.getClass().equals(DataC.class));
        assertEquals(new Long(3L), dataAPI.getId());
        assertNull(dataAPI.getTypeOfData());
        assertTrue(dataAPI.getDataFX().matches(REGEXP_ALPHABET));
        assertTrue(dataAPI.getDataBX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataMX().matches(REGEXP_NUMBERS));
        assertTrue(dataAPI.getDataSX().matches(REGEXP_ALPHABET));
    }
}