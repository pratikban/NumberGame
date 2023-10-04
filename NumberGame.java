import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private int number;
    private int tries;
    private boolean hasGuessedCorrectly;

    public NumberGame() {
        Random random = new Random();
        number= random.nextInt(100) + 1; // Generate a random number between 1 and 100.
        tries = 0;
        hasGuessedCorrectly = false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            tries++;

            if (userGuess == number) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + tries + " tries.");
            } else if (userGuess < number) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
  public class Game{
    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.play();
    }
}
}



