public class VipPlayer extends Player {
    int score = 0;

    public VipPlayer(String name) {
        super(name);
        this.score = 0;
    }

    // get player status
    public String getStatus() {
        return "VIP";
    }

    // increase or decrease score
    // every VIP is awarded double the score
    public void updateScore(int score) {
        this.score += (2 * score);
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
}
