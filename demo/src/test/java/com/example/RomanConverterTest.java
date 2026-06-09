package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanConverterTest {
    private RomanConverter romanConverter;
    @BeforeEach
    public void setUp() {
        this.romanConverter = new RomanConverter();
    }

    @Test
    public void testConverter() {
        int result = romanConverter.romanToInteger("I");
        assertEquals(1, result);
    }

    @Test
    public void testConverter2() {
        int result = romanConverter.romanToInteger("II");
        assertEquals(2, result);
    }

    @Test
    public void testConverter3() {
        int result = romanConverter.romanToInteger("III");
        assertEquals(3, result);
    }

    @Test
    public void testConverter5() {
        int result = romanConverter.romanToInteger("V");
        assertEquals(5, result);
    }

    @Test
    public void testConverter6() {
        int result = romanConverter.romanToInteger("VI");
        assertEquals(6, result);
    }

    @Test
    public void testConverter10() {
        int result = romanConverter.romanToInteger("X");
        assertEquals(10, result);
    }

    @Test
    public void testConverter12() {
        int result = romanConverter.romanToInteger("XIII");
        assertEquals(13, result);
    }

    @Test
    public void testConverter31() {
        int result = romanConverter.romanToInteger("XXXI");
        assertEquals(31, result);
    }

    @Test
    public void testConverter50() {
        int result = romanConverter.romanToInteger("L");
        assertEquals(50, result);
    }

    @Test
    public void testConverter55() {
        int result = romanConverter.romanToInteger("LV");
        assertEquals(55, result);
    }

    @Test
    public void testConverter60() {
        int result = romanConverter.romanToInteger("LX");
        assertEquals(60, result);
    }

    @Test
    public void testConverter68() {
        int result = romanConverter.romanToInteger("LXVIII");
        assertEquals(68, result);
    }

    @Test
    public void testConverter100() {
        int result = romanConverter.romanToInteger("C");
        assertEquals(100, result);
    }

    @Test
    public void testConverter500() {
        int result = romanConverter.romanToInteger("D");
        assertEquals(500, result);
    }

    @Test
    public void testConverter1000() {
        int result = romanConverter.romanToInteger("M");
        assertEquals(1000, result);
    }

    @Test
    public void testConverter1001() {
        int result = romanConverter.romanToInteger("MI");
        assertEquals(1001, result);
    }

    @Test
    public void testConverterSubstract4() {
        int result = romanConverter.romanToInteger("IV");
        assertEquals(4, result);
    }

    @Test
    public void testConverterSubstract9() {
        int result = romanConverter.romanToInteger("IX");
        assertEquals(9, result);
    }

    @Test
    public void testConverterSubstractL() {
        int result = romanConverter.romanToInteger("XL");
        assertEquals(40, result);
    }

    @Test
    public void testConverterSubstractXC() {
        int result = romanConverter.romanToInteger("XC");
        assertEquals(90, result);
    }

    @Test
    public void testConverterSubstract99() {
        int result = romanConverter.romanToInteger("XCIX");
        assertEquals(99, result);
    }

    @Test
    public void testConverterSubstractBigNumber() {
        int result = romanConverter.romanToInteger("MCCXXXIV");
        assertEquals(1234, result);
    }

    @Test
    public void testConverterSubstractBigNumber2() {
        int result = romanConverter.romanToInteger("CMXCIX");
        assertEquals(999, result);
    }

    @Test
    public void testConverterSubstractBigNumber3() {
        int result = romanConverter.romanToInteger("MCMXLIV");
        assertEquals(1944, result);
    }

    @Test
    public void testConverterIntegerToRoman() {
        String result = romanConverter.integerToRoman(1);
        assertEquals("I", result);
    }

    @Test
    public void testConverterIntegerToRoman2() {
        String result = romanConverter.integerToRoman(2);
        assertEquals("II", result);
    }

    @Test
    public void testConverterIntegerToRoman3() {
        String result = romanConverter.integerToRoman(3);
        assertEquals("III", result);
    }

    @Test
    public void testConverterIntegerToRoman5() {
        String result = romanConverter.integerToRoman(5);
        assertEquals("V", result);
    }

    @Test
    public void testConverterIntegerToRomanAddition() {
        String result = romanConverter.integerToRoman(6);
        assertEquals("VI", result);
    }

    @Test
    public void testConverterIntegerToRomanAddition7() {
        String result = romanConverter.integerToRoman(8);
        assertEquals("VIII", result);
    }

    @Test
    public void testConverterIntegerToRomanAdditionX() {
        String result = romanConverter.integerToRoman(13);
        assertEquals("XIII", result);
    }

    @Test
    public void testConverterIntegerToRomanL() {
        String result = romanConverter.integerToRoman(50);
        assertEquals("L", result);
    }

    @Test
    public void testConverterIntegerToRomanAdditionL() {
        String result = romanConverter.integerToRoman(58);
        assertEquals("LVIII", result);
    }

    @Test
    public void testConverterIntegerToRomanC() {
        String result = romanConverter.integerToRoman(100);
        assertEquals("C", result);
    }

    @Test
    public void testConverterIntegerToRomanAdditionC() {
        String result = romanConverter.integerToRoman(189);
        assertEquals("CLXXXIX", result);
    }

    @Test
    public void testConverterIntegerToRomanM() {
        String result = romanConverter.integerToRoman(1000);
        assertEquals("M", result);
    }

    @Test
    public void testConverterIntegerToRomanAdditionM() {
        String result = romanConverter.integerToRoman(1588);
        assertEquals("MDLXXXVIII", result);
    }
}
