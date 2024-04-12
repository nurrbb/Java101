//This Java program takes an input from the user to determine
// the number of rows and uses loops to print an inverted triangle using asterisks (*).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int row = input.nextInt();
        int numberOfStars = 2 * row - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfStars -= 2;
        }


    }
    }
