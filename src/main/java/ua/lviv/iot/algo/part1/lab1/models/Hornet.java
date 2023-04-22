package ua.lviv.iot.algo.part1.lab1.models;

import ua.lviv.iot.algo.part1.lab1.Hibernationality;

public class Hornet extends Insect implements Hibernationality {

    public static final String HEADERS = "isOldQueen, isQueen";
    private final boolean isOldQueen;
    private final boolean isQueen;

    public Hornet(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean isSleeping, final boolean isOldQueen, final boolean isQueen) {
        this.isOldQueen = isOldQueen;
        this.isQueen = isQueen;
        setNumberOfLegs(numberOfLegs);
        setHasWings(hasWings);
        setIsDangerous(isDangerous);
        setName(name);
        setIsSleeping(isSleeping);
    }

    @Override
    public String toString() {
        return "Hornet{" + "isOldQueen=" + isOldQueen + "} " + super.toString();
    }

    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public boolean surviveOverWinter() {
        return isQueen && !isOldQueen;
    }

    @Override
    public void hibernate() {
        if (!isOldQueen) {
            setIsSleeping(true);
        }
    }

    @Override
    public void wakeUp() {
        if (!isOldQueen) {
            setIsSleeping(false);
        }
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = isOldQueen + ", " + isQueen;
        return super.toCSV() + string;
    }
}
