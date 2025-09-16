package Exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

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

        //Create a country list and shuffle it
        List<String> countriesList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesList);

        //Enter username with validation
        String username = "";
        while (username.isEmpty()) {
            System.out.println("Enter your username: ");
            username = scanner.nextLine().trim();
            if (username.isEmpty()) {
                System.out.println("Username cannot be empty.");
            }
        }

        //Capitals quiz with 10 rounds
        int points = 0;
        int rounds = 10;
        for (int i = 0; i < rounds; i++) {
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
    }
}
