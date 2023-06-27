/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by Christine Gao.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        // Generate a mystery number
        Random rng = new Random();
        int mysteryNum = rng.nextInt(100);
        System.out.println("Can you \"Guess the Mystery Number\"?\n");

        // Set up Scanner for User Input
        Scanner in = new Scanner(System.in);
        int currentGuess;
        int counter = 0;
//        String yayOrNay = "";

        // Set up a loop
        while(true) {
            System.out.print("Please type in your guess (0-99): ");
            if (!in.hasNextInt()) {
                System.out.println("Not a valid input!");
                continue;
            }

            currentGuess = in.nextInt();
            counter++;

            // Check against mystery number
            if(currentGuess > mysteryNum){
                System.out.println("Try a little smaller.");
            }
            else if(currentGuess == mysteryNum){
                System.out.println("Wow! You've got a sixth sense.");
                break;
            }
            else{
                // default case: the current guess is too small
                System.out.println("Dream a bit larger.");
            }
/*
            // Check to see if the user is finished guessing or not
            System.out.print("Give up (y/n)? ");
            yayOrNay = in.next();
            // If the user types "y" then they're done, otherwise, just continue with the gamw
            if(yayOrNay.equals("y")){
                break;
            }
 */
        }

        // Once finished, show the number of guesses.
        System.out.println("\nYou used " + counter + " number of guesses.");
    }
}
