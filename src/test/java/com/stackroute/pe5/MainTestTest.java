package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest mainTest;

    /* This methods runs, before running any one of the test case .
    It is used to initialize the required variables
 */
    @Before
    public void setup()
    {
//        arrange
        mainTest= new MainTest();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown()
    {
        mainTest= null;
    }

    @Test
    public void givenStudentArrayListShouldReturnSortedArrayList()
    {
//        act

    }
}