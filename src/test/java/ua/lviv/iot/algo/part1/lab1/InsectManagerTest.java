package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;
import ua.lviv.iot.algo.part1.lab1.manager.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsectManagerTest {

    static List<Insect> insects = Arrays.asList(
            new Mosquito("Mosquito", 4, true, true, true),
            new Mosquito("Denys", 4, true, true, false),
            new Hornet("hornet", 5, false, false, false, false, true),
            new Hornet("KingJameson", 5, false, false, true, false, true),
            new Cockroach("cockroach", 7, false, true, true),
            new Cockroach("Ivan", 66, false, true, true),
            new Chafer("Chafer", 4, false, true, false, false),
            new Chafer("Ivanka", 6, false, true, true, true)
    );

    public InsectManager manager = new InsectManager(insects);


    @Test
    void testFindAllWithMoreThan() {
        List<Insect> result = manager.findAllWithMoreThan(6);
        assertEquals(2, result.size());
        assertEquals("cockroach", result.get(0).getName());
        assertEquals("Ivan", result.get(1).getName());
    }

    @Test
    void testFindAllWithWings() {
        List<Insect> result = manager.findAllWithWings();
        assertEquals(2, result.size());
        assertEquals("Mosquito", result.get(0).getName());
        assertEquals("Denys", result.get(1).getName());
    }

    @Test
    void testNoArgsConstructor() {
        InsectManager manager1 = new InsectManager();
        assertEquals(0, manager1.getInsects().size());
    }

}