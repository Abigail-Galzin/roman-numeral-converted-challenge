package com.example;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    public int romanToInteger(String value) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("II", 2);
        romanMap.put("III", 3);
        romanMap.put("V", 5);

        return romanMap.get(value);
    }
}
