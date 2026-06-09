package com.example;

import java.util.HashMap;
import java.util.Map;

public class RomanConverter {
    Map<Character, Integer> romanMap;
    int[] numericValues;
    String[] romanSymbols;

    public RomanConverter() {
        this.romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        this.numericValues = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        this.romanSymbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
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
        String integerToRoman = "";
        int index = 0;

        while(value > 0) {
            if (value >= this.numericValues[index]) {
                integerToRoman += this.romanSymbols[index];
                value -= this.numericValues[index];
            } else {
                index++;
            }
        }
        return integerToRoman;
    }
}
