package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.models.*;

import java.util.LinkedList;
import java.util.List;

abstract public class AbstractTestUtils {
    public static List<Insect> listOfInsects() {
        List<Insect> insects;
        insects = new LinkedList<>();
        insects.add(new Hornet("hornet", 5, false, false, false, false, true));
        insects.add(new Mosquito("Mosquito", 4, true, true, true));
        insects.add(new Mosquito("Denys", 4, true, true, false));
        insects.add(new Hornet("hornet", 5, false, false, false, false, true));
        insects.add(new Hornet("KingJameson", 5, false, false, true, false, true));
        insects.add(new Cockroach("cockroach", 7, false, true, true));
        insects.add(new Cockroach("Ivan", 66, false, true, true));
        insects.add(new Chafer("Chafer", 4, false, true, false, false));
        insects.add(new Chafer("Ivanka", 6, false, true, true, true));

        return insects;

    }

}
