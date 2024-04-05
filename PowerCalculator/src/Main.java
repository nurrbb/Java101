import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, e;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        n = input.nextInt();
        System.out.print("Enter the exponent ");
        e = input.nextInt();
        int total=1;

        for (int i = 1; i <= e; i++) {
            total*=n;
        }
        System.out.println("pow("+n+","+e+")"+" = "+total);
    }
}
