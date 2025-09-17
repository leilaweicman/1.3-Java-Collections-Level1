package Exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    private static final Path COUNTRIES_PATH = Paths.get("resources/countries.txt");
    private static final Path CLASSIFICATION_PATH = Paths.get("resources/classification.txt");
    private static final int ROUNDS = 10;

    public static void main(String[] args) {

        Map<String, String> countries = loadCountries(COUNTRIES_PATH);
        if (countries.isEmpty()) {
            System.out.println("No countries loaded. Exiting.");
            return;
        }

        String username = promptUsername();
        int score = playQuiz(countries);
        saveScore(username, score);
    }

    private static HashMap<String, String> loadCountries(Path path) {
        HashMap<String, String> countries = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                if (line.isBlank()) continue;
                String[] parts = line.split(" ", 2);
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countries.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return countries;
    }

    private static String promptUsername() {
        String username = "";
        while (username.isEmpty()) {
            System.out.println("Enter your username: ");
            username = scanner.nextLine().trim();
            if (username.isEmpty()) {
                System.out.println("Username cannot be empty.");
            }
        }
        return username;
    }

    private static int playQuiz(Map<String, String> countries) {
        List<String> countriesList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesList);
        int points = 0;
        for (int i = 0; i < ROUNDS; i++) {
            String country = countriesList.get(i);
            String correctCapital = countries.get(country).replace('_', ' ');

            System.out.println("Which is the capital of " + country.replace('_', ' ') + "? ");

            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Wrong. Correct answer: " + correctCapital);
            }
            System.out.println("Your points: " + points);
        }
        return points;
    }

    public static void saveScore(String username, int points) {
        try {
            Files.writeString(
                    CLASSIFICATION_PATH,
                    username + " " + points + System.lineSeparator(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND
            );
            System.out.println("Score saved to classification.txt");
        } catch (IOException e) {
            System.out.println("Error writing classification: " + e.getMessage());
        }
    }
}
