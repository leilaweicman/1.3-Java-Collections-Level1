package exercise3;

import java.util.*;

public class Quiz {
    private static final int ROUNDS = 10;
    private final Map<String, String> countries;
    private final Scanner scanner;
    private String username;
    public Quiz(Map<String, String> countries, Scanner scanner) {
        this.countries = Objects.requireNonNull(countries);
        this.scanner = Objects.requireNonNull(scanner);
    }

    public void promptUsername() {
        while (username == null || username.isEmpty()) {
            System.out.println("Enter your username: ");
            username = scanner.nextLine().trim();
            if (username.isEmpty()) {
                System.out.println("Username cannot be empty.");
            }
        }
    }

    public int play() {
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
    public String getUsername() {
        return username;
    }
}
