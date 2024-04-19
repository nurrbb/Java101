import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = input.nextInt();

        boolean result = isPrime(value, 2);
        if (result) {
            System.out.println(value + " is a prime number.");
        } else {
            System.out.println(value + " is not a prime number.");
        }
    }
}