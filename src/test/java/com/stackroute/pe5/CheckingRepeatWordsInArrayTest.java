package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CheckingRepeatWordsInArrayTest {
    CheckingRepeatWordsInArray checkingRepeatWordsInArray;

    /* This methods runs, before running any one of the test case .
      It is used to initialize the required variables
   */
    @Before
    public void setup() {
//        arrange
        checkingRepeatWordsInArray = new CheckingRepeatWordsInArray();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown() {
        checkingRepeatWordsInArray = null;
    }

    @Test
    public void givenArrayOfStringsShouldReturnMap() {

        Map<String, Boolean> expectedResult = new HashMap<String, Boolean>();
        String input = "a, b, c, d, a, c, c";
        Map actualResult = checkingRepeatWordsInArray.repeatWordChecking(input);
        expectedResult.put("a", true);
        expectedResult.put("b", false);
        expectedResult.put("c", true);
        expectedResult.put("d", false);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException() {
        this.checkingRepeatWordsInArray.repeatWordChecking(null);
    }
}