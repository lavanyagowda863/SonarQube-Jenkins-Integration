
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    void shouldGreetUser() {
        assertEquals("Hello, DevOps!", app.greet("DevOps"));
    }

    @Test
    void shouldGreetGuestForNullName() {
        assertEquals("Hello, Guest!", app.greet(null));
    }

    @Test
    void shouldGreetGuestForBlankName() {
        assertEquals("Hello, Guest!", app.greet("   "));
    }

    @Test
    void shouldTrimName() {
        assertEquals("Hello, Java!", app.greet(" Java "));
    }

    @Test
    void shouldAddNumbers() {
        assertEquals(30, app.add(10, 20));
    }

    @Test
    void shouldIdentifyAdult() {
        assertTrue(app.isAdult(18));
    }

    @Test
    void shouldIdentifyMinor() {
        assertFalse(app.isAdult(17));
    }
}
