import java.io.*;
import java.util.Scanner;

public class Save {


    public static void main(String[] args) {
        new Save().run();
    }

    private void run() {
        SportsResults s = new SportsResults();

        System.out.println("Resultat = ....... ");

       String res = s.generateRandomResults();

        System.out.println(res);
        File file = new File("sportsResults.csv");
        try {
            PrintStream i = new PrintStream(file);
            i.println(res);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
