import java.util.Random;

public class SportsResults {
    private int results;

    public String generateRandomResults() {
        Random random = new Random();
        String winner = "";

        results = random.nextInt(3) + 1;

            switch (results) {
                case 1 -> winner = "Team1";
                case 2 -> winner = "Team2";
                case 3 -> winner = "Uafgjort";
            }
            return winner;
        }
    }



