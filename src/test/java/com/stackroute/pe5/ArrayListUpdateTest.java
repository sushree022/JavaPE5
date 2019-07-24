package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate arrayListUpdate;


    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
    */
    @Before
    public void setup() {
//        arrange
        arrayListUpdate = new ArrayListUpdate();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown() {
        arrayListUpdate = null;
    }

    @Test
    public void givenStringShouldReplaceArrayElementOfAnArrayList() {
//        act
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Grape");
        fruitList.add("Melon");
        fruitList.add("Berry");
        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("Kiwi");
        expectedResult.add("Grape");
        expectedResult.add("Melon");
        expectedResult.add("Berry");
//        assert
        ArrayList actualResult = arrayListUpdate.updateArrayList(fruitList, "Apple", "Kiwi");
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void givenArrayListShouldReturnEmptyArrayList() {
        //        act
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Grape");
        fruitList.add("Melon");
        fruitList.add("Berry");
        ArrayList<String> expectedResult = new ArrayList<String>();
//        assert
        ArrayList actualResult = arrayListUpdate.clearArrayList(fruitList);
        assertEquals(expectedResult, actualResult);
    }


    @Test(expected = NullPointerException.class)
    public void givenEmptyArrayListShouldReturnNullPointerException() {
        this.arrayListUpdate.clearArrayList(null);
    }

}