package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString(callSuper = true)
public class Chafer extends Insect implements Hibernationality {

    public static final String HEADERS = "isIncubation";

    private boolean isIncubation;

    public Chafer(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean isSleeping, final boolean isIncubation) {
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

    @Override
    public String getHeaders() throws SecurityException {
        return  super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = isIncubation + "";
        return super.toCSV() + string;
    }
}
