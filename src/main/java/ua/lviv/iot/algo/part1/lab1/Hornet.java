package ua.lviv.iot.algo.part1.lab1;

public class Hornet extends Insect implements Hibernationality {

    private final boolean isOldQueen;
    private final boolean isQueen;

    public Hornet(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean isSleeping, boolean isOldQueen, boolean isQueen) {
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
        return "Hornet{" +
                "isOldQueen=" + isOldQueen +
                "} " + super.toString();
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
}
