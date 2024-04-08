//This program calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two given numbers
//and displays the results.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int smaller;
        int ebob = 1;
        int i = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Please enter number2: ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            smaller = num1;
        } else {
            smaller = num2;
        }

        int k = smaller;

        while (i <= smaller) {
            if (num1 % i == 0 && num2 % i == 0) {

                System.out.print(ebob + " ");
                ebob = i;
            }
            i++;
        }

        while (k >= 1) {
            if (num1 % k == 0 && num2 % k == 0) {
                ebob = k;
                System.out.print(ebob);
                break;
            }
            k--;
        }


        while (i<=(num1*num2)){
            if (i%num1==0 && i%num2==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println((num1*num2)/ebob);
    }
}