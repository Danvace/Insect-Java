package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class InsectManager extends AddInsect {


    private List<Insect> insects = new ArrayList<>();

    public InsectManager(List<Insect> insects) {
        this.insects = insects;
    }

    List<Insect> findAllWithMoreThan(final int legs) {
        return insects
                .stream()
                .filter(i -> i.getNumberOfLegs() > legs)
                .toList();
    }

    List<Insect> findAllWithWings() {
        return insects
                .stream()
                .filter(i -> i.getHasWings())
                .toList();
    }

    void addInsect(final Insect insect) {
        insects.add(insect);
    }

}
