package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.lviv.iot.algo.part1.lab1.models.Cockroach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class  CockroachTest {

    Cockroach cockroach = new Cockroach("cockroach", 7, false, true, true);

    @Test
    public void testConstructor() {
        Assertions.assertEquals("cockroach", cockroach.getName());
        Assertions.assertEquals(7, cockroach.getNumberOfLegs());
        Assertions.assertEquals(false, cockroach.getHasWings());
        Assertions.assertEquals(true, cockroach.getIsDangerous());
        assertTrue(cockroach.isVitality());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Cockroach{vitality=true} Insect(name=cockroach, numberOfLegs=7, hasWings=false, isDangerous=true, isSleeping=false)", cockroach.toString());
    }

    @Test
    public void testCanInjectPoison() {
        assertTrue(cockroach.canInjectPoison());
    }

    @Test
    public void testSurviveOverWinter() {
        assertTrue(cockroach.surviveOverWinter());
    }

    @Test
    public void testGetHeaders() {
        Assertions.assertEquals("name, numberOfLegs, hasWings, isDangerous, isSleeping, vitality",cockroach.getHeaders());
    }

}
