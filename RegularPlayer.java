public class RegularPlayer extends Player {
    private int score = 0;

    public RegularPlayer(String name) {
        super(name);
        this.score = 0;
    }

    // get player status
    public String getStatus() {
        return "Regular";
    }

    // increase or decrease score
    public void updateScore(int score) {
        this.score += score;
    }

    // getScore
    public int getScore() {
        return this.score;
    }

    // update leaderboard
    public void updateLeaderboard() {
        System.out.println("Total points: " + getScore());
        System.out.println("Leaderboard updated!");
    }

    // add toString
}
