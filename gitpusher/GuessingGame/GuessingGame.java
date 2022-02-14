package GuessingGame;

import java.util.*;

class GuessingGame {
    private static Random rd = new Random();
    public static Scanner sc = new Scanner(System.in);


    private static void guessingGame() {
        int secret = Math.abs(rd.nextInt() % 100 + 1);

        System.out.println("Welcome to my Guessing Game. Please choose a number between 1-100: ");

        for (int i = 1; i <= 5; i++) {
            int guess = handleInput();

            System.out.println(String.format("Your Guess Was: %d", guess));

            if (Math.abs(secret - guess) <= 10) {
                System.out.println(String.format("Good guess! The number was %d", secret));
                System.exit(0);
            } else if (i < 5) {
                System.out.println("You were not close enough. Please guess another number between 1-100: ");
            } else {
                System.out.println("Better luck next time. Out of guesses.");
            }
        }
    }

    private static int handleInput() {
        int inp = sc.nextInt();

        if (inp > 100 || inp < 0) {
            System.out.println("Number must be between 1-100");
            return handleInput();
        }

        return inp;

    }

    public static void main(String[] args) {
        guessingGame();
    }
}
