package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.util.Comparator;
import java.util.List;

public class InsectWriter {

    public String smartlyWrite(List<Insect> insects, final String defaultFilePath) {

        if (insects == null || insects.isEmpty()) {
            return null;
        }

        try (var writer = new FileWriter(defaultFilePath)) {
            insects.sort(Comparator.comparing((Insect c) -> c.getClass().getSimpleName()));
            Class<?> current = null;
            for (Insect insect : insects) {
                Class<?> insectClass = insect.getClass();

                if (insectClass != current) {
                    writer.write(insect.getHeaders() + "\n");
                    current = insect.getClass();
                }

                writer.write(insect.toCSV() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return defaultFilePath;
    }

}
