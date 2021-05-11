import java.util.*;

public class Menu {
    public static int getChoice(Scanner input) {
        System.out.println("Please choose an option:");
        System.out.println("1 New Player");
        System.out.println("2 Quit");

        int selected;

        while (true) {
            try {
                selected = input.nextInt();
                if ((selected == 1) | (selected == 2)) {
                    break;
                } else {
                    throw new Exception("Please enter a valid choice.\nTry again!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return selected;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int choice = getChoice(input);

            System.out.println(choice);

            if (choice == 2) {
                System.out.println("***** Leaderboard ******");
                // print leaderboard here
                break;
            } else {
                System.out.println("Please enter player name:");
                String playerName = input.next();

                System.out.println("Please enter player status:");
                System.out.println("A VIP is player is awarded double the points.");
                System.out.println("1 for Regular");
                System.out.println("2 for VIP");

                int playerStatus = input.nextInt();

                Player user = new Player(playerName, playerStatus);

                while (true) {
                    System.out.println("Hello " + playerName + ". Please choose a game, or -1 to quit:");
                    System.out.println("1 Number Guess");
                    System.out.println("2 Hangman");
                    System.out.println("3 Puzzle");

                    int gameChoice = input.nextInt();

                    if (gameChoice == -1) {
                        user.updateLeaderboard();
                        System.out.println(gameChoice);
                        break;
                    } else if (gameChoice == 1) {
                        System.out.println("Let's play Number Guess game:");

                        NumberGuess guessGame = new NumberGuess(user);
                        guessGame.startGame();
                    } else if (gameChoice == 2) {
                        System.out.println("Let's play Hangman game:");

                        Hangman hangmanGame = new Hangman(user);
                        hangmanGame.startGame();
                    } else if (gameChoice == 3) {
                        System.out.println("Let's play Puzzle game:");

                        Puzzle puzzleGame = new Puzzle(user);
                        puzzleGame.startGame();
                    }

                }

            }
        }
    }
}