import java.util.*;

class Game {
    int computer;

    public Game() {
        Random random_number = new Random();
        computer = random_number.nextInt(100);
        System.out.println("Guess Any Number In Between 1 to 100 : ");
    }

    public int computerNo() {
        return computer;
    }
}

public class Number_Game {
    static int takeUserInput() {
        int user_input;
        System.out.println("Enter Your Guessed Number: ");
        Scanner sc = new Scanner(System.in);
        user_input = sc.nextInt();
        return user_input;
    }

    static void compareNumber(int Number1, int Number2) {
        if (Number1 == Number2) {
            System.out.println("You Guessed The Correct Number: ");
        } else if (Number1 > Number2) {
            System.out.println("Your Guessed Number is Bigger than computer Generated Number.");
        } else {
            System.out.println("Your Guessed Number is Smaller than computer Generated Number.");
        }
    }

    public static void main(String[] args) {
        int user_input = 0, computer_guess = 0, Steps_taken = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How much steps to guess the number: ");
        int Steps_limit = sc.nextInt();
        Game g = new Game();
        do {
            user_input = takeUserInput();
            computer_guess = g.computerNo();
            compareNumber(user_input, computer_guess);
            Steps_taken++;
        } while (user_input != computer_guess && Steps_limit != Steps_taken);

        if (user_input != computer_guess) {
            System.out.println("SORRY! You're Unable to find the Number in the Given Steps limit.");
        } else {
            System.out.println("YOU GUESS THE CORRECT NUMBER IN " + Steps_taken + " STEPS");
        }
    }
}