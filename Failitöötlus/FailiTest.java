package Failitöötlus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class FailiTest {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get(args[0]);
        if (!Files.isDirectory(p1)) {
            System.out.println("File not found");
            return;
        }
        FailiVaatleja vaatleja = new FailiVaatleja();
        Files.walkFileTree(p1, vaatleja);
        Collections.sort(vaatleja.getFailiNimed(), new NimeVõrdleja());
        for (String e : vaatleja.getFailiNimed()) {
            System.out.println(e);
        }
    }
}
