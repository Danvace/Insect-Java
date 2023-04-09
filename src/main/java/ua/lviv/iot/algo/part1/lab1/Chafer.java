package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class Chafer extends Insect implements Hibernationality {

    private final boolean isIncubation;

    public Chafer(final String name,
                  final int numberOfLegs,
                  final boolean hasWings,
                  final boolean isDangerous,
                  final boolean isSleeping,
                  final boolean isIncubation)
    {
        this.isIncubation = isIncubation;
        setName(name);
        setNumberOfLegs(numberOfLegs);
        setHasWings(hasWings);
        setIsDangerous(isDangerous);
        setIsSleeping(isSleeping);
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
