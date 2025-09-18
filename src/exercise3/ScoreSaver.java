package exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ScoreSaver {

    private static final Path CLASSIFICATION_PATH = Paths.get("resources/classification.txt");
    public static void saveScore(String username, int points) {
        try {
            Files.writeString(
                    CLASSIFICATION_PATH,
                    "Username: " + username + " - Points: " + points + System.lineSeparator(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND
            );
            System.out.println("Score saved to classification.txt");
        } catch (IOException e) {
            System.out.println("Error writing classification: " + e.getMessage());
        }
    }
}
