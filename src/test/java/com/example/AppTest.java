package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAppOutput() {
        assertEquals("Hola Libreria Codigo!", getMessage());
    }

    private String getMessage() {
        return "Hola Libreria Codigo!";
    }
}
