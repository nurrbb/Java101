import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        temperature = input.nextInt();

        if (temperature <= -10) {
            System.out.println("You can go skiing.");
        }
        if (temperature <= 5) {
            System.out.println("You can play snowball.");
        }
        if (temperature > 5 && temperature <= 15) {
            System.out.println("You can go camping.");
        }
        if (temperature > 15 && temperature <= 20) {
            System.out.println("You can go hiking.");
        }
        if (temperature < 25 && temperature > 10) {
            System.out.println("You can have a picnic.");
        }
        if (temperature > 25) {
            System.out.println("You can go swimming.");
        }


    }
}