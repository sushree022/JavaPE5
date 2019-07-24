package com.stackroute.pe5;

import java.util.HashMap;

public class MapModification {
    public HashMap<String, String> mapValueModified(HashMap<String, String> input) {
//        to replace the value
        input.put("val2", input.get("val1"));
        input.put("val1", " ");
        return input;
    }
}
