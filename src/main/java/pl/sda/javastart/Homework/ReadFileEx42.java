package pl.sda.javastart.Homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileEx42 {
    private static final String PATH_TO_FILE = "c:\\PROJECT\\romeo_juliet.txt";
    public static void main(String[] args) {

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(PATH_TO_FILE))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
