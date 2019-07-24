package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortNamesTest {
    SortNames sortNames;

    /* This methods runs, before running any one of the test case .
     It is used to initialize the required variables
  */
    @Before
    public void setup() {
//        arrange
        sortNames = new SortNames();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown() {
        sortNames = null;
    }


    @Test
    public void givenStringOfUnOrderedNamesShouldReturnArrayListOfOrderedNames() {
//        act
        String input = "Harry Olive Alice Bluto Eugene";
        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");
        ArrayList actualResult = sortNames.sortingUnOrderedNames(input);
//        assert
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException() {
        this.sortNames.sortingUnOrderedNames(null);
    }
}