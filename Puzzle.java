import java.util.*;

public class Puzzle {
    private Player user;

    public Puzzle(Player user) {
        this.user = user;
    }

    public void startGame() {
        System.out.println("Answer 3 riddles.");
        System.out.println("***************************************");
        System.out.println(
                "Instructions:\n1) Every riddle only has one-word answer.\n2) Every correct answer is awarded 10 points.");
        System.out.println("***************************************\n\n");

        Scanner in = new Scanner(System.in);
        int totalScore = 0;
        String answer = "";

        System.out.println("Riddle: 1\n");
        System.out.println(
                "If a man carried my burden he would break his back.\nI am not big but leave silver in my tracks.\nWhat am I?");

        answer = in.next().toUpperCase();

        if (answer == "SNAIL") {
            totalScore++;
            System.out.println("That's correct!. 10 points awarded.");
        } else {
            System.out.println("That's incorrect");
            System.out.println("The correct answer is: SNAIL");
            System.out.println("***************************************\n\n");
        }

        System.out.println("Riddle: 2\n");
        System.out.println(
                "Alice is walking through the forest of forgetfulness. She wants to know what\nday of the week it is. She stops and asks a lion and a unicorn. Now the lion lies all of the\ntime on Monday, Tuesday, and Wednesday. The unicorn always lies on Thursday, Friday and\nSaturday.\n\nAlice asks the lion what day it is, he says, \"Well, yesterday was one of my lying days.\" Alice can't figure it out just from the lion's answer so she asks the unicorn and the unicorn says, \"Yesterday was also one of my lying days.\"\nWhat day is it?");

        answer = in.next().toUpperCase();

        if (answer == "THURSDAY") {
            totalScore++;
            System.out.println("That's correct!. 10 points awarded.");
        } else {
            System.out.println("That's incorrect");
            System.out.println("The correct answer is: THURSDAY");
            System.out.println("***************************************\n\n");
        }

        System.out.println("Riddle: 3\n");
        System.out.println(
                "You have three stoves: a gas stove, a wood stove, and a coal stove, but only one match. Which should you light first?");

        answer = in.next().toUpperCase();

        if (answer == "MATCH") {
            totalScore++;
            System.out.println("That's correct!. 10 points awarded.");
        } else {
            System.out.println("That's incorrect");
            System.out.println("The correct answer is: MATCH");
            System.out.println("***************************************\n\n");
        }

        user.updateScore(totalScore);

    }
}