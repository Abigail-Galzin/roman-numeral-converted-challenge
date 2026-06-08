package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    private Converter converter;
    @BeforeEach
    public void setUp() {
        this.converter = new Converter();
    }
    @Test
    public void testConverter() {
        int resultado = converter.romanToInteger("I");
        assertEquals(1, resultado);
    }

    @Test
    public void testConverter2() {
        int resultado = converter.romanToInteger("II");
        assertEquals(2, resultado);
    }

    @Test
    public void testConverter3() {
        int resultado = converter.romanToInteger("III");
        assertEquals(3, resultado);
    }

    @Test
    public void testConverter5() {
        int resultado = converter.romanToInteger("V");
        assertEquals(5, resultado);
    }

    @Test
    public void testConverter6() {
        int resultado = converter.romanToInteger("VI");
        assertEquals(6, resultado);
    }
}
