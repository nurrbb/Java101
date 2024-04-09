// This program takes N integers entered from the keyboard in Java,
// finds the largest and smallest numbers among them, and prints them to the screen.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int n= input.nextInt();

        while (n<=0){
            System.out.print("Please enter positive number:");
            n=input.nextInt();
        }


        int max =Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        System.out.println("Enter your values.");
        for (int i=0; i<n;i++){
            int num = input.nextInt();
            if (num > min) {
                min = num;
            }
            if (num < max) {
                max = num;
            }
        }
        System.out.println("Largest Num: " + min);
        System.out.println("Smallest Num: " + max);

    }
}