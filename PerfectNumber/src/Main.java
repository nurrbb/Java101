// This program checks whether a number entered from the keyboard
// is a perfect number or not, and prints "It is a perfect number.
// " if the number is perfect, otherwise prints "It is not a perfect number."

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = input.nextInt();
        int sum=0;


        for (int i=1; value>i;i++){
            if(value%i ==0){
                sum+=i;
            }
        }
        if (sum==value){
            System.out.println(value+" is a perfect number.");
        }
        else {
            System.out.println(value+" is not a perfect number.");
        }

    }
}