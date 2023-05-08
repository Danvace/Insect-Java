package ua.lviv.iot.algo.part1.lab1.manager;

import lombok.NoArgsConstructor;
import ua.lviv.iot.algo.part1.lab1.models.AddInsect;
import ua.lviv.iot.algo.part1.lab1.models.Insect;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class InsectManager extends AddInsect {

    private List<Insect> insects = new ArrayList<>();

    public InsectManager(final List<Insect> insects) {
        this.insects = new ArrayList<>(insects);
    }

    public List<Insect> findAllWithMoreThan(final int legs) {
        return insects
                .stream()
                .filter(i -> i.getNumberOfLegs() > legs)
                .toList();
    }

    public List<Insect> findAllWithWings() {
        return insects
                .stream()
                .filter(i -> i.getHasWings())
                .toList();
    }

    public void addInsect(final Insect insect) {
        insects.add(insect);
    }

    public List<Insect> getInsects() {
        return List.copyOf(insects);
    }
}
