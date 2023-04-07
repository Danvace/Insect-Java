package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChaferTest {
    private Chafer chafer;

    @BeforeEach
    public void setUp() {
        chafer = new Chafer("Ivanka", 6, true, true, true, true);
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Chafer{isIncubation=true} Insect(name=Ivanka, numberOfLegs=6, hasWings=true, isDangerous=true, isSleeping=true)", chafer.toString());
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
}