package chapter4;

import java.util.Random;

public class RollDieGame {
    public static void main (String args[]){
        int position = 0;
        int spaces = 20;
        int maxRolls = 5;
        int rolls = 0;
        Random random = new Random();
        do {
            int die = random.nextInt(6) + 1;
            rolls++;
            position += die;
            if (position > spaces){
                break;
            } else if (position == 20){
                System.out.println("Roll #" + rolls + ": You've rolled a " + die +
                        ". You're now on space 20. Congrats, you win!");
                break;
            }
            System.out.println("Roll #"+rolls+": You've rolled a "
            + die + ". You are now on space " + position + " and have " + (spaces - position)
            + " more to go");

        } while (position < spaces && rolls < maxRolls);
    }
}
