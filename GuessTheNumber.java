import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1; // Random number between 1 and 10
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 10: ");
        int userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Correct! You guessed it!");
        } else {
            System.out.println("Wrong! The correct number was " + numberToGuess);
        }
    }
}
