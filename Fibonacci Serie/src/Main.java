import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int numberOfElements = scanner.nextInt();

        int first = 0, second = 1, next;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < numberOfElements; i++) {
            next = first + second;

            first = second;
            second = next;
        }
    }
    }