import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuessing
 */
public class NumberGuessing {
    public static void main(String[] args) {
        //generating random numbers in ranger 1-100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; //its (endingRanger - startingRange +1 ) + startingRange
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        System.out.println("guess the number between 1-100");
        //to find how many times user has tried
        int noOfTries = 1;
        //using while so the program doesn't exit until correct guess if found
        while (true) {
            //asking user for guess
            System.out.print("enter your guess: ");
            userGuess = scanner.nextInt();
            if (userGuess <= 100 && userGuess >= 1) {
                //if the guess is right loop breaks
                if (userGuess == randomNumber) {
                    System.out.println("you have guessed it right");
                    System.out.printf("you have guessed it out in %d tries \n", noOfTries);
                    System.out.println("thanks for playing");
                    break;
                } else if (userGuess < randomNumber) {  //it tells the guess is higher or lesser for a hint 
                    System.out.println("guess higher");
                } else if (userGuess > randomNumber) {
                    System.out.println("guess lesser");
                }
            } else {
                System.out.println("enter the number only in the range");
            }
            //this iterates the no of tries 
            noOfTries++;
        }
        scanner.close();
    }
}
