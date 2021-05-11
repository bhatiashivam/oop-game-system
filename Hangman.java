public class Hangman {
    private Player user;

    public Hangman(Player user) {
        if (user instanceof VipPlayer) {
            this.user = (VipPlayer) user;
        } else {
            this.user = (RegularPlayer) user;
        }
    }

    public void startGame() {
        user.updateScore(10);
        System.out.println("Player awarded 10 points.\nThank you for playing Hangman!");
    }
}