import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rN = random.nextInt(100) + 1;
        int a= 0;
        int uG;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number b/w 1 and 100.");

        while (true) {
            System.out.print("Enter your Number: ");
            uG = scanner.nextInt();
            a++;

            if (uG == rN) {
                System.out.println("Congratulations! You guessed the number " + rN + " in " + a+ " attempts.");
                break;
            } else if (uG < rN) {
                System.out.println("Enter higher number.");
            } else {
                System.out.println("Enter lower number.");
            }
        }

    }
}
