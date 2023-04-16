package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;

@Getter
public class Cockroach extends Insect {

    public static final String HEADERS = "vitality";
    private final boolean vitality;

    public Cockroach(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean vitality) {
        this.vitality = vitality;
        super.setNumberOfLegs(numberOfLegs);
        super.setHasWings(hasWings);
        super.setIsDangerous(isDangerous);
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Cockroach{" + "vitality=" + vitality + "} " + super.toString();
    }

    @Override
    public boolean canInjectPoison() {
        return getIsDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return vitality;
    }

    @Override
    public String getHeaders() {
        return HEADERS + ", " + super.getHeaders();
    }

    @Override
    public String toCSV() {
        String string = vitality + ", ";
        return string + super.toCSV();
    }

}
