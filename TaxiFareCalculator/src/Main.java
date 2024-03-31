import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance: ");
        km = input.nextInt();
        total = (km*2.20) + 10;
        total = (total<20) ? 20: total;

        System.out.println("Amount to be paid: "+total);

    }
}