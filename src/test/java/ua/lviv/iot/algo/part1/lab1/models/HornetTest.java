package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HornetTest {
    private Hornet hornet;

    @BeforeEach
    void setUp() {
        hornet = new Hornet("hornet", 5, true, false, false, false, true);
    }

    @Test
    void testToString() {
        assertEquals("Hornet(super=Insect(name=hornet, numberOfLegs=5, hasWings=true, isDangerous=false, isSleeping=false), hornetId=null, isOldQueen=false, isQueen=true)", hornet.toString());

    }

    @Test
    void canInjectPoison() {
        assertFalse(hornet.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        assertTrue(hornet.surviveOverWinter());
    }

    @Test
    void hibernate() {
        hornet.hibernate();
        assertTrue(hornet.getIsSleeping());
    }

    @Test
    void wakeUp() {
        hornet.wakeUp();
        assertFalse(hornet.getIsSleeping());
    }

    @Test
    void testGetHeaders() {
        Assertions.assertEquals("name, numberOfLegs, hasWings, isDangerous, isSleeping, hornetId, isOldQueen, isQueen", hornet.getHeaders());
    }
}