public class Hangman {
    private Player user;

    public Hangman(Player user) {
        this.user = user;
    }

    public void startGame() {
        user.updateScore(10);
        System.out.println("Player awarded 10 points.\nThank you for playing Hangman!");
    }
}