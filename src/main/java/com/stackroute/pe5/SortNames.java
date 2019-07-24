package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortNames {
    public ArrayList<String> sortingUnOrderedNames(String input)
    {
        String[] inputArray = input.split(" ");
        TreeSet<String> sortedResult= new TreeSet<String>();
        ArrayList<String> result = new ArrayList<String>();

        for(String i:inputArray) {

            sortedResult.add(i);
        }
        result.addAll(sortedResult);
        return result;
    }
}
