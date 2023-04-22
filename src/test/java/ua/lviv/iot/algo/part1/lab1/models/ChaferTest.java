package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.Chafer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChaferTest {
    private Chafer chafer;

    @BeforeEach
    public void setUp() {
        chafer = new Chafer("Ivanka", 6, true, true, true, true);
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Chafer(super=Insect(name=Ivanka, numberOfLegs=6, hasWings=true, isDangerous=true, isSleeping=true), isIncubation=true)", chafer.toString());
    }

    @Test
    void canInjectPoison() {
        assertFalse(chafer.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        assertTrue(chafer.surviveOverWinter());
    }

    @Test
    void hibernate() {
        chafer.hibernate();
        assertTrue(chafer.getIsSleeping());
    }

    @Test
    void wakeUp() {
        chafer.wakeUp();
        assertFalse(chafer.getIsSleeping());
    }

    @Test
    void testGetHeaders() {
        Assertions.assertEquals("name, numberOfLegs, hasWings, isDangerous, isSleeping, isIncubation", chafer.getHeaders());
    }
}