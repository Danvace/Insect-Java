package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Insect {
    public static final String HEADERS = "name, numberOfLegs, hasWings, isDangerous, isSleeping";
    private String name;
    private int numberOfLegs;
    private Boolean hasWings = false;
    private Boolean isDangerous = false;
    private Boolean isSleeping = false;

    public abstract boolean canInjectPoison();

    public abstract boolean surviveOverWinter();

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return name + ", " + numberOfLegs + ", " + hasWings + ", " + isDangerous + ", " + isSleeping + ", ";
    }
}
