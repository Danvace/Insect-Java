package ua.lviv.iot.algo.part1.lab1.models;

import java.util.List;


public abstract class AddInsect {

    public abstract List<Insect> findAllWithMoreThan(final int legs);

    public abstract List<Insect> findAllWithWings();

    public abstract void addInsect(Insect insect);

}
