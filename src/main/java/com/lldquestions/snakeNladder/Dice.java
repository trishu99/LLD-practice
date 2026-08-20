package main.java.com.lldquestions.snakeNladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    static int diceCount;

    public Dice(int diceCount){
        Dice.diceCount = diceCount;
    }

    public static int roll(){
        int totalSum = 0;
        int diceUsed = 0;

        while(diceUsed < diceCount){
            totalSum += ThreadLocalRandom.current().nextInt(1, 7);
            diceUsed++;
        }

        return totalSum;
    }
}
