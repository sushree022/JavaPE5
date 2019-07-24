package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckingRepeatWordsInArray {
    public HashMap<String, Boolean> repeatWordChecking(String input) {
//splitting string input and converting it into list
        List<String> inputList = Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> compareList = new HashMap<String, Integer>();
        HashMap<String, Boolean> result = new HashMap<String, Boolean>();
//        logic to put key and value in map
        for (String each : inputList) {
            if (compareList.containsKey(each)) {
                compareList.put(each, compareList.get(each) + 1);
            } else
                compareList.put(each, 1);
        }
//        to compare number of occurrence of key
        for (String each : compareList.keySet()) {
            if (compareList.get(each) > 1) {
                result.put(each, true);
            } else result.put(each, false);
        }
        return result;
    }
}
