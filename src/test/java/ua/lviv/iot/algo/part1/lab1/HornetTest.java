package ua.lviv.iot.algo.part1.lab1;

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
        assertEquals("Hornet{isOldQueen=false} Insect(name=hornet, numberOfLegs=5, hasWings=true, isDangerous=false, isSleeping=false)", hornet.toString());

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
}