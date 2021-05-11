import java.util.*;

public class NumberGuess {
    private Player user;
    // private VipPlayer vp = null;
    // private RegularPlayer rp = null;

    public NumberGuess(Player user) {

        // this.user = user;
    }

    public void startGame() {
        System.out.println(
                "Guess the number between 1 and 100 in 5 turns or less.\n**For every another guess, 10 points less are awarded. Maximum achievable score is 50**");

        Scanner keyboard = new Scanner(System.in);
        int userGuess, totalScore;
        int targetNumber = (int) (Math.random() * 100);
        int i = 5;

        for (; i >= 1; i--) {
            System.out.println("Enter a number:");
            userGuess = keyboard.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("That is correct!");
                break;
            } else {
                System.out.println("Wrong guess!");
            }
        }

        if (i == 0) {
            System.out.println("All chances exhausted.\nYou earned 0 points.");
        } else {
            totalScore = i * 10;
            user.updateScore(totalScore);
            System.out.println("You won " + totalScore + " points.");
        }
    }
}
