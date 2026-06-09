package com.example;

import java.util.HashMap;
import java.util.Map;

public class RomanConverter {
    private Map<Character, Integer> romanMap;
    private int[] numericValues;
    private String[] romanSymbols;
    private int REPEAT_LIMIT = 3;

    public RomanConverter() {
        this.romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        this.numericValues = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        this.romanSymbols = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    }

    public int romanToInteger(String value) {
        if (value.isEmpty() || value.equals(value.toLowerCase())) {
            throw new IllegalArgumentException("Invalid Roman value:" + value);
        }

        int integerValue = 0;
        int repeatLimit = REPEAT_LIMIT;
        for (int i = 0; i < value.length(); i++) {
            char currentLetter = value.charAt(i);
            if (!romanMap.containsKey(currentLetter)) {
                throw new IllegalArgumentException("Invalid Roman value: " + value);
            }
            int currentValue = romanMap.get(currentLetter);

            if (i + 1 < value.length()) {
                char nextLetter = value.charAt(i + 1);
                if (!romanMap.containsKey(nextLetter)) {
                    throw new IllegalArgumentException("Invalid Roman value: " + value);
                }
                int nextValue = romanMap.get(nextLetter);

                if (currentValue < nextValue) {
                    integerValue -= currentValue;
                } else {
                    integerValue += currentValue;
                }

                if (currentValue == nextValue) {
                    repeatLimit--;
                } else {
                    repeatLimit = REPEAT_LIMIT;
                }
            } else {
                integerValue += currentValue;
            }

            if (repeatLimit == 0) {
                throw new IllegalArgumentException("Invalid Roman value per repeat");
            }
        }
        return integerValue;
    }

    public String integerToRoman(int value) {
        if (value < 1 || value > 3999) {
            throw new IllegalArgumentException("Numeric value outside the specified range (1-3999):" + value);
        }

        String integerToRoman = "";
        int index = 0;

        while (value > 0) {
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
