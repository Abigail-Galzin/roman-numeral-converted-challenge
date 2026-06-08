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
        romanMap.put("X", 10);

        if(value.length() >= 2) {
            int total = 0;
            for (int i = 0; i < value.length(); i++) {
                if(value.charAt(i) == 'I') {
                    total += 1;
                }
                if(value.charAt(i) == 'V') {
                    total += 5;
                }
                if(value.charAt(i) == 'X') {
                    total += 10;
                }
            }
            return total;
        } else {
            return romanMap.get(value);
        }
    }
}
