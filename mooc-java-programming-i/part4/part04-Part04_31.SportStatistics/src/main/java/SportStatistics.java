
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        List<Game> gamesList = readFromFile(fileName);

        System.out.println("Team:");
        String team = scanner.nextLine();

        List<Game> gamesOfATeamList = new ArrayList<>();

        for (Game game : gamesList) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())) {
                gamesOfATeamList.add(game);
            }
        }

        System.out.println("Games: " + gamesOfATeamList.size());

        int wins = 0;

        for (Game game : gamesOfATeamList) {    
            
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeamList.size() - wins));

    }

    public static List<Game> readFromFile(String fileName) {

        List<Game> gameList = new ArrayList<>();

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {

            while (readFile.hasNextLine()) {

                String line = readFile.nextLine();

                if (line.isEmpty()) {
                    break;
                }

                String[] array = line.split(",");

                String homeTeam = array[0];
                String visitingTeam = array[1];

                int homeTeamPoints = Integer.valueOf(array[2]);
                int visitingTeamPoints = Integer.valueOf(array[3]);

                gameList.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return gameList;
    }
}
