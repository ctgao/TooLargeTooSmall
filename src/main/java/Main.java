/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by Christine Gao.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {
    static final int FIRST_TIME = 999999;

    public static void main(String[] args){

        // Generate a mystery number
        Random rng = new Random();
        int mysteryNum = rng.nextInt(100);
        System.out.println("Can you \"Guess the Mystery Number\"?\n");

        // Set up Scanner for User Input
        Scanner in = new Scanner(System.in);
        int currentGuess = FIRST_TIME;
        int previousGuess = FIRST_TIME;
        int counter = 0;

        // Set up a loop
        while(true) {
            System.out.print("Please type in your guess (0-99): ");
            if (!in.hasNextInt()) {
                System.out.println("Not a valid input!");
                continue;
            }

            // set the guesses, increment counter
            previousGuess = currentGuess;
            currentGuess = in.nextInt();
            if(previousGuess == FIRST_TIME || previousGuess != currentGuess){
                counter++;
            }

            // Check against mystery number
            if(currentGuess == mysteryNum){
                System.out.println("Wow! You've got a sixth sense.");
                break;
            }
            else if(currentGuess > mysteryNum){
                System.out.println("Try a little smaller.");
            }
            else{
                // default case: the current guess is too small
                System.out.println("Dream a bit larger.");
            }
        }

        // Once finished, show the number of guesses.
        System.out.println("\nYou used " + counter + " number of guesses.");
    }
}
