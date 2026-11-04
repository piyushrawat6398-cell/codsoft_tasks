import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("==============================");
        System.out.println("   NUMBER GUESSING GAME");
        System.out.println("==============================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have 7 attempts!");

        while (attempts < maxAttempts) {

            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == number) {

                System.out.println("Congratulations! Correct guess!");
                System.out.println("Attempts used: " + attempts);
                break;

            } else if (guess < number) {

                System.out.println("Too Low! Try a higher number.");

            } else {

                System.out.println("Too High! Try a lower number.");
            }

            System.out.println("Attempts remaining: "
                    + (maxAttempts - attempts));
        }

        if (attempts == maxAttempts && guess != number) {
            System.out.println("\nGame Over!");
            System.out.println("Correct number was: " + number);
        }

        sc.close();
    }
}

