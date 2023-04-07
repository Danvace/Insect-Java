package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MosquitoTest {
    private Mosquito mosquito;

    @BeforeEach
    void setUp() {
        mosquito = new Mosquito("Mosquito", 4, true, true, true);
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Mosquito{hasHealthSting=true} Insect(name=Mosquito, numberOfLegs=4, hasWings=true, isDangerous=true, isSleeping=false)", mosquito.toString());
    }

    @Test
    void canInjectPoison() {
        assertEquals(mosquito.isHasHealthSting(), mosquito.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        assertFalse(mosquito.surviveOverWinter());
    }

}