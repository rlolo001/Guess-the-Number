
import java.util.Random;
import java.util.Scanner;

public class GuessUsingWhile {
    public static void main(String[] args) {
        int answer ;
        int guess = 0;
        int maxAttempts = 0;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        answer = generator.nextInt(100) + 1;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Enter your guess (0 to quit):");

        {
            while (guess != answer && maxAttempts < 7) {
                guess = scan.nextInt();
                if (guess == answer) {
                    System.out.println("Correct!");
                } else if (guess < answer) {
                    System.out.println("Too Low.");
                } else {
                    System.out.println("Too High.");
                }
                maxAttempts++;

// When guessing using an algorithm (divide and conquer) start at half of the guessing number
            }
            if (maxAttempts == 7) {
                System.out.println("Game Over!");
            }
        }
    }
}
