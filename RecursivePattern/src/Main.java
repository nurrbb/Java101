import java.util.Scanner;

public class Main {
    static void modifyNumber(int n, int original) {
        if (n <= 0 && n + 5 > original) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        if (n > 0) {
            modifyNumber(n - 5, original);
        } else {
            modifyNumber(n + 5, original);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = scanner.nextInt();
        modifyNumber(value, value);
    }
}
