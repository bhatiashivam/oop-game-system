import java.util.Scanner;

public class Coinflip {
    private Player user;

    public Coinflip(Player user) {
        this.user = user;
    }

    Scanner answer_input = new Scanner(System.in);
    int total_score = 0;

    int flipCoin() {
        return (int) ((Math.random() * (2)) + 1);
    }

    public void startGame() {
        System.out.println("Predict the outcome of 5 coin flips!");
        System.out.println("Every correct guess is worth 10 points.");
        System.out.println("******************************************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your choice:");
            System.out.println("1 for Tail");
            System.out.println("2 for Heads");

            int coin_guess = answer_input.nextInt();

            if (coin_guess == flipCoin()) {
                total_score += 10;
                System.out.print("That was correct.\n10 points awarded.");
            } else {
                System.out.println("That was incorrect!");
            }
        }

        user.updateScore(total_score);
        System.out.println("Game ends.\nYou were awarded " + total_score + " points.");
    }
}