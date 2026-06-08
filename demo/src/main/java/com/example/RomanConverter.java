package com.example;

import java.util.HashMap;
import java.util.Map;

public class RomanConverter {
    Map<Character, Integer> romanMap;

    public RomanConverter() {
        this.romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInteger(String value) {
        int integerValue = 0;
        for (int i = 0; i < value.length(); i++) {
            char currentLetter = value.charAt(i);
            int currentValue = romanMap.get(currentLetter);

            if (i + 1 < value.length()) {
                char nextLetter = value.charAt(i + 1);
                if (currentValue < romanMap.get(nextLetter)) {
                    integerValue -= currentValue;
                } else {
                    integerValue += currentValue;
                }
            } else {
                integerValue += currentValue;
            }
        }
        return integerValue;
    }

    public String integerToRoman(int value) {
        return "";
    }
}
