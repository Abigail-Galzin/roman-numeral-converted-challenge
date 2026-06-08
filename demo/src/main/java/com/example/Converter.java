package com.example;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    public int romanToInteger(String value) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        if(value.length() >= 2) {
            int total = 0;
            for (int i = 0; i < value.length(); i++) {
                char currentLetter = value.charAt(i);
                total += romanMap.get(currentLetter);
            }
            return total;
        } else {
            return romanMap.get(value.charAt(0));
        }
    }
}
