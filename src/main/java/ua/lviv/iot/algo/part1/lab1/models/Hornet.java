package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.lab1.Hibernationality;

@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
public class Hornet extends Insect implements Hibernationality {

    public static final String HEADERS = "hornetId, isOldQueen, isQueen";

    private Integer hornetId;
    private boolean isOldQueen;
    private boolean isQueen;

    public Hornet(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean isSleeping, final boolean isOldQueen, final boolean isQueen) {
        this.isOldQueen = isOldQueen;
        this.isQueen = isQueen;
        setNumberOfLegs(numberOfLegs);
        setHasWings(hasWings);
        setIsDangerous(isDangerous);
        setName(name);
        setIsSleeping(isSleeping);

    }

    public Hornet(final Hornet hornet,final Integer hornetId) {
        this.hornetId = hornetId;
        this.isOldQueen = hornet.isOldQueen();
        this.isQueen = hornet.isQueen;
        setNumberOfLegs(hornet.getNumberOfLegs());
        setHasWings(hornet.getHasWings());
        setIsDangerous(hornet.getIsDangerous());
        setName(hornet.getName());
        setIsSleeping(hornet.getIsSleeping());
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
        String string = hornetId + ", " + isOldQueen + ", " + isQueen;
        return super.toCSV() + string;
    }
}
