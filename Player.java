
public abstract class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void updateScore(int score);
    public abstract void updateLeaderboard();
}
