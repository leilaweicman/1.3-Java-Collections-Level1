package Exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("resources/countries.txt"));
            for (String line: lines) {
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

        System.out.println("Countries and capitals: " + countries);
    }
}
