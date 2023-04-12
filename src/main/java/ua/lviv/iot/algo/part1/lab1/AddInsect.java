package ua.lviv.iot.algo.part1.lab1;

import java.util.List;


public abstract class AddInsect {

    abstract List<Insect> findAllWithMoreThan(int legs);

    abstract List<Insect> findAllWithWings();

    abstract void addInsect(final Insect insect);

}
