package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapModificationTest {
    MapModification mapModification;

    /* This methods runs, before running any one of the test case .
    It is used to initialize the required variables
 */
    @Before
    public void setup() {
//        arrange
        mapModification = new MapModification();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown() {
        mapModification = null;
    }

    @Test
    public void givenMapShouldReturnModifiedMap() {
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        HashMap<String, String> actualResult = new HashMap<String, String>();
        actualResult = mapModification.mapValueModified(input);
        HashMap<String, String> expectedResult = new HashMap<String, String>();
        expectedResult.put("val1", " ");
        expectedResult.put("val2", "java");

        assertEquals(expectedResult, actualResult);
    }
}