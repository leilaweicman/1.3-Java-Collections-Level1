package exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> countries = CountryLoader.load();
        if (countries.isEmpty()) {
            System.out.println("No countries loaded. Exiting.");
            return;
        }
        Quiz quiz = new Quiz(countries, new Scanner(System.in));
        quiz.promptUsername();
        String username = quiz.getUsername();
        int score = quiz.play();
        ScoreSaver.saveScore(username, score);
    }

}
