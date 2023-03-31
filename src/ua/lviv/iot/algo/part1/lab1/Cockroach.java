package ua.lviv.iot.algo.part1.lab1;

public class Cockroach extends Insect{

    private final boolean vitality;

    public Cockroach(String name , int  numberOfLegs,boolean hasWings, boolean isDangerous , boolean vitality) {
        this.vitality = vitality;
        super.setNumberOfLegs(numberOfLegs);
        super.setHasWings(hasWings);
        super.setIsDangerous(isDangerous);
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Cockroach{" +
                "vitality=" + vitality +
                "} " + super.toString();
    }

    @Override
    public boolean canInjectPoison() {
        return getIsDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return vitality;
    }

}
