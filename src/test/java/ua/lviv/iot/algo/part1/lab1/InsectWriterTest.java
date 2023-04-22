package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;
import ua.lviv.iot.algo.part1.lab1.writer.InsectWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

class InsectWriterTest {

    private static final String RESULT_WRITER = "result.csv";
    private static final String EXPECTED_WRITER = "expected.csv";
    List<Insect> insects;
    private InsectWriter writer;

    @BeforeEach
    public void setup() throws IOException {
        writer = new InsectWriter();
        insects = new LinkedList<>();
        insects.add(new Hornet("hornet", 5, false, false, false, false, true));
        insects.add(new Mosquito("Mosquito", 4, true, true, true));
        insects.add(new Mosquito("Denys", 4, true, true, false));
        insects.add(new Hornet("hornet", 5, false, false, false, false, true));
        insects.add(new Hornet("KingJameson", 5, false, false, true, false, true));
        insects.add(new Cockroach("cockroach", 7, false, true, true));
        insects.add(new Cockroach("Ivan", 66, false, true, true));
        insects.add(new Chafer("Chafer", 4, false, true, false, false));
        insects.add(new Chafer("Ivanka", 6, false, true, true, true));

        Files.deleteIfExists(Path.of(RESULT_WRITER));

    }

    @AfterAll
    public static void teardown() throws IOException {
        Files.deleteIfExists(Path.of("fileForTestWithWords.csv"));
    }

    @Test
    void testEmptyWrite() {
        writer.smartlyWrite(null, null);
        File file = new File(RESULT_WRITER);
        Assertions.assertFalse(file.exists());

    }

    @Test
    void testWriteListOfInsects() throws IOException {
        writer.smartlyWrite(insects, "result.csv");
        Path actual = new File(RESULT_WRITER).toPath();
        Path expected = new File(EXPECTED_WRITER).toPath();
        List<String> expectedLines = Files.readAllLines(expected);
        List<String> actualLines = Files.readAllLines(actual);
        Assertions.assertEquals(expectedLines, actualLines);
    }

    @Test
    void testWriteToExistingFile() throws IOException {
        var forTest = new FileWriter("fileForTestWithWords.csv");
        forTest.write("Internet Of Things");
        writer.smartlyWrite(insects, "fileForTestWithWords.csv");
        Path actual = new File("fileForTestWithWords.csv").toPath();
        Path expected = new File(EXPECTED_WRITER).toPath();
        List<String> expectedLines = Files.readAllLines(expected);
        List<String> actualLines = Files.readAllLines(actual);
        Assertions.assertEquals(expectedLines, actualLines);
    }
}