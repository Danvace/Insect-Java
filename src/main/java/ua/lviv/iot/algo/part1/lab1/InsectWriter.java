package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class InsectWriter {


    public static void main(String[] args) {

        InsectWriter writer = new InsectWriter();
        List<Insect> insects = new LinkedList<>();

        insects.add(new Hornet("hornet", 5, false, false, false, false, true));
        insects.add(new Mosquito("Mosquito", 4, true, true, true));
        insects.add(new Mosquito("Denys", 4, true, true, false));
        insects.add(new Hornet("hornet", 5, false, false, false, false, true));
        insects.add(new Hornet("KingJameson", 5, false, false, true, false, true));
        insects.add(new Cockroach("cockroach", 7, false, true, true));
        insects.add(new Cockroach("Ivan", 66, false, true, true));
        insects.add(new Chafer("Chafer", 4, false, true, false, false));
        insects.add(new Chafer("Ivanka", 6, false, true, true, true));

        writer.write(insects);
    }

    public String write(List<Insect> insects) {
        if (insects == null || insects.isEmpty()) {
            return null;
        }
        String defaultFilename = "result.csv";
        try (var writer = new FileWriter(defaultFilename)) {
            for (var insect : insects) {
                writer.write(insect.getHeaders());
                writer.write("\n");
                writer.write(insect.toCSV());
                writer.write("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return defaultFilename;
    }
}
