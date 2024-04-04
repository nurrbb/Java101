import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers until a single number is entered:");
        while (true) {
            int number = scanner.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }

            if (number % 2 != 0) {
                break;
            }
        }

        System.out.println("Sum of the entered even and multiples of 4 numbers: " + sum);

        scanner.close();

    }
    }
