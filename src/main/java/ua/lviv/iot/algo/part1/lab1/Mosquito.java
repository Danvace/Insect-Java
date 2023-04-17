package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;


@Getter
public class Mosquito extends Insect {

    public static final String HEADERS = "hasHealthSting";
    private final boolean hasHealthSting;

    public Mosquito(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean hasHealthSting) {
        this.hasHealthSting = hasHealthSting;
        setHasWings(hasWings);
        setNumberOfLegs(numberOfLegs);
        setIsDangerous(isDangerous);
        setName(name);
    }

    @Override
    public String toString() {
        return "Mosquito{" + "hasHealthSting=" + hasHealthSting + "} " + super.toString();
    }

    @Override
    public boolean canInjectPoison() {
        return hasHealthSting;
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() +", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = hasHealthSting + "";
        return super.toCSV() + string;
    }
}
