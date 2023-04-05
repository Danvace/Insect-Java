package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.List;


public class InsectManager extends ua.lviv.iot.algo.part1.lab1.AddInsect {

    private static final List<Insect> insects = new ArrayList<>();

    List<Insect> findAllWithMoreThan(final int legs){
        return insects
                .stream()
                .filter(i -> i.getNumberOfLegs() > legs )
                .toList();
    }

    List<Insect> findAllWithWings(){
        return insects
                .stream()
                .filter(i -> i.getHasWings())
                .toList();
    }

    void addInsect(final Insect insect){
        insects.add(insect);
    }

    public static void main(String[] args) {

        Insect mosquito = new Mosquito("Mosquito" , 4, true , true ,true);
        Insect denys = new Mosquito("Denys" , 4 , true, true , false );

        Insect hornet = new Hornet("hornet", 5,true , false , false , false , true);
        Insect kingJameson = new Hornet("KingJameson" , 5 , true , false , true , false , true);

        Insect cockroach = new Cockroach("cockroach",7, false , true , true );
        Insect ivan = new Cockroach("Ivan" , 66 , false , true , true);

        Insect chafer = new Chafer("Chafer" , 4, true  , true , false , false);
        Insect ivanka = new Chafer("Ivanka" , 6, true , true , true , true );

        InsectManager manager = new InsectManager();

        manager.addInsect(mosquito);
        manager.addInsect(denys);

        manager.addInsect(hornet);
        manager.addInsect(kingJameson);

        manager.addInsect(cockroach);
        manager.addInsect(ivan);

        manager.addInsect(chafer);
        manager.addInsect(ivanka);

        int numberOfLegs = 5;
        List<Insect> sampleOfLegs = manager.findAllWithMoreThan(numberOfLegs);

        for (Insect insect:sampleOfLegs) {
            System.out.println(insect);
        }

        System.out.println();

        List<Insect> sampleOfWings = manager.findAllWithWings();
        sampleOfWings.stream().forEach(s-> System.out.println(s));

        System.out.println();

        if (cockroach.canInjectPoison()){
            System.out.println("dangerous");
        }
    }
}
