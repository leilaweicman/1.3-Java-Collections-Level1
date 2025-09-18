package exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class CountryLoader {

    private static final Path COUNTRIES_PATH = Paths.get("resources/countries.txt");
    public static HashMap<String, String> load() {
        HashMap<String, String> countries = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(COUNTRIES_PATH);
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
}
