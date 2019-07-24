package com.stackroute.pe5;

import java.util.*;

public class CountingWordsOfAString {
    public HashMap<String, Integer> numberOfOccurrenceOfAWord(String input) {
//        splitting string input and converting it into list
        List<String> inputList = Arrays.asList(input.split("[\\W_]+"));
        HashMap<String, Integer> result = new HashMap<String, Integer>();
//        logic to add key and value in map
        for (String each : inputList) {
            if (result.containsKey(each)) {
                result.put(each, result.get(each) + 1);
            } else
                result.put(each, 1);
        }
        return result;
    }
}
