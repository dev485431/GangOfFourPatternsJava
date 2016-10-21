package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
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
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();
        List<DataAPI> dataAPIList = new LinkedList<>();
        DataAPIBuilder dataABuilder = new DataABuilder();
        DataAPIBuilder dataBBuilder = new DataBBuilder();
        DataAPIBuilder dataCBuilder = new DataCBuilder();

        DataAPI dataA1 = dataABuilder.getDataAPI(1L);
        assertNotNull(dataA1);
        assertEquals(new Long(1L), dataA1.getId());
        assertTrue(dataA1.getDataMX().matches(REGEXP_ALPHABET));
        assertTrue(dataA1.getDataSX().matches(REGEXP_ALPHABET));

        DataAPI dataA2 = dataABuilder.getDataAPI(2L);
        assertNotNull(dataA2);
        assertEquals(new Long(2L), dataA2.getId());
        assertTrue(dataA2.getDataMX().matches(REGEXP_ALPHABET));
        assertTrue(dataA2.getDataSX().matches(REGEXP_ALPHABET));

        DataAPI dataB1 = dataBBuilder.getDataAPI(3L);
        assertNotNull(dataB1);
        assertEquals(new Long(3L), dataB1.getId());
        assertTrue(dataB1.getDataFX().matches(REGEXP_ALPHABET));
        assertTrue(dataB1.getDataBX().matches(REGEXP_ALPHABET));

        DataAPI dataB2 = dataBBuilder.getDataAPI(4L);
        assertNotNull(dataB2);
        assertEquals(new Long(4L), dataB2.getId());
        assertTrue(dataB2.getDataFX().matches(REGEXP_ALPHABET));
        assertTrue(dataB2.getDataBX().matches(REGEXP_ALPHABET));

        DataAPI dataC1 = dataCBuilder.getDataAPI(5L);
        assertNotNull(dataC1);
        assertEquals(new Long(5L), dataC1.getId());
        assertTrue(dataC1.getDataMX().matches(REGEXP_NUMBERS));
        assertTrue(dataC1.getDataSX().matches(REGEXP_ALPHABET));
        assertTrue(dataC1.getDataFX().matches(REGEXP_ALPHABET));
        assertTrue(dataC1.getDataBX().matches(REGEXP_NUMBERS));

        DataAPI dataC2 = dataCBuilder.getDataAPI(6L);
        assertNotNull(dataC2);
        assertEquals(new Long(6L), dataC2.getId());
        assertTrue(dataC2.getDataMX().matches(REGEXP_NUMBERS));
        assertTrue(dataC2.getDataSX().matches(REGEXP_ALPHABET));
        assertTrue(dataC2.getDataFX().matches(REGEXP_ALPHABET));
        assertTrue(dataC2.getDataBX().matches(REGEXP_NUMBERS));

        dataAPIList.add(dataA1);
        dataAPIList.add(dataA2);
        dataAPIList.add(dataB1);
        dataAPIList.add(dataB2);
        dataAPIList.add(dataC1);
        dataAPIList.add(dataC2);

        dataAPIList.forEach(remoteOutputAPITesting::setOutputData);
    }
}