package ua.lviv.iot.algo.part1.lab1;

public class Chafer extends Insect implements Hibernationality {

    private final boolean isIncubation;

    public Chafer(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean isSleeping, boolean isIncubation) {
        this.isIncubation = isIncubation;
        setName(name);
        setNumberOfLegs(numberOfLegs);
        setHasWings(hasWings);
        setIsDangerous(isDangerous);
        setIsSleeping(isSleeping);
    }

    @Override
    public String toString() {
        return "Chafer{" +
                "isIncubation=" + isIncubation +
                "} " + super.toString();
    }

    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public boolean surviveOverWinter() {
        return isIncubation;
    }

    @Override
    public void hibernate() {
        if (isIncubation) {
            setIsSleeping(true);
        }
    }

    @Override
    public void wakeUp() {
        setIsSleeping(false);
    }
}
