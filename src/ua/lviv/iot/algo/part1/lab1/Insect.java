package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
import java.util.ArrayList;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Insect {

    String name = "Insect";

    int numberOfLegs;

    Boolean hasWings = false;

    Boolean isDangerous = false;

    private Boolean isSleeping = false;

    private static Insect defaultInsect = new Insect();

    public static Insect getInstance(){return defaultInsect;}

    public Boolean isPoisonous(){return numberOfLegs >= 6;}

    public void hibernate(){isSleeping = true;}

    public void wakeUp(){isSleeping = false;}

    public static void main(String[] args) {
        ArrayList<Insect> listOfInsects = new ArrayList<Insect>();
        Insect cockroach = new Insect("cockroach",4,false,false,false);
        Insect fly = new Insect("fly",6,false,false,false);

        listOfInsects.add(cockroach);
        listOfInsects.add(fly);
        listOfInsects.add(getInstance());
        listOfInsects.add(getInstance());

        for(Insect insect:listOfInsects){
            System.out.println(insect.toString());
        }

    }

}