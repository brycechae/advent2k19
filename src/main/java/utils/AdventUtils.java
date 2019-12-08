package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdventUtils {
    private static final String BASE_DIR = "src/main/resources/";

    public static String readFile(Class clazz) throws IOException {
       return String.join(",", Files.readAllLines(Paths.get(BASE_DIR + clazz.getName())));

    }
}
