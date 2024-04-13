import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the limit number: ");
        int value = scanner.nextInt();

        for (int num = 2; num <= value; num++) {
            boolean prime = true;

            if (num == 2) {
                prime = true;
            } else if (num % 2 == 0) {
                prime = false;
            } else {
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }
    }

}