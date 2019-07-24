package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortNames {
    public ArrayList<String> sortingUnOrderedNames(String input) {
//        input string is splited
        String[] inputArray = input.split(" ");
        TreeSet<String> sortedResult = new TreeSet<String>();
        ArrayList<String> result = new ArrayList<String>();
//        logic to add elements in tree set
        for (String i : inputArray) {

            sortedResult.add(i);
        }
//        to add elements of tree set to array list
        result.addAll(sortedResult);
        return result;
    }
}
