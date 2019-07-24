package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountingWordsOfAStringTest {
    CountingWordsOfAString countingWordsOfAString;


    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
    */
    @Before
    public void setup() {
//        arrange
        countingWordsOfAString = new CountingWordsOfAString();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown() {
        countingWordsOfAString = null;
    }

    @Test
    public void givenStringShouldReturnAMapList()
    {
//        act
        String input= "one one-one___two,,three,one @three*one?two";
        Map<Integer,String> expectedResult= new HashMap<Integer, String>();
        expectedResult.put(5,"one");
        expectedResult.put(2,"two");
        expectedResult.put(2,"three");
        Map actualResult=countingWordsOfAString.numberOfOccurrenceOfAWord(input);
//        assert
        assertEquals(expectedResult,actualResult);
    }

}