package com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayListUpdate {
    public ArrayList<String> updateArrayList(ArrayList<String> inputArray, String oldElement, String newElement)
    {
//        to get index of element which is to be replaced
        int indexOfOldElement = inputArray.indexOf(oldElement);
//        to replace old element with new one
        inputArray.set(indexOfOldElement, newElement);
        return inputArray;
    }
    public ArrayList<String> clearArrayList(ArrayList<String> inputArray)
    {
//        to clear the elements of input array
        inputArray.clear();
        return inputArray;
    }
}
