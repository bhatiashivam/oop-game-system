import java.io.FileWriter;
import java.io.IOException;

public class RegularPlayer extends Player {
    private int score = 0;

    public RegularPlayer(String name) {
        super(name);
        this.score = 0;
    }

    // get player status
    public String getStatus() {
        return "(Regular)";
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

        String text = getScore() + " -> " + getName() + " " + getStatus();

        try {
            FileWriter fw = new FileWriter("leaderboard.txt", true);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
