package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    @Test
    public void testConverter() {
        Converter converter = new Converter();
        int resultado = converter.romanToInteger("I");
        assertEquals(1, resultado);
    }
}
