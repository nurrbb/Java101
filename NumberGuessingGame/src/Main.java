import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("Too mamy wrong guess. Remain guess : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Next time you make a wrong guess, it will be deducted from your rights.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congrats! Your guess is right. Number : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You enter something wrong !");
                if (selected > number) {
                    System.out.println(selected + " is grater than secret number.");
                } else {
                    System.out.println(selected + " is smaller than secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remain try : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost. Sorry ! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }

    }
}
