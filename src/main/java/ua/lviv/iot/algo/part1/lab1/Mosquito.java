package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;


@Getter
public class Mosquito extends Insect {

    private final boolean hasHealthSting;

    public Mosquito(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean hasHealthSting) {
        this.hasHealthSting = hasHealthSting;
        setHasWings(hasWings);
        setNumberOfLegs(numberOfLegs);
        setIsDangerous(isDangerous);
        setName(name);
    }

    @Override
    public String toString() {
        return "Mosquito{" +
                "hasHealthSting=" + hasHealthSting +
                "} " + super.toString();
    }

    @Override
    public boolean canInjectPoison() {
        return hasHealthSting;
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }

}
