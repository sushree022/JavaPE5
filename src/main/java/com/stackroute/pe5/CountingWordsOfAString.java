package com.stackroute.pe5;

import java.util.*;

public class CountingWordsOfAString {
    public HashMap<String,Integer> numberOfOccurrenceOfAWord(String input)
    {
        List<String> inputList= Arrays.asList(input.split("[\\W_]+"));
        //String[] inputArray= input.split("[\\W_]");
        Map<String,Integer>result=new HashMap<String, Integer>();

        for (String each: inputList)
        {
            if(result.containsKey(each))
            {
                result.put(each,result.get(each)+1);
            }
            else
                result.put(each,1);
        }
        return (HashMap<String, Integer>) result;
    }

}
