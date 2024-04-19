import java.util.Scanner;

public class Main {
    static int exp(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        else {
            return base * exp(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter base number: ");
        int base =input.nextInt();
        System.out.print("Please enter the exponent: ");
        int expo = input.nextInt();
        int result = exp(base,expo);
        System.out.println(result);
    }
}